package org.khiemtran.interfaces;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestTrack {
  public static void race(RemoteControlCar car) {
    car.drive();
  }
  public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
    return cars.stream()
        .sorted(Collections.reverseOrder())
        .collect(Collectors.toList());
  }
}
