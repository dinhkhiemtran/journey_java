package org.khiemtran.inheritance.wizards_and_warriors;

public class Warrior extends Fighter {
  private static int DAMAGE_VULNERABLE = 10;
  private static int DAMAGE_NOT_VULNERABLE = 6;

  @Override
  int damagePoints(Fighter wizard) {
    return wizard.isVulnerable() ? DAMAGE_VULNERABLE : DAMAGE_NOT_VULNERABLE;
  }

  @Override
  public String toString() {
    return super.toString() + getClass().getSimpleName();
  }
}
