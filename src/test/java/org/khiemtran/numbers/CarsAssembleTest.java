package org.khiemtran.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CarsAssembleTest {
  private static double EPSILON = 1.1102230246251565e-16d;
  private CarsAssemble carsAssemble;

  @BeforeEach
  public void init() {
    carsAssemble = new CarsAssemble();
  }

  @Test
  public void workingItemsPerMinuteForSpeedFive() {
    Assertions.assertEquals(16, carsAssemble.workingItemsPerMinute(5));
  }

  @Test
  public void workingItemsPerMinuteForSpeedNine() {
    Assertions.assertEquals(26, carsAssemble.workingItemsPerMinute(9));
  }

  @Test
  public void workingItemsPerMinuteForSpeedZero() {
    Assertions.assertEquals(0, carsAssemble.workingItemsPerMinute(0));
  }

  @Test
  public void workingItemsPerMinuteForSpeedEight() {
    Assertions.assertEquals(26, carsAssemble.workingItemsPerMinute(8));
  }

  @Test
  public void productionRatePerHourForSpeedSeven() {
    Assertions.assertEquals(true, Math.abs(carsAssemble.productionRatePerHour(7) - 1392.3) < EPSILON);
  }

  @Test
  public void workingItemsPerMinuteForSpeedOne() {
    Assertions.assertEquals(3, carsAssemble.workingItemsPerMinute(1));
  }

  @Test
  public void workingItemsPerMinuteForSpeedTen() {
    Assertions.assertEquals(28, carsAssemble.workingItemsPerMinute(10));
  }

  @Test
  public void productionRatePerHourForSpeedOne() {
    Assertions.assertEquals(true, Math.abs(carsAssemble.productionRatePerHour(1) - 221.0) < EPSILON);
  }

  @Test
  public void productionRatePerHourForSpeedTen() {
    Assertions.assertEquals(true, Math.abs(carsAssemble.productionRatePerHour(10) - 1701.7) < EPSILON);
  }

  @Test
  public void productionRatePerHourForSpeedFour() {
    Assertions.assertEquals(true, Math.abs(carsAssemble.productionRatePerHour(4) - 884.0) < EPSILON);
  }

  @Test
  public void productionRatePerHourForSpeedNine() {
    Assertions.assertEquals(true, Math.abs(carsAssemble.productionRatePerHour(9) - 1591.2) < EPSILON);
  }

  @Test
  public void productionRatePerHourForSpeedZero() {
    Assertions.assertEquals(true, Math.abs(carsAssemble.productionRatePerHour(0) - 0.0) < EPSILON);
  }
}