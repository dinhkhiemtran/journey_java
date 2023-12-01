package org.khiemtran.strings;

import java.util.stream.IntStream;

public class IsbnVerifier {
  private static final int LETTER_X = 10;
  private static final int ISBN_10_LENGTH = 10;
  private static final int MOD = 11;

  boolean isValid(String stringToVerify) {
    String formatString = stringToVerify.replace("-", "");
    return !stringToVerify.isEmpty() && (!isValidFormat(formatString) && isValidIsbn(formatString));
  }

  private boolean isValidFormat(String formatString) {
    int positionOfLastElement = formatString.length() - 1;
    boolean hasLetter = formatString.substring(0, positionOfLastElement).chars().anyMatch(Character::isLetter);
    boolean lastElementIsXorNonDigit = formatString.charAt(positionOfLastElement) != 'X' && !Character.isDigit(formatString.charAt(positionOfLastElement));
    boolean isOutOfLength = formatString.length() != ISBN_10_LENGTH;
    return hasLetter || lastElementIsXorNonDigit || isOutOfLength;
  }

  private boolean isValidIsbn(String formatString) {
    int sum = IntStream.range(0, formatString.length())
        .map(index -> {
          char current = formatString.charAt(index);
          return Character.isDigit(current) ?
              Character.getNumericValue(current) * (ISBN_10_LENGTH - index)
              : current == 'X'
              ? LETTER_X * (ISBN_10_LENGTH - index)
              : 0;
        }).sum();
    return sum % MOD == 0;
  }
}
