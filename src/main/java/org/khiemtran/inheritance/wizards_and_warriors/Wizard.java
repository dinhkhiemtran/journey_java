package org.khiemtran.inheritance.wizards_and_warriors;

public class Wizard extends Fighter {
  private static int DAMAGE_PREPARED = 12;
  private static int DAMAGE_NOT_PREPARED = 3;
  private boolean spellPrepared = false;

  @Override
  public int damagePoints(Fighter warrior) {
    return isVulnerable() ? DAMAGE_NOT_PREPARED : DAMAGE_PREPARED;
  }

  public void prepareSpell() {
    spellPrepared = true;
  }

  @Override
  public boolean isVulnerable() {
    return !spellPrepared;
  }

  @Override
  public String toString() {
    return super.toString() + getClass().getSimpleName();
  }
}
