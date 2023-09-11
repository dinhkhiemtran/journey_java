package org.khiemtran.exceptions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HammingTest {
  @Test
  public void testNoDistanceBetweenEmptyStrands() {
    Assertions.assertEquals(0, new Hamming("", "").getHammingDistance());
  }

  @Test
  public void testNoDistanceBetweenShortIdenticalStrands() {
    Assertions.assertEquals(0, new Hamming("A", "A").getHammingDistance());
  }

  @Test
  public void testCompleteDistanceInSingleLetterDifferentStrands() {
    Assertions.assertEquals(1, new Hamming("G", "T").getHammingDistance());
  }

  @Test
  public void testDistanceInLongIdenticalStrands() {
    Assertions.assertEquals(0, new Hamming("GGACTGAAATCTG", "GGACTGAAATCTG").getHammingDistance());
  }

  @Test
  public void testDistanceInLongDifferentStrands() {
    Assertions.assertEquals(9, new Hamming("GGACGGATTCTG", "AGGACGGATTCT").getHammingDistance());
  }

  @Test
  public void testValidatesFirstStrandNotLonger() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Hamming("AATG", "AAA"), "leftStrand and rightStrand must be of equal length.");
  }

  @Test
  public void testValidatesSecondStrandNotLonger() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Hamming("ATA", "AGTG"), "leftStrand and rightStrand must be of equal length.");
  }

  @Test
  public void testDisallowLeftEmptyStrand() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Hamming("", "G"), "left strand must not be empty.");
  }

  @Test
  public void testDisallowRightEmptyStrand() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Hamming("G", ""), "right strand must not be empty.");
  }
}