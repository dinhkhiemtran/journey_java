package org.khiemtran.strings;

import java.util.ArrayList;
import java.util.List;

public class LargestSeriesProductCalculator {
  private final String intputNumber;

  LargestSeriesProductCalculator(String inputNumber) {
    if (inputNumber.chars().anyMatch(Character::isLetter)) {
      throw new IllegalArgumentException("String to search may only contain digits.");
    }
    this.intputNumber = inputNumber.trim();
  }

  long calculateLargestProductForSeriesLength(int numberOfDigits) {
    if (numberOfDigits < 0) {
      throw new IllegalArgumentException("Series length must be non-negative.");
    }
    if (intputNumber.length() < numberOfDigits) {
      throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    }
    List<Long> result = new ArrayList<>();
    for (int i = 0; i < intputNumber.length() - numberOfDigits + 1; i++) {
      long multiple = 1;
      for (int j = 0; j < numberOfDigits; j++) {
        multiple *= Character.getNumericValue(intputNumber.charAt(i + j));
      }
      result.add(multiple);
    }
    return result.stream().mapToLong(Long::longValue).max().orElse(0);
  }
}