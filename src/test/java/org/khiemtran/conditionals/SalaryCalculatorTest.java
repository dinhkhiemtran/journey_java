package org.khiemtran.conditionals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalaryCalculatorTest {
  private SalaryCalculator calculator;

  @BeforeEach
  public void init() {
    calculator = new SalaryCalculator();
  }

  @Test
  public void soldAboveThreshold() {
    Assertions.assertEquals(1325.0, calculator.finalSalary(0, 25));
  }

  @Test
  public void skippedBelowThresholdAndSoldAboveThreshold() {
    Assertions.assertEquals(1520.0, calculator.finalSalary(4, 40));
  }

  @Test
  public void salaryRespectMaximum() {
    Assertions.assertEquals(2000.0, calculator.finalSalary(0, 77));
  }

  @Test
  public void regularSalary() {
    Assertions.assertEquals(1000.0, calculator.finalSalary(0, 0));
  }

  @Test
  public void salaryCanReachCloseToMaximum() {
    Assertions.assertEquals(1988.0, calculator.finalSalary(0, 76));
  }

  @Test
  public void skippedAboveThresholdAndSoldBelowThreshold() {
    Assertions.assertEquals(870.0, calculator.finalSalary(10, 2));
  }

  @Test
  public void skippedBelowThreshold() {
    Assertions.assertEquals(1000.0, calculator.finalSalary(3, 0));
  }

  @Test
  public void skippedAboveThresholdAndSoldAboveThreshold() {
    Assertions.assertEquals(1500.0, calculator.finalSalary(7, 50));
  }

  @Test
  public void skippedAboveThreshold() {
    Assertions.assertEquals(850.0, calculator.finalSalary(7, 0));
  }

  @Test
  public void soldBelowThreshold() {
    Assertions.assertEquals(1100.0, calculator.finalSalary(0, 10));
  }
}