package org.khiemtran.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LasagnaTest {
  private Lasagna lasagna;

  @BeforeEach
  public void init() {
    lasagna = new Lasagna();
  }

  @Test
  public void total_time_in_minutes_for_multiple_layers() {
    Assertions.assertEquals(26, lasagna.totalTimeInMinutes(3, 20));
  }

  @Test
  public void total_time_in_minutes_for_one_layer() {
    Assertions.assertEquals(32, lasagna.totalTimeInMinutes(1, 30));
  }

  @Test
  public void remaining_minutes_in_oven() {
    Assertions.assertEquals(15, lasagna.remainingMinutesInOven(25));
  }

  @Test
  public void preparation_time_in_minutes_for_one_layer() {
    Assertions.assertEquals(2, lasagna.preparationTimeInMinutes(1));
  }

  @Test
  public void expected_minutes_in_oven() {
    Assertions.assertEquals(40, lasagna.expectedMinutesInOven());
  }
}