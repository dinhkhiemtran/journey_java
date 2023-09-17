package org.khiemtran.chars;

import java.util.stream.Collectors;

public class RotationalCipher {
  private final int shiftKey;

  public RotationalCipher(int shiftKey) {
    this.shiftKey = shiftKey;
  }

  public String rotate(String data) {
    return data.chars()
        .mapToObj(this::rotate)
        .map(Object::toString)
        .collect(Collectors.joining());
  }

  private Character rotate(int ch) {
    if (Character.isAlphabetic(ch)) {
      char start = Character.isUpperCase(ch) ? 'A' : 'a';
      int LETTERS_IN_ALPHABET = 26;
      ch = (ch - start + shiftKey) % LETTERS_IN_ALPHABET + start;
    }
    return (char) ch;
  }
}
