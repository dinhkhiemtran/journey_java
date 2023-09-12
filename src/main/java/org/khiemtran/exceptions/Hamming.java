package org.khiemtran.exceptions;

import java.util.stream.IntStream;

public class Hamming {
  private final String leftStrand;
  private final String rightStrand;

  public Hamming(String leftStrand, String rightStrand) {
    this.leftStrand = leftStrand;
    this.rightStrand = rightStrand;
    int lengthOfLeftStrand = leftStrand.length();
    int lengthOfRightStrand = rightStrand.length();
    if (lengthOfLeftStrand > lengthOfRightStrand && lengthOfRightStrand != 0 || lengthOfLeftStrand < lengthOfRightStrand && lengthOfLeftStrand != 0)
      throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    if (leftStrand.isEmpty() && lengthOfRightStrand != 0)
      throw new IllegalArgumentException("left strand must not be empty.");
    if (rightStrand.isEmpty() && lengthOfLeftStrand != 0)
      throw new IllegalArgumentException("right strand must not be empty.");
  }

  public int getHammingDistance() {
    return (int) IntStream.range(0, leftStrand.length())
        .filter(e -> leftStrand.charAt(e) != rightStrand.charAt(e))
        .count();
  }
}
