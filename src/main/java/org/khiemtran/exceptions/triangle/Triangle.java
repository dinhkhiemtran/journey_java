package org.khiemtran.exceptions.triangle;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import static java.util.Arrays.asList;

class Triangle {
  private final List<Double> sides;

  Triangle(double side1, double side2, double side3) throws TriangleException {
    Predicate<List<Double>> validTriangle = sides -> {
      double sum = sides.stream()
          .mapToDouble(Double::doubleValue)
          .sum();
      return sides.stream()
          .allMatch(side -> (sum - side > side) && side > 0);
    };
    sides = Optional.of(asList(side1, side2, side3))
        .filter(validTriangle)
        .orElseThrow(TriangleException::new);
  }

  boolean isEquilateral() {
    return sides.stream().distinct().count() == 1;
  }

  boolean isIsosceles() {
    return sides.stream().distinct().count() < 3;
  }

  boolean isScalene() {
    return sides.stream().distinct().count() == 3;
  }
}

