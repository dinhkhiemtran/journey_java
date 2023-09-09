package org.khiemtran.lists;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
  private static final String JAVA_LANGUAGE = "Java";
  private static final String KOTLIN_LANGUAGE = "Kotlin";
  private final List<String> languages;

  public LanguageList() {
    this.languages = new ArrayList<>();
  }

  public boolean isEmpty() {
    return languages.isEmpty();
  }

  public void addLanguage(String language) {
    languages.add(language);
  }

  public void removeLanguage(String language) {
    languages.remove(language);
  }

  public String firstLanguage() {
    return languages.stream().findFirst().get();
  }

  public int count() {
    return (int) languages.stream().count();
  }

  public boolean containsLanguage(String language) {
    return languages.stream().filter(e -> e.contains(language)).findFirst().isPresent();
  }

  public boolean isExciting() {
    return this.containsLanguage(JAVA_LANGUAGE) || this.containsLanguage(KOTLIN_LANGUAGE);
  }
}
