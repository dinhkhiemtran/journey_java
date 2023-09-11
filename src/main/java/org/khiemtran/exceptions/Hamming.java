package org.khiemtran.exceptions;

import java.util.stream.IntStream;

public class Hamming {
  private static String EQUAL_LENGTH = "leftStrand and rightStrand must be of equal length.";
  private static String LEFT_NOT_BE_EMPTY = "left strand must not be empty.";
  private static String RIGHT_NOT_BE_EMPTY = "right strand must not be empty.";
  private String leftStrand;
  private String rightStrand;

  private int lengthOfLeftStrand;

  private int lengthOfRightStrand;

  public Hamming(String leftStrand, String rightStrand) {
    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;
    this.lengthOfLeftStrand = leftStrand.length();
    this.lengthOfRightStrand = rightStrand.length();
    if (lengthOfLeftStrand > lengthOfRightStrand && lengthOfRightStrand != 0 || lengthOfLeftStrand < lengthOfRightStrand && lengthOfLeftStrand != 0)
      throw new IllegalArgumentException(EQUAL_LENGTH);
    if (leftStrand.isEmpty() && lengthOfRightStrand != 0)
      throw new IllegalArgumentException(LEFT_NOT_BE_EMPTY);
    if (rightStrand.isEmpty() && lengthOfLeftStrand != 0)
      throw new IllegalArgumentException(RIGHT_NOT_BE_EMPTY);
  }

  public int getHammingDistance() {
    return (int) IntStream.range(0, lengthOfLeftStrand)
        .filter(e -> leftStrand.charAt(e) != rightStrand.charAt(e))
        .count();
  }
}
