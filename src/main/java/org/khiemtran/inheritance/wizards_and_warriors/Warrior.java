package org.khiemtran.inheritance.wizards_and_warriors;

public class Warrior extends Fighter {

  @Override
  int damagePoints(Fighter wizard) {
    int DAMAGE_NOT_VULNERABLE = 6;
    int DAMAGE_VULNERABLE = 10;
    return wizard.isVulnerable() ? DAMAGE_VULNERABLE : DAMAGE_NOT_VULNERABLE;
  }

  @Override
  public String toString() {
    return super.toString() + getClass().getSimpleName();
  }
}
