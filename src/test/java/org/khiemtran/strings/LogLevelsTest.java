package org.khiemtran.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LogLevelsTest {
  @Test
  public void message_with_leading_and_trailing_white_space() {
    Assertions.assertEquals("Timezone not set", LogLevels.message("[WARNING]:   \tTimezone not set  \r\n"));
  }

  @Test
  public void info_message() {
    Assertions.assertEquals("File moved", LogLevels.message("[INFO]: File moved"));
  }

  @Test
  public void error_message() {
    Assertions.assertEquals("Stack overflow", LogLevels.message("[ERROR]: Stack overflow"));
  }

  @Test
  public void reformat_with_leading_and_trailing_white_space() {
    Assertions.assertEquals("Corrupt disk (error)", LogLevels.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"));
  }

  @Test
  public void info_log_level() {
    Assertions.assertEquals("info", LogLevels.logLevel("[INFO]: Timezone changed"));
  }

  @Test
  public void error_reformat() {
    Assertions.assertEquals("Segmentation fault (error)", LogLevels.reformat("[ERROR]: Segmentation fault"));
  }

  @Test
  public void error_log_level() {
    Assertions.assertEquals("error", LogLevels.logLevel("[ERROR]: Disk full"));
  }

  @Test
  public void info_reformat() {
    Assertions.assertEquals("Disk defragmented (info)", LogLevels.reformat("[INFO]: Disk defragmented"));
  }

  @Test
  public void warning_reformat() {
    Assertions.assertEquals("Decreased performance (warning)", LogLevels.reformat("[WARNING]: Decreased performance"));
  }

  @Test
  public void warning_log_level() {
    Assertions.assertEquals("warning", LogLevels.logLevel("[WARNING]: Unsafe password"));
  }

  @Test
  public void warning_message() {
    Assertions.assertEquals("Disk almost full", LogLevels.message("[WARNING]: Disk almost full"));
  }
}