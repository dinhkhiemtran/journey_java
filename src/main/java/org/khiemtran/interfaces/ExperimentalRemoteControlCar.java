package org.khiemtran.interfaces;

public class ExperimentalRemoteControlCar implements RemoteControlCar {
  private int units;
  private int distanceTravelled;

  public ExperimentalRemoteControlCar() {
    this.units = 20;
    this.distanceTravelled = 0;
  }

  public void drive() {
    distanceTravelled += units;
  }

  public int getDistanceTravelled() {
    return distanceTravelled;
  }
}
