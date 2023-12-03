package org.khiemtran.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class AppointmentScheduler {
  private final static String DESCRIPTION = "You have an appointment on ";

  public LocalDateTime schedule(String appointmentDateDescription) {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy H:mm:ss");
    return LocalDateTime.parse(appointmentDateDescription, dateTimeFormatter);
  }

  public boolean hasPassed(LocalDateTime appointmentDate) {
    return LocalDateTime.now().isAfter((appointmentDate));
  }

  public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
    return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
  }

  public String getDescription(LocalDateTime appointmentDate) {
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a'.'");
    return DESCRIPTION.concat(appointmentDate.format(dateTimeFormatter));
  }

  public LocalDate getAnniversaryDate() {
    return LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 15);
  }
}
