package org.khiemtran.exceptions.calculator_conundrum;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CalculatorConundrumTest {
  @Test
  public void throwExceptionForAnEmptyStringOperation() {
    assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new CalculatorConundrum().calculate(34, 324, "")).withMessage("Operation cannot be empty");
  }
  @Test
  public void divisionWithSmallOperands() {
    assertThat(new CalculatorConundrum().calculate(72, 9, "/")).isEqualTo("72 / 9 = 8");
  }
  @Test
  public void throwExceptionForNullAsOperation() {
    assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> new CalculatorConundrum().calculate(66, 65, null)).withMessage("Operation cannot be null");
  }
  @Test
  public void throwExceptionForDivisionByZero() {
    assertThatExceptionOfType(IllegalOperationException.class).isThrownBy(() -> new CalculatorConundrum().calculate(33, 0, "/")).withMessage("Division by zero is not allowed").withCauseInstanceOf(ArithmeticException.class);
  }
  @Test
  public void divisionWithLargeOperands() {
    assertThat(new CalculatorConundrum().calculate(1_338_800, 83_675, "/")).isEqualTo("1338800 / 83675 = 16");
  }
  @Test
  public void additionWithSmallOperands() {
    assertThat(new CalculatorConundrum().calculate(22, 25, "+")).isEqualTo("22 + 25 = 47");
  }
  @Test
  public void throwExceptionForUnknownOperation() {
    String invalidOperation = "**";
    String expectedMessage = String.format("Operation '%s' does not exist", invalidOperation);
    assertThatExceptionOfType(IllegalOperationException.class).isThrownBy(() -> new CalculatorConundrum().calculate(3, 78, invalidOperation)).withMessage(expectedMessage);
  }
  @Test
  public void additionWithLargeOperands() {
    assertThat(new CalculatorConundrum().calculate(378_961, 399_635, "+")).isEqualTo("378961 + 399635 = 778596");
  }
  @Test
  public void multiplicationWithSmallOperands() {
    assertThat(new CalculatorConundrum().calculate(3, 21, "*")).isEqualTo("3 * 21 = 63");
  }
  @Test
  public void multiplicationWithLargeOperands() {
    assertThat(new CalculatorConundrum().calculate(72_441, 2_048, "*")).isEqualTo("72441 * 2048 = 148359168");
  }
  @Test
  public void minusWithLargeOperands() {
    assertThat(new CalculatorConundrum().calculate(399_635,378_961, "-")).isEqualTo("399635 - 378961 = 20674");
  }
}