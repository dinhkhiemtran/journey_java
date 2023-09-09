package org.khiemtran.interfaces;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class TestTrackTest {
  private static ProductionRemoteControlCar getCarWithVictories(int numVictories) {
    return new ProductionRemoteControlCar(numVictories);
  }

  @Test
  public void experimentalRccIsRemoteControlCar() {
    ExperimentalRemoteControlCar experimentalCar = new ExperimentalRemoteControlCar();
    Assertions.assertEquals(true, experimentalCar instanceof RemoteControlCar);
  }

  @Test
  public void productionCarTravels10UnitsPerDrive() {
    ProductionRemoteControlCar car = new ProductionRemoteControlCar();
    Assertions.assertEquals(0, car.getDistanceTravelled());
    car.drive();
    Assertions.assertEquals(10, car.getDistanceTravelled());
  }

  @Test
  public void rankManyCars() {
    List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>() {
      {
        add(getCarWithVictories(0));
        add(getCarWithVictories(3));
        add(getCarWithVictories(5));
        add(getCarWithVictories(7));
        add(getCarWithVictories(2));
        add(getCarWithVictories(1));
      }
    };
    List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
    Assertions.assertEquals(7, rankings.get(0).getNumberOfVictories());
    Assertions.assertEquals(5, rankings.get(1).getNumberOfVictories());
    Assertions.assertEquals(3, rankings.get(2).getNumberOfVictories());
    Assertions.assertEquals(2, rankings.get(3).getNumberOfVictories());
    Assertions.assertEquals(1, rankings.get(4).getNumberOfVictories());
    Assertions.assertEquals(0, rankings.get(5).getNumberOfVictories());
  }

  @Test
  public void race() {
    ProductionRemoteControlCar productionCar = new ProductionRemoteControlCar();
    ExperimentalRemoteControlCar experimentalCar = new ExperimentalRemoteControlCar();
    TestTrack.race((RemoteControlCar) productionCar);
    TestTrack.race((RemoteControlCar) productionCar);
    TestTrack.race((RemoteControlCar) experimentalCar);
    TestTrack.race((RemoteControlCar) experimentalCar);
    Assertions.assertEquals(20, experimentalCar.getDistanceTravelled() - productionCar.getDistanceTravelled());
  }

  @Test
  public void experimentalCarTravels20UnitsPerDrive() {
    ExperimentalRemoteControlCar car = new ExperimentalRemoteControlCar();
    Assertions.assertEquals(0, car.getDistanceTravelled());
    car.drive();
    Assertions.assertEquals(20, car.getDistanceTravelled());
  }

  @Test
  public void productionRccIsRemoteControlCar() {
    ProductionRemoteControlCar productionCar = new ProductionRemoteControlCar();
    Assertions.assertEquals(true, productionCar instanceof RemoteControlCar);
  }

  @Test
  public void rankTwoCars() {
    List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>() {
      {
        add(getCarWithVictories(2));
        add(getCarWithVictories(3));
      }
    };
    List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
    Assertions.assertEquals(3, rankings.get(0).getNumberOfVictories());
    Assertions.assertEquals(2, rankings.get(1).getNumberOfVictories());
  }

  @Test
  public void testSetProductionRccIsRemoteControlCar() {
    List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>() {
      {
        add(getCarWithVictories(2));
        add(getCarWithVictories(3));
      }
    };
    List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
    ProductionRemoteControlCar productionRemoteControlCar = new ProductionRemoteControlCar();
    productionRemoteControlCar.setNumberOfVictories(rankings.get(0).getNumberOfVictories());
  }
}