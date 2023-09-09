package org.khiemtran.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {
  private static Pattern pattern = Pattern.compile("(\\w+)\\]\\:(.[^\\\\]+)");

  public static String message(String logLine) {
    Matcher matcher = pattern.matcher(logLine);
    return matcher.find() ? matcher.group(2).trim() : "";
  }

  public static String logLevel(String logLine) {
    Matcher matcher = pattern.matcher(logLine);
    return matcher.find() ? matcher.group(1).toLowerCase().trim() : "";
  }

  public static String reformat(String logLine) {
    return String.format("%s (%s)", message(logLine), logLevel(logLine));
  }
}
