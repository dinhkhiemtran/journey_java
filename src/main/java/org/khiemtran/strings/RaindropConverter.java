package org.khiemtran.strings;

import java.util.HashMap;
import java.util.Map;

public class RaindropConverter {
  private static final Map<Integer, String> maps = new HashMap<>();

  static {
    maps.put(3, "Pling");
    maps.put(5, "Plang");
    maps.put(7, "Plong");
  }

  public String convert(int number) {
    StringBuilder stringBuilder = new StringBuilder();
    maps.forEach((k, v) -> {
      if (number % k == 0) {
        stringBuilder.append(maps.get(k));
      }
    });
    return stringBuilder.isEmpty()
        ? stringBuilder.append(number).toString()
        : stringBuilder.toString();
  }
}
