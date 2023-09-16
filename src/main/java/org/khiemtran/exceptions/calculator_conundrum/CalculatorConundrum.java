package org.khiemtran.exceptions.calculator_conundrum;

public class CalculatorConundrum {
  private static final String MINUS_OPERATION = "-";
  private static final String PLUS_OPERATION = "+";
  private static final String MULTIPLY_OPERATION = "*";
  private static final String DIVIDE_OPERATION = "/";

  public String calculate(int operand1, int operand2, String operation) {
    if (operation == null) throw new IllegalArgumentException("Operation cannot be null");
    if (operation.isEmpty()) throw new IllegalArgumentException("Operation cannot be empty");
    return switch (operation) {
      case PLUS_OPERATION -> plus(operand1, operand2);
      case MINUS_OPERATION -> minus(operand1, operand2);
      case MULTIPLY_OPERATION -> multiply(operand1, operand2);
      case DIVIDE_OPERATION -> divide(operand1, operand2);
      default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
    };
  }

  private String plus(int operand1, int operand2) {
    return String.format("%s + %s = %s", operand1, operand2, operand1 + operand2);
  }

  private String minus(int operand1, int operand2) {
    return String.format("%s - %s = %s", operand1, operand2, operand1 - operand2);
  }

  private String multiply(int operand1, int operand2) {
    return String.format("%s * %s = %s", operand1, operand2, operand1 * operand2);
  }

  private String divide(int operand1, int operand2) {
    try {
      return String.format("%s / %s = %s", operand1, operand2, operand1 / operand2);
    } catch (Exception e) {
      throw new IllegalOperationException("Division by zero is not allowed", new ArithmeticException());
    }
  }
}
