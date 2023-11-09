package org.khiemtran.arrays;

import java.util.Arrays;

public class ResistorColor {

  int colorCode(String color) {
    return Arrays.asList(colors()).indexOf(color);
  }

  static String[] colors() {
    return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
  }
}
