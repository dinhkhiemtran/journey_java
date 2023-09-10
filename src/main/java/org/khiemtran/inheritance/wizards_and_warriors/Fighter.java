package org.khiemtran.inheritance.wizards_and_warriors;

public abstract class Fighter {
  boolean isVulnerable() {
    return false;
  }

  abstract int damagePoints(Fighter fighter);

  @Override
  public String toString() {
    return "Fighter is a ";
  }
}
