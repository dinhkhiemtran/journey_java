package org.khiemtran.conditionals;

import java.util.HashMap;
import java.util.Map;

public class Darts {
  private static final Double INNER_CIRCLE = 10.0;
  private static final Double MIDDLE_CIRCLE = 5.0;
  private static final Double OUTER_CIRCLE = 1.0;
  private static final Map<Double, Integer> scores = new HashMap<>();

  static {
    scores.put(OUTER_CIRCLE, 10);
    scores.put(MIDDLE_CIRCLE, 5);
    scores.put(INNER_CIRCLE, 1);
  }

  public int score(double xOfDart, double yOfDart) {
    double distance = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
    if (distance <= OUTER_CIRCLE) {
      return scores.get(OUTER_CIRCLE);
    } else if (distance <= MIDDLE_CIRCLE) {
      return scores.get(MIDDLE_CIRCLE);
    } else if (distance <= INNER_CIRCLE) {
      return scores.get(INNER_CIRCLE);
    } else {
      return 0;
    }
  }
}
