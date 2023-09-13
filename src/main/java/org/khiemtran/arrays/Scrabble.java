package org.khiemtran.arrays;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {
  private static final String REGEX = "\\W\\s";
  private static final Map<Integer, Integer> words = new HashMap<>();
  private final String word;

  static {
    "A, E, I, O, U, L, N, R, S, T".trim().toLowerCase().replaceAll(REGEX, "")
        .chars()
        .forEach(word -> words.put(word, 1));
    "D, G".toLowerCase().replaceAll(REGEX, "")
        .chars()
        .forEach(word -> words.put(word, 2));
    "B, C, M, P".toLowerCase().replaceAll(REGEX, "")
        .chars()
        .forEach(word -> words.put(word, 3));
    "F, H, V, W, Y".toLowerCase().replaceAll(REGEX, "")
        .chars()
        .forEach(word -> words.put(word, 4));
    "K".toLowerCase().replaceAll(REGEX, "")
        .chars()
        .forEach(word -> words.put(word, 5));
    "J, X".toLowerCase().replaceAll(REGEX, "")
        .chars()
        .forEach(word -> words.put(word, 8));
    "Q, Z".toLowerCase().replaceAll(REGEX, "")
        .chars()
        .forEach(word -> words.put(word, 10));
  }

  public Scrabble(String word) {
    this.word = word.trim().toLowerCase();
  }

  int getScore() {
    return word
        .chars()
        .filter(words::containsKey)
        .map(words::get)
        .sum();
  }
}
