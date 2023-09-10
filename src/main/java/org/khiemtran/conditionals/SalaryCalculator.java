package org.khiemtran.conditionals;

public class SalaryCalculator {
  private static int BASE_SALARY = 1000;
  private static int PRODUCTS = 20;
  private static double CAPPED = 2000.0d;
  private static double PENALTY = 0.15d;
  private static double SALARY = 1.0d;

  public double multiplierPerDaysSkipped(int daysSkipped) {
    return daysSkipped > 5 ? SALARY - PENALTY : SALARY;
  }

  public int multiplierPerProductsSold(int productsSold) {
    return productsSold > PRODUCTS ? 13 : 10;
  }

  public double bonusForProductSold(int productsSold) {
    return productsSold * multiplierPerProductsSold(productsSold);
  }

  public double finalSalary(int daysSkipped, int productsSold) {
    double totalSalary = (BASE_SALARY * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold));
    return (totalSalary > CAPPED) ? CAPPED : totalSalary;
  }
}
