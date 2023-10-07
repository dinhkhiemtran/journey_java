package org.khiemtran.strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PigLatinTranslator {
  private final static String RULE_1_REGEX = "^(xr|yt|[aoeui])\\w+$";
  private final static String RULE_2_REGEX = "^([^aoeui]+)(\\w+)$";
  private final static String RULE_3_REGEX = "^([^aoueui]*qu)(.*)$";
  private final static String RULE_4A_REGEX = "^([^aoueui]+)(y.*)$";
  private final static String RULE_4B_REGEX = "^(.)(y)$";
  private final static String SOUND = "ay";
  private Matcher matcher;

  public String translate(String word) {
    return Arrays.stream(word.split("\\s"))
        .map(this::applyRules)
        .collect(Collectors.joining(" "));
  }

  private String applyRules(String word) {
    if (isMatchRule1(word)) {
      return word + SOUND;
    }
    return isMatchRule3(word) || isMatchRule4A(word) || isMatchRule2(word) || isMatchRule4B(word)
        ? matcher.group(2) + matcher.group(1) + SOUND : word;
  }

  private boolean isMatchRule1(String word) {
    return (matcher = Pattern.compile(RULE_1_REGEX).matcher(word)).matches();
  }

  private boolean isMatchRule2(String word) {
    return (matcher = Pattern.compile(RULE_2_REGEX).matcher(word)).matches();
  }

  private boolean isMatchRule3(String word) {
    return (matcher = Pattern.compile(RULE_3_REGEX).matcher(word)).matches();
  }

  private boolean isMatchRule4A(String word) {
    return (matcher = Pattern.compile(RULE_4A_REGEX).matcher(word)).matches();
  }

  private boolean isMatchRule4B(String word) {
    return (Pattern.compile(RULE_4B_REGEX).matcher(word)).matches();
  }
}
