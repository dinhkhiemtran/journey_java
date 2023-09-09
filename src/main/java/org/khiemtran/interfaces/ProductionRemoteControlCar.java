package org.khiemtran.interfaces;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
  private int units;
  private int distanceTravelled;
  private int numberOfVictories;

  public ProductionRemoteControlCar() {
    this.units = 10;
    this.distanceTravelled = 0;
  }

  public ProductionRemoteControlCar(int numberOfVictories) {
    this.numberOfVictories = numberOfVictories;
  }

  public int getNumberOfVictories() {
    return numberOfVictories;
  }

  public void setNumberOfVictories(int numberOfVictories) {
    this.numberOfVictories = numberOfVictories;
  }

  @Override
  public void drive() {
    distanceTravelled += units;
  }

  @Override
  public int getDistanceTravelled() {
    return distanceTravelled;
  }

  @Override
  public int compareTo(ProductionRemoteControlCar o) {
    return Integer.compare(getNumberOfVictories(), o.getNumberOfVictories());
  }
}
