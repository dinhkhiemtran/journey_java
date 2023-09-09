package org.khiemtran.classes;

public class ElonsToyCar {
  private static final int DISTANCE_DRIVEN = 20;
  private static final String STATE_OUT_OF_BATTERY = "Battery empty";
  private static final int RUN_OUT_OF_BATTERY = 0;
  private int meters;
  private int battery;

  public ElonsToyCar() {
    this.meters = 0;
    this.battery = 100;
  }

  public ElonsToyCar buy() {
    return new ElonsToyCar();
  }

  public String distanceDisplay() {
    return String.format("Driven %s meters", meters);
  }

  public String batteryDisplay() {
    return !checkOutOfBattery() ? String.format("Battery at %s%%", battery) : STATE_OUT_OF_BATTERY;
  }

  public void drive() {
    if (!checkOutOfBattery()) {
      this.meters += DISTANCE_DRIVEN;
      this.battery--;
    }
  }

  private boolean checkOutOfBattery() {
    return battery == RUN_OUT_OF_BATTERY;
  }
}
