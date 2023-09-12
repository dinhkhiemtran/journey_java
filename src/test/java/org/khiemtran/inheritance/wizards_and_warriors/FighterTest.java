package org.khiemtran.inheritance.wizards_and_warriors;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FighterTest {
  @Test
  public void testWarriorToString() {
    Fighter warrior = new Warrior();
    Assertions.assertEquals("Fighter is a Warrior", warrior.toString());
  }

  @Test
  public void testFighterVulnerableByDefault() {
    Fighter warrior = new Warrior();
    Assertions.assertFalse(warrior.isVulnerable());
  }

  @Test
  public void testWarriorsDamagePoints() {
    Warrior warrior = new Warrior();
    Wizard wizard = new Wizard();
    Assertions.assertEquals(10, warrior.damagePoints(wizard));
    wizard.prepareSpell();
    Assertions.assertEquals(6, warrior.damagePoints(wizard));
  }

  @Test
  public void testWizardToString() {
    Wizard wizard = new Wizard();
    Assertions.assertEquals("Fighter is a Wizard", wizard.toString());
  }

  @Test
  public void testWizardsDamagePoints() {
    Wizard wizard = new Wizard();
    Warrior warrior = new Warrior();
    Assertions.assertEquals(3, wizard.damagePoints(warrior));
    wizard.prepareSpell();
    Assertions.assertEquals(12, wizard.damagePoints(warrior));
  }

  @Test
  public void testWizardVulnerable() {
    Wizard wizard = new Wizard();
    Assertions.assertTrue(wizard.isVulnerable());
    wizard.prepareSpell();
    Assertions.assertFalse(wizard.isVulnerable());
  }
}
