package org.khiemtran.conditionals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FootballMatchReportsTest {
  @Test
  public void test_goal() {
    Assertions.assertEquals("goalie", FootballMatchReports.onField(1));
  }

  @Test
  public void test_exception_negative_number() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> FootballMatchReports.onField(-1));
  }

  @Test
  public void test_midfielder() {
    Assertions.assertEquals("midfielder", FootballMatchReports.onField(6));
    Assertions.assertEquals("midfielder", FootballMatchReports.onField(7));
    Assertions.assertEquals("midfielder", FootballMatchReports.onField(8));
  }

  @Test
  public void test_striker() {
    Assertions.assertEquals("striker", FootballMatchReports.onField(10));
  }

  @Test
  public void test_exception() {
    Assertions.assertThrows(IllegalArgumentException.class, () -> FootballMatchReports.onField(13));
  }

  @Test
  public void test_right_back() {
    Assertions.assertEquals("right back", FootballMatchReports.onField(5));
  }

  @Test
  public void test_right_wing() {
    Assertions.assertEquals("right wing", FootballMatchReports.onField(11));
  }

  @Test
  public void test_left_back() {
    Assertions.assertEquals("left back", FootballMatchReports.onField(2));
  }

  @Test
  public void test_left_wing() {
    Assertions.assertEquals("left wing", FootballMatchReports.onField(9));
  }

  @Test
  public void test_center_back() {
    Assertions.assertEquals("center back", FootballMatchReports.onField(3));
    Assertions.assertEquals("center back", FootballMatchReports.onField(4));
  }

}