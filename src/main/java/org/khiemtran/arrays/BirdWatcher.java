package org.khiemtran.arrays;

import java.util.Arrays;

public class BirdWatcher {
  private final int FIVE_BIRD_IN_DAY = 5;

  private final int ZERO_BIRD_IN_DAY = 0;
  private final int[] birdsPerDay;
  private int indexOfOldestDay;


  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
    this.indexOfOldestDay = birdsPerDay.length - 1;
  }

  public int[] getLastWeek() {
    return birdsPerDay;
  }

  public int getToday() {
    return birdsPerDay[indexOfOldestDay];
  }

  public void incrementTodaysCount() {
    birdsPerDay[indexOfOldestDay]++;
  }

  public boolean hasDayWithoutBirds() {
    return Arrays.stream(birdsPerDay).filter(bird -> bird == ZERO_BIRD_IN_DAY).findFirst().isPresent();
  }

  public int getCountForFirstDays(int numberOfDays) {
    return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
  }

  public int getBusyDays() {
    return (int) Arrays.stream(birdsPerDay).filter(bird -> bird >= FIVE_BIRD_IN_DAY).count();
  }
}
