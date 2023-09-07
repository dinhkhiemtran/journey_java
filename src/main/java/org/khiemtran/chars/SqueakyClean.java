package org.khiemtran.chars;

public class SqueakyClean {
  public static String clean(String identifier) {
    if (!identifier.isEmpty()) {
      int indexOfWordNextToHyphen = identifier.indexOf("-") + 1;
      String wordNextToHyphen = String.valueOf(identifier.charAt(indexOfWordNextToHyphen));
      return identifier
          .replaceAll(" ", "_")
          .replaceAll("\\p{Cntrl}", "CTRL")
          .replaceAll("-.", wordNextToHyphen.toUpperCase())
          .replaceAll("[^_\\p{IsAlphabetic}]", "")
          .replaceAll("[α-ω]", "");
    }
    return "";
  }
}
