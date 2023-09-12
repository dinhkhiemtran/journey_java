package org.khiemtran.constructors;

public class NeedForSpeed {
  private static final int SPEED_OF_METERS = 50;
  private static final int BATTERY_DRAIN = 4;
  private int meter;
  private int battery;
  private final int speed;
  private final int batteryDrain;

  public NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
    this.meter = 0;
    this.battery = 100;
  }

  public boolean batteryDrained() {
    return battery <= 0;
  }

  public int distanceDriven() {
    return meter;
  }

  public void drive() {
    if (!batteryDrained()) {
      meter += speed;
      battery -= batteryDrain;
    }
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(SPEED_OF_METERS, BATTERY_DRAIN);
  }
}

class RaceTrack {
  private final int distance;

  RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean tryFinishTrack(NeedForSpeed car) {
    while (car.distanceDriven() < distance && !car.batteryDrained()) {
      car.drive();
    }
    return car.distanceDriven() >= distance;
  }
}
