package org.khiemtran.basic;

public class Lasagna {
  private static final int MINUTES_IN_OVEN = 40;
  private static final int MINUTES_TO_PREPARE = 2;

  public int expectedMinutesInOven() {
    return MINUTES_IN_OVEN;
  }

  public int remainingMinutesInOven(int actualMinutes) {
    return MINUTES_IN_OVEN - actualMinutes;
  }

  public int preparationTimeInMinutes(int numberOfLayers) {
    return numberOfLayers * MINUTES_TO_PREPARE;
  }

  public int totalTimeInMinutes(int numberOfLayers, int actualMinutes) {
    return preparationTimeInMinutes(numberOfLayers) + actualMinutes;
  }
}
