package org.khiemtran.arrays.food_chain;

public class Description {
  private String creature;
  private String reason;
  private String connection;

  public Description(String creature, String reason, String connection) {
    this.creature = creature;
    this.reason = reason;
    this.connection = connection;
  }

  public String getCreature() {
    return this.creature;
  }

  public String getReason() {
    return this.reason;
  }

  public String getConnection() {
    return this.connection;
  }
}
