package org.khiemtran.enums.logs;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLine {
  private final static String REGEX = "\\W([A-Z]+)\\W+(.+)";
  private final Matcher matcher;
  private static final Map<String, LogLevel> logs = new HashMap<>();

  static {
    logs.put("INF", LogLevel.INFO);
    logs.put("ERR", LogLevel.ERROR);
    logs.put("TRC", LogLevel.TRACE);
    logs.put("DBG", LogLevel.DEBUG);
    logs.put("WRN", LogLevel.WARNING);
    logs.put("FTL", LogLevel.FATAL);
    logs.put("UNK", LogLevel.UNKNOWN);
  }

  public LogLine(String logLine) {
    Pattern pattern = Pattern.compile(REGEX);
    matcher = pattern.matcher(logLine);
  }

  public LogLevel getLogLevel() {
    if (matcher.matches()) {
      if (logs.containsKey(matcher.group(1))) {
        return logs.get(matcher.group(1));
      }
    }
    return LogLevel.UNKNOWN;
  }

  public String getOutputForShortLog() {
    return switch (getLogLevel()) {
      case UNKNOWN, TRACE, DEBUG, INFO, WARNING, ERROR, FATAL ->
          String.format("%s:%s", this.getLogLevel().getShortFormat(), matcher.group(2));
    };
  }
}
