package org.khiemtran.strings;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Proverb {
  private final String[] words;

  public Proverb(String[] words) {
    this.words = words;
  }

  String recite() {
    return words.length == 0 ? ""
        : IntStream.range(0, words.length - 1)
        .mapToObj(index -> String.format("For want of a %s the %s was lost.\n", words[index], words[index + 1]))
        .collect(Collectors.joining("", "", "And all for the want of a " + words[0] + "."));
  }
}
