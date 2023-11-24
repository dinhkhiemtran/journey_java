package org.khiemtran.conditionals;

public class Bob {

  private static final String RESPONDS_IF_SILENCE = "Fine. Be that way!";

  private static final String RESPONSE_IF_ASK = "Sure.";
  private static final String RESPONSE_IF_YELL_AT = "Whoa, chill out!";

  private static final String RESPONSE_IF_ASK_AND_YELL_AT = "Calm down, I know what I'm doing!";
  private static final String RESPONSE_IF_ANYTHING = "Whatever.";

  String hey(String input) {
    String inputTrim = input.trim();
    return inputTrim.isEmpty() ? RESPONDS_IF_SILENCE
        : isQuestionAndIsYell(inputTrim) ? RESPONSE_IF_ASK_AND_YELL_AT
        : isQuestion(inputTrim) ? RESPONSE_IF_ASK
        : isYellAtHim(inputTrim) ? RESPONSE_IF_YELL_AT
        : RESPONSE_IF_ANYTHING;
  }

  private boolean isQuestion(String input) {
    return input.endsWith("?");
  }

  private boolean isYellAtHim(String input) {
    return input.equals(input.toUpperCase()) && input.chars().anyMatch(Character::isLetter);
  }

  private boolean isQuestionAndIsYell(String input) {
    return isQuestion(input) && isYellAtHim(input);
  }
}
