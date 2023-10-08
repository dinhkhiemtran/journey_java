package org.khiemtran.enums.logs;

public enum LogLevel {
  UNKNOWN(0),
  TRACE(1),
  DEBUG(2),
  INFO(4),
  WARNING(5),
  ERROR(6),
  FATAL(42);;
  private final int shortFormat;

   LogLevel(int shortFormat) {
    this.shortFormat = shortFormat;
  }

  public int getShortFormat() {
    return shortFormat;
  }
}
