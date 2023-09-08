package org.khiemtran.classes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ElonsToyCarTest {
  private ElonsToyCar elonsToyCar;

  @BeforeEach
  public void init() {
    elonsToyCar = new ElonsToyCar();
  }

  @Test
  public void buy_new_car_returns_instance() {
    Assertions.assertNotNull(elonsToyCar.buy());
  }

  @Test
  public void new_car_distance_display() {
    Assertions.assertEquals("Driven 0 meters", elonsToyCar.distanceDisplay());
  }

  @Test
  public void distance_display_after_driving_once() {
    elonsToyCar.drive();
    Assertions.assertEquals("Driven 20 meters", elonsToyCar.distanceDisplay());
  }

  @Test
  public void battery_display_after_driving_once() {
    elonsToyCar.drive();
    Assertions.assertEquals("Battery at 99%", elonsToyCar.batteryDisplay());
  }

  @Test
  public void distance_display_when_battery_empty() {
    // Drain the battery
    for (int i = 0; i < 100; i++) {
      elonsToyCar.drive();
    }
    // Attempt to drive one more time (should not work)
    elonsToyCar.drive();
    Assertions.assertEquals("Driven 2000 meters", elonsToyCar.distanceDisplay());
  }

  @Test
  public void battery_display_when_battery_empty() {
    // Drain the battery
    for (int i = 0; i < 100; i++) {
      elonsToyCar.drive();
    }
    // Attempt to drive one more time (should not work)
    elonsToyCar.drive();
    Assertions.assertEquals("Battery empty", elonsToyCar.batteryDisplay());
  }

  @Test
  public void battery_display_after_driving_multiple_times() {
    for (int i = 0; i < 23; i++) {
      elonsToyCar.drive();
    }
    Assertions.assertEquals("Battery at 77%", elonsToyCar.batteryDisplay());
  }

  @Test
  public void buy_new_car_returns_new_car_each_time() {
    ElonsToyCar elonsToyCar1 = new ElonsToyCar();
    elonsToyCar1.buy();
    ElonsToyCar elonsToyCar2 = new ElonsToyCar();
    elonsToyCar2.buy();
    Assertions.assertNotEquals(elonsToyCar2, elonsToyCar1);
  }

  @Test
  public void distance_display_after_driving_multiple_times() {
    for (int i = 0; i < 17; i++) {
      elonsToyCar.drive();
    }
    Assertions.assertEquals("Driven 340 meters", elonsToyCar.distanceDisplay());
  }

  @Test
  public void new_car_battery_display() {
    Assertions.assertEquals("Battery at 100%", elonsToyCar.batteryDisplay());
  }
}