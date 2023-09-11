package org.khiemtran.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

class GigaSecondTest {
  private GigaSecond gigaSecond;

  @Test
  public void withFullTimeSpecified() {
    gigaSecond = new GigaSecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0));
    Assertions.assertEquals(LocalDateTime.of(2046, Month.OCTOBER, 2, 23, 46, 40), gigaSecond.getDateTime());
  }

  @Test
  public void modernTime() {
    gigaSecond = new GigaSecond(LocalDate.of(2011, Month.APRIL, 25));
    Assertions.assertEquals(LocalDateTime.of(2043, Month.JANUARY, 1, 1, 46, 40), gigaSecond.getDateTime());
  }

  @Test
  public void beforeEpochTime() {
    gigaSecond = new GigaSecond(LocalDate.of(1959, Month.JULY, 19));
    Assertions.assertEquals(gigaSecond.getDateTime(), LocalDateTime.of(1991, Month.MARCH, 27, 1, 46, 40));
  }

  @Test
  public void afterEpochTime() {
    gigaSecond = new GigaSecond(LocalDate.of(1977, Month.JUNE, 13));
    Assertions.assertEquals(gigaSecond.getDateTime(), LocalDateTime.of(2009, Month.FEBRUARY, 19, 1, 46, 40));
  }

  @Test
  public void withFullTimeSpecifiedAndDayRollover() {
    gigaSecond = new GigaSecond(LocalDateTime.of(2015, Month.JANUARY, 24, 23, 59, 59));
    Assertions.assertEquals(LocalDateTime.of(2046, Month.OCTOBER, 3, 1, 46, 39), gigaSecond.getDateTime());
  }
}