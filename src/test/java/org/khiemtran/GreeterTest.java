package org.khiemtran;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreeterTest {
  private Greeter greeter;

  @BeforeEach
  public void init() {
    greeter = new Greeter();
  }

  @Test
  void getGreeting() {
    Assertions.assertEquals("Hello, World!", greeter.getGreeting());
  }
}