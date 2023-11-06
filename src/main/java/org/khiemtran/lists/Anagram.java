package org.khiemtran.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Anagram {

  private final String word;
  private final String origin;

  public Anagram(String word) {
    this.origin = word;
    this.word = sorting(word).toLowerCase();
  }

  public List<String> match(List<String> candidates) {
    return candidates.stream()
        .filter(el -> word.equalsIgnoreCase(sorting(el)))
        .filter(el -> !origin.equalsIgnoreCase(el))
        .collect(Collectors.toList());
  }

  public String sorting(String word) {
    List<String> words = new ArrayList<>(Arrays.asList(word.toLowerCase().split("")));
    Collections.sort(words);
    return String.join("", words);
  }
}
