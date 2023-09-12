package org.khiemtran.numbers;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarsAssemble {
  private static final int PRODUCED_EACH_HOUR = 221;
  private static final int PER_MINUTE = 60;
  private final Map<Integer, Double> SUCCESS_RATE;

  public CarsAssemble() {
    SUCCESS_RATE = IntStream
        .rangeClosed(0, 10)
        .boxed()
        .collect(Collectors.toMap(
            key -> key,
            value -> value <= 4 ? 1.0 :
                value <= 8 ? 0.9 :
                    value == 9 ? 0.8 :
                        0.77,
            (existing, replacement) -> existing,
            HashMap::new
        ));
  }

  public double productionRatePerHour(int speed) {
    return PRODUCED_EACH_HOUR * speed * SUCCESS_RATE.get(speed);
  }

  public int workingItemsPerMinute(int speed) {
    return (int) productionRatePerHour(speed) / PER_MINUTE;
  }
}
