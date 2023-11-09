package org.khiemtran.strings;

public class MicroBlog {
  public static String truncate(String input) {
    return String.valueOf(input.codePoints()
        .limit(5)
        .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append));
  }
}
