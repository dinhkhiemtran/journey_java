package org.khiemtran.numbers;

import java.math.BigInteger;

public class Grains {
  private static final int TOTAL_SQUARES = 64;

  public BigInteger grainsOnSquare(final int square) {
    if (square <= 0 || square >= 65)
      throw new IllegalArgumentException("square must be between 1 and 64");
    return BigInteger.valueOf(2).pow(square - 1);
  }

  public BigInteger grainsOnBoard() {
    return BigInteger.valueOf(2).pow(TOTAL_SQUARES).subtract(BigInteger.valueOf(1));
  }
}
