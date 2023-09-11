package org.khiemtran.numbers;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GigaSecond {
  private static final long GIGA_SECOND = 1_000_000_000L;
  private LocalDateTime now;

  public GigaSecond(LocalDate birthDate) {
    this.now = birthDate.atStartOfDay();
  }

  public GigaSecond(LocalDateTime birthDateTime) {
    this.now = birthDateTime;
  }

  LocalDateTime getDateTime() {
    return now.plusSeconds(GIGA_SECOND);
  }
}
