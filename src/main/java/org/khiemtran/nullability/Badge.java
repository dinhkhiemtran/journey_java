package org.khiemtran.nullability;

public class Badge {
  public String print(Integer id, String name, String department) {
    return id == null && department == null ? name + " - " + "OWNER"
        : department == null ? "[" + id + "]" + " - " + name + " - " + "OWNER"
        : id == null ? name + " - " + department.toUpperCase()
        : "[" + id + "]" + " - " + name + " - " + department.toUpperCase();
  }
}
