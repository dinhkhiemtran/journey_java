package org.khiemtran.booleans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnnalynsInfiltrationTest {
  private AnnalynsInfiltration annalynsInfiltration;

  @BeforeEach
  public void init() {
    annalynsInfiltration = new AnnalynsInfiltration();
  }

  @Test
  public void can_spy_if_everyone_but_prisoner_is_sleeping() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = true;
    Assertions.assertEquals(true, annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_release_prisoner_if_only_archer_is_asleep_and_pet_dog_is_absent() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = true;
    boolean petDogIsPresent = false;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void cannot_signal_prisoner_if_archer_is_awake_and_prisoner_is_sleeping() {
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    Assertions.assertEquals(false, annalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_signal_prisoner_if_archer_and_prisoner_are_both_sleeping() {
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = false;
    Assertions.assertEquals(false, annalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_release_prisoner_if_only_knight_is_awake_and_pet_dog_is_absent() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = false;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void cannot_release_prisoner_if_everyone_is_asleep_and_pet_dog_is_absent() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = false;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void cannot_release_prisoner_if_only_prisoner_is_asleep_and_pet_dog_is_present() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = true;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_spy_if_only_knight_is_sleeping() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = true;
    Assertions.assertEquals(true, annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_release_prisoner_if_everyone_is_awake_and_pet_dog_is_absent() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = true;
    boolean petDogIsPresent = false;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_spy_if_everyone_is_awake() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = true;
    Assertions.assertEquals(true, annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void can_execute_fast_attack_if_knight_is_sleeping() {
    boolean knightIsAwake = false;
    Assertions.assertEquals(true, annalynsInfiltration.canFastAttack(knightIsAwake));
  }

  @Test
  public void can_release_prisoner_if_only_archer_is_asleep_and_pet_dog_is_present() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = true;
    boolean petDogIsPresent = true;
    Assertions.assertEquals(true, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_release_prisoner_if_everyone_is_asleep_and_pet_dog_is_present() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = true;
    Assertions.assertEquals(true, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_spy_if_only_archer_is_sleeping() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = true;
    Assertions.assertEquals(true, annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_execute_fast_attack_if_knight_is_awake() {
    boolean knightIsAwake = true;
    Assertions.assertEquals(false, annalynsInfiltration.canFastAttack(knightIsAwake));
  }

  @Test
  public void cannot_release_prisoner_if_only_archer_is_awake_and_pet_dog_is_absent() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = false;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_release_prisoner_if_only_knight_is_awake_and_pet_dog_is_present() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = true;
    Assertions.assertEquals(true, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void cannot_release_prisoner_if_only_knight_is_asleep_and_pet_dog_is_absent() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = true;
    boolean petDogIsPresent = false;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_release_prisoner_if_only_prisoner_is_awake_and_pet_dog_is_present() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = true;
    boolean petDogIsPresent = true;
    Assertions.assertEquals(true, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_release_prisoner_if_only_prisoner_is_awake_and_pet_dog_is_absent() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = true;
    boolean petDogIsPresent = false;
    Assertions.assertEquals(true, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_spy_if_only_prisoner_is_sleeping() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    Assertions.assertEquals(true, annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_release_prisoner_if_only_knight_is_asleep_and_pet_dog_is_present() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = true;
    boolean petDogIsPresent = true;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void cannot_spy_if_everyone_is_sleeping() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = false;
    Assertions.assertEquals(false, annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_release_prisoner_if_only_archer_is_awake_and_pet_dog_is_present() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = true;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_signal_prisoner_if_archer_is_sleeping_and_prisoner_is_awake() {
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = true;
    Assertions.assertEquals(true, annalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_release_prisoner_if_everyone_is_awake_and_pet_dog_is_present() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = true;
    boolean petDogIsPresent = true;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_spy_if_everyone_but_knight_is_sleeping() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = false;
    boolean prisonerIsAwake = false;
    Assertions.assertEquals(true, annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_release_prisoner_if_only_prisoner_is_asleep_and_pet_dog_is_absent() {
    boolean knightIsAwake = true;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    boolean petDogIsPresent = false;
    Assertions.assertEquals(false, annalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent));
  }

  @Test
  public void can_spy_if_everyone_but_archer_is_sleeping() {
    boolean knightIsAwake = false;
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = false;
    Assertions.assertEquals(true, annalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake));
  }

  @Test
  public void cannot_signal_prisoner_if_archer_and_prisoner_are_both_awake() {
    boolean archerIsAwake = true;
    boolean prisonerIsAwake = true;
    Assertions.assertEquals(false, annalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake));
  }
}