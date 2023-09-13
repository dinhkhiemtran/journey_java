package org.khiemtran.numbers;

import java.util.stream.IntStream;

public class DifferenceOfSquaresCalculator {
  public int computeSquareOfSumTo(int input) {
    return (int) Math.pow(IntStream.rangeClosed(0, input).sum(), 2);
  }

  public int computeSumOfSquaresTo(int input) {
    return IntStream.rangeClosed(0, input).map(numb -> (int) Math.pow(numb, 2)).sum();
  }

  public int computeDifferenceOfSquares(int input) {
    return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
  }
}
