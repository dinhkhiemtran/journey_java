package org.khiemtran.strings;

public class LuhnValidator {
  boolean isValid(String candidate) {
    String formatCandidate = candidate.trim().replaceAll("\\s+", "");
    if (!formatCandidate.matches("\\d{2,}"))
      return false;
    int sum = 0;
    for (int i = formatCandidate.length() - 1; i >= 0; i--) {
      int currentDigit = formatCandidate.charAt(i) - '0';
      if ((formatCandidate.length() - i) % 2 == 0) {
        sum += processEvenPosition(currentDigit);
      } else {
        sum += currentDigit;
      }
    }
    return sum % 10 == 0;
  }

  private int processEvenPosition(int currentDigit) {
    int doubleCurrentDigit = currentDigit * 2;
    return doubleCurrentDigit > 9
        ? doubleCurrentDigit - 9
        : doubleCurrentDigit;
  }
}
