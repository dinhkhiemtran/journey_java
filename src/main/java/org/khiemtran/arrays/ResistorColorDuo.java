package org.khiemtran.arrays;

import java.util.HashMap;
import java.util.Map;

public class ResistorColorDuo {
  private static final Map<String, Integer> resistors = new HashMap<>();

  static {
    resistors.put("black", 0);
    resistors.put("brown", 1);
    resistors.put("red", 2);
    resistors.put("orange", 3);
    resistors.put("yellow", 4);
    resistors.put("green", 5);
    resistors.put("blue", 6);
    resistors.put("violet", 7);
    resistors.put("grey", 8);
    resistors.put("white", 9);
  }

  int value(String[] colors) {
    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < 2; i++) {
      if (resistors.containsKey(colors[i])) {
        stringBuilder.append(resistors.get(colors[i]));
      }
    }
    return Integer.parseInt(stringBuilder.toString());
  }
}
