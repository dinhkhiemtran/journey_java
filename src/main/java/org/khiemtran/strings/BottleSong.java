package org.khiemtran.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BottleSong {
  private static final String MIDDLE_LYRICS = "And if one green bottle should accidentally fall,\n";
  private static final Map<Integer, String> LYRICS = new HashMap<>();

  static {
    LYRICS.put(10, "Ten");
    LYRICS.put(9, "Nine");
    LYRICS.put(8, "Eight");
    LYRICS.put(7, "Seven");
    LYRICS.put(6, "Six");
    LYRICS.put(5, "Five");
    LYRICS.put(4, "Four");
    LYRICS.put(3, "Three");
    LYRICS.put(2, "Two");
    LYRICS.put(1, "One");
  }

  public String recite(int startBottles, int takeDown) {
    return IntStream.iterate(startBottles, i -> i - 1)
        .limit(takeDown)
        .mapToObj(this::assembleLyrics)
        .collect(Collectors.joining("\n"));
  }

  private String assembleLyrics(int startBottles) {
    String formatBeginningLyrics = String.format("%s green bottle%s hanging on the wall,\n", LYRICS.get(startBottles),
        startBottles == 1
            ? ""
            : "s");
    String formattedEndLine = String.format("There'll be %s green bottle%s hanging on the wall.\n",
        startBottles > 1
            ? LYRICS.get(startBottles - 1).toLowerCase()
            : "no",
        startBottles - 1 != 1
            ? "s"
            : "");
    return formatBeginningLyrics + formatBeginningLyrics + MIDDLE_LYRICS + formattedEndLine;
  }
}
