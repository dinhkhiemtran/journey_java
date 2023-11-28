package org.khiemtran.arrays.food_chain;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FoodChain {
  private static final Map<Integer, Description> LYRICS = new HashMap<>();

  static {
    LYRICS.put(1, new Description("fly", "", ""));
    LYRICS.put(2,
        new Description("spider",
            "She swallowed the spider to catch the fly.",
            "It wriggled and jiggled and tickled inside her."));
    LYRICS.put(3, new Description("bird",
        "She swallowed the bird to catch the spider that wriggled and jiggled and tickled inside her.",
        "How absurd to swallow a bird!"));
    LYRICS.put(4, new Description("cat",
        "She swallowed the cat to catch the bird.",
        "Imagine that, to swallow a cat!"));
    LYRICS.put(5, new Description("dog",
        "She swallowed the dog to catch the cat.",
        "What a hog, to swallow a dog!"));
    LYRICS.put(6, new Description("goat",
        "She swallowed the goat to catch the dog.",
        "Just opened her throat and swallowed a goat!"));
    LYRICS.put(7, new Description("cow",
        "She swallowed the cow to catch the goat.",
        "I don't know how she swallowed a cow!"));
    LYRICS.put(8, new Description("horse",
        "",
        ""));
  }

  String verse(int verse) {
    StringBuilder stringBuilder = new StringBuilder();
    String startLyric = String.format("I know an old lady who swallowed a %s.", LYRICS.get(verse).getCreature());
    stringBuilder
        .append(startLyric)
        .append("\n")
        .append(LYRICS.get(verse).getConnection());
    for (int i = verse; i > 1 && i < LYRICS.size(); i--) {
      Description description = LYRICS.get(i);
      if (verse == i) {
        stringBuilder
            .append("\n")
            .append(description.getReason())
            .append("\n");
      } else {
        stringBuilder
            .append(description.getReason())
            .append("\n");
      }
    }
    return verse == LYRICS.size() ? stringBuilder.append("She's dead, of course!").toString()
        : stringBuilder.append("I don't know why she swallowed the fly. Perhaps she'll die.").toString();
  }

  String verses(int startVerse, int endVerse) {
    return IntStream.range(startVerse, endVerse + 1)
        .mapToObj(this::verse)
        .collect(Collectors.joining("\n\n"));
  }
}
