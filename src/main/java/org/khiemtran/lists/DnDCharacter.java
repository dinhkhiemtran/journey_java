package org.khiemtran.lists;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DnDCharacter {
  private final int strength;
  private final int dexterity;
  private final int constitution;
  private final int intelligence;
  private final int wisdom;
  private final int charisma;

  public DnDCharacter() {
    this.strength = ability(rollDice());
    this.dexterity = ability(rollDice());
    this.constitution = ability(rollDice());
    this.intelligence = ability(rollDice());
    this.wisdom = ability(rollDice());
    this.charisma = ability(rollDice());
  }

  int ability(List<Integer> scores) {
    int sum = scores.stream().mapToInt(Integer::intValue).sum();
    int min = scores.stream()
        .min(Integer::compareTo)  // Returns Optional<Integer>
        .orElse(Integer.MAX_VALUE);
    return sum - min;
  }

  List<Integer> rollDice() {
    return new Random()
        .ints(1, 7)
        .limit(4)
        .boxed()
        .collect(Collectors.toList());
  }

  int modifier(int input) {
    return (int) Math.floor((input - 10) / 2.0);
  }

  int getStrength() {
    return strength;
  }

  int getDexterity() {
    return dexterity;
  }

  int getConstitution() {
    return constitution;
  }

  int getIntelligence() {
    return intelligence;
  }

  int getWisdom() {
    return wisdom;
  }

  int getCharisma() {
    return charisma;
  }

  int getHitpoints() {
    return modifier(getConstitution()) + 10;
  }
}
