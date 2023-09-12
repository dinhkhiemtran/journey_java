package org.khiemtran.conditionals;

public class SalaryCalculator {

  public double multiplierPerDaysSkipped(int daysSkipped) {
    double SALARY = 1.0d;
    double PENALTY = 0.15d;
    return daysSkipped > 5 ? SALARY - PENALTY : SALARY;
  }

  public int multiplierPerProductsSold(int productsSold) {
    int PRODUCTS = 20;
    return productsSold > PRODUCTS ? 13 : 10;
  }

  public double bonusForProductSold(int productsSold) {
    return productsSold * multiplierPerProductsSold(productsSold);
  }

  public double finalSalary(int daysSkipped, int productsSold) {
    int BASE_SALARY = 1000;
    double totalSalary = (BASE_SALARY * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold));
    double CAPPED = 2000.0d;
    return Math.min(totalSalary, CAPPED);
  }
}
