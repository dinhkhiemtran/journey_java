package org.khiemtran.strings;

public class IsogramChecker {

  public boolean isIsogram(String phrase) {
    phrase = phrase.toLowerCase().replaceAll("\\s|\\-", "").trim();
    return phrase.chars().distinct().count() == phrase.length();
  }
}
