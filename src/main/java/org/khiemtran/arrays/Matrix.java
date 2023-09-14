package org.khiemtran.arrays;

import java.util.Arrays;

public class Matrix {
  private final String matrixAsString;

  public Matrix(String matrixAsString) {
    this.matrixAsString = matrixAsString;
  }

  public int[] getRow(int rowNumber) {
    return Arrays.stream(matrixAsString.split("\n")[rowNumber - 1]
            .split("\\s"))
        .mapToInt(Integer::parseInt)
        .toArray();
  }

  public int[] getColumn(int columnNumber) {
    return Arrays.stream(matrixAsString.split("\n"))
        .mapToInt(str ->
            Integer.parseInt(str.split("\\s")[columnNumber - 1]))
        .toArray();
  }
}
