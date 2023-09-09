package org.khiemtran.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {
  public static String message(String logLine) {
    Pattern pattern = Pattern.compile("\\s(.[^\\\\]+)");
    Matcher matcher = pattern.matcher(logLine);
    return matcher.find() ? matcher.group(1).trim() : "";
  }

  public static String logLevel(String logLine) {
    Pattern pattern = Pattern.compile("(\\w+)");
    Matcher matcher = pattern.matcher(logLine);
    return matcher.find() ? matcher.group(1).toLowerCase().trim() : "";
  }

  public static String reformat(String logLine) {
    return String.format("%s (%s)", message(logLine), logLevel(logLine));
  }
}
