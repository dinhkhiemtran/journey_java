package org.khiemtran.booleans;

public class AnnalynsInfiltration {
  public boolean canFastAttack(boolean knightIsAwake) {
    return !knightIsAwake;
  }

  public boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
    return knightIsAwake || archerIsAwake || prisonerIsAwake;
  }

  public boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
    return prisonerIsAwake && !archerIsAwake;
  }

  public boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
    return canSucceedInFirstWay(petDogIsPresent, archerIsAwake) || canSucceedInSecondWay(petDogIsPresent, prisonerIsAwake, knightIsAwake, archerIsAwake);
  }

  private boolean canSucceedInFirstWay(boolean petDogIsPresent, boolean archerIsAwake) {
    return petDogIsPresent && !archerIsAwake;
  }

  private boolean canSucceedInSecondWay(boolean petDogIsPresent, boolean prisonerIsAwake, boolean knightIsAwake, boolean archerIsAwake) {
    return !petDogIsPresent && prisonerIsAwake && !knightIsAwake && !archerIsAwake;
  }
}
