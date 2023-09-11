package org.khiemtran.conditionals;

public class Twofer {
  private static final String YOU_AND_ME = "One for you, one for me.";

  public String twofer(String name) {
    return name == null ? YOU_AND_ME : String.format("One for %s, one for me.", name);
  }
}
