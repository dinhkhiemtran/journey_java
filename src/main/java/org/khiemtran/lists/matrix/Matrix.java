package org.khiemtran.lists.matrix;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Matrix {
  private final int rows;
  private final int cols;
  private final int[] rowsMax;
  private final int[] colsMin;

  public Matrix(List<List<Integer>> values) {
    this.rows = values.size();
    this.cols = rows > 0 ? values.get(0).size() : 0;
    this.rowsMax = values.stream()
        .mapToInt(row -> row.stream()
            .mapToInt(Integer::intValue)
            .max().orElseThrow()).toArray();
    this.colsMin = IntStream.range(0, cols)
        .map(col -> IntStream.range(0, rows)
            .map(el -> values.get(el).get(col)).min()
            .orElseThrow()).toArray();
  }

  public Set<MatrixCoordinate> getSaddlePoints() {
    return IntStream.range(0, rows).boxed()
        .flatMap(row -> IntStream.range(0, cols)
            .filter(col -> rowsMax[row] == colsMin[col])
            .mapToObj(col -> new MatrixCoordinate(row + 1, col + 1)))
        .collect(Collectors.toSet());
  }
}
