package org.khiemtran.randomness;

import java.util.Random;

public class CaptainsLog {
  private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};
  private static final String REGISTRY = "NCC-";
  private static final int MIN_NUMBER = 1000;
  private static final int MAX_NUMBER = 9999;

  private static final double MIN_STARDATES = 41000.0d;
  private static final double MAX_STARDATES = 42000.0d;

  private Random random;

  CaptainsLog(Random random) {
    this.random = random;
  }

  char randomPlanetClass() {
    int rand = random.nextInt(PLANET_CLASSES.length);
    return PLANET_CLASSES[rand];
  }

  String randomShipRegistryNumber() {
    int rand = random.nextInt(MAX_NUMBER - MIN_NUMBER) + MIN_NUMBER;
    return REGISTRY + rand;
  }

  double randomStardate() {
    return random.nextDouble(MAX_STARDATES - MIN_STARDATES) + MIN_STARDATES;
  }
}
