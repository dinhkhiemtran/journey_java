package org.khiemtran.randomness;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Robot {
  private static final char MIN_CHAR = 'A';
  private static final char MAX_CHAR = 'Z';
  private static final int CHAR_LENGTH = 2;
  private static final char MAX_NUMBER = '9';
  private static final char MIN_NUMBER = '0';
  private static final int NUMB_LENGTH = 3;
  private static final Set<String> usedNames = new HashSet<>();
  private String name;

  public Robot() {
    this.name = generateName();
  }

  public String getName() {
    return this.name;
  }

  public void reset() {
    this.name = generateName();
  }

  private String generateName() {
    return Stream.generate(appendRandom)
        .filter(e -> !usedNames.contains(e) && addToUsedNames(e))
        .findFirst()
        .orElse(null);
  }

  private final Supplier<String> appendRandom = () -> String.format("%s%s",
      randomName(MIN_CHAR, MAX_CHAR, CHAR_LENGTH),
      randomName(MIN_NUMBER, MAX_NUMBER, NUMB_LENGTH));

  private String randomName(char min, char max, int length) {
    return new Random()
        .ints(min, max)
        .limit(length)
        .mapToObj(ch -> String.valueOf((char) ch))
        .collect(Collectors.joining());
  }

  private static boolean addToUsedNames(String name) {
    return usedNames.add(name);
  }
}
