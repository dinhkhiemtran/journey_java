package org.khiemtran.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class House {
  private static final String INTRO = "This is the %s";

  private static final Map<Integer, String> lyrics = new HashMap<>();

  static {
    lyrics.put(1, "house that Jack built.");
    lyrics.put(2, "malt");
    lyrics.put(3, "rat that ate the malt");
    lyrics.put(4, "cat that killed the rat that ate the malt");
    lyrics.put(5, "dog that worried the cat that killed the rat that ate the malt");
    lyrics.put(6, "cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt");
    lyrics.put(7, "maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt");
    lyrics.put(8, "man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt");
    lyrics.put(9, "priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt");
    lyrics.put(10, "rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt");
    lyrics.put(11, "farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt");
    lyrics.put(12, "horse and the hound and the horn that belonged to the farmer sowing his corn that kept the rooster that crowed in the morn that woke the priest all shaven and shorn that married the man all tattered and torn that kissed the maiden all forlorn that milked the cow with the crumpled horn that tossed the dog that worried the cat that killed the rat that ate the malt");
  }

  String verse(int verse) {
    return String.format(INTRO, verse == 1 ?
        lyrics.get(1)
        : lyrics.get(verse).concat(" that lay in the ").concat(lyrics.get(1)));
  }

  String verses(int startVerse, int endVerse) {
    return IntStream.range(startVerse, endVerse + 1)
        .mapToObj(this::verse)
        .collect(Collectors.joining("\n"));
  }

  String sing() {
    return verses(1, lyrics.size());
  }
}
