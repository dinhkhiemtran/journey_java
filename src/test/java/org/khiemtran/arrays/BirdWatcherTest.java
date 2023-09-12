package org.khiemtran.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BirdWatcherTest {

  private BirdWatcher birdWatcher;

  @Test
  public void itShouldNotHaveBusyDays() {
    birdWatcher = new BirdWatcher(new int[]{1, 2, 3, 3, 2, 1, 4});
    Assertions.assertEquals(0, birdWatcher.getBusyDays());
  }

  @Test
  public void itShouldNotHaveDaysWithoutBirds() {
    birdWatcher = new BirdWatcher(new int[]{1, 2, 5, 3, 7, 8, 4});
    Assertions.assertFalse(birdWatcher.hasDayWithoutBirds());
  }

  @Test
  public void itHasDayWithoutBirds() {
    birdWatcher = new BirdWatcher(new int[]{0});
    Assertions.assertTrue(birdWatcher.hasDayWithoutBirds());
  }

  @Test
  public void itGetLastWeeks() {
    birdWatcher = new BirdWatcher(new int[]{1, 2, 5, 3, 7, 8, 4});
    Assertions.assertEquals(Arrays.toString(new int[]{1, 2, 5, 3, 7, 8, 4}), Arrays.toString(birdWatcher.getLastWeek()));
  }

  @Test
  public void itGetTodat() {
    birdWatcher = new BirdWatcher(new int[]{1, 2, 5, 3, 7, 8, 4});
    Assertions.assertEquals(4, birdWatcher.getToday());
  }

  @Test
  public void itIncreaseToday() {
    birdWatcher = new BirdWatcher(new int[]{1, 2, 5, 3, 7, 8, 4});
    birdWatcher.incrementTodaysCount();
  }

  @Test
  public void itGetCountForFirstDays() {
    birdWatcher = new BirdWatcher(new int[]{1, 2, 5, 3, 7, 8, 4});
    Assertions.assertEquals(3, birdWatcher.getCountForFirstDays(2));
  }
}