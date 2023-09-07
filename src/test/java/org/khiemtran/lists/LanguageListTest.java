package org.khiemtran.lists;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LanguageListTest {

  private LanguageList languageList;

  @BeforeEach
  public void init() {
    languageList = new LanguageList();
  }

  @Test
  public void addMultipleLanguages() {
    languageList.addLanguage("Java");
    languageList.addLanguage("Ruby");
    languageList.addLanguage("C++");
    Assertions.assertEquals(true, languageList.containsLanguage("Java"));
    Assertions.assertEquals(true, languageList.containsLanguage("Ruby"));
    Assertions.assertEquals(true, languageList.containsLanguage("C++"));
    Assertions.assertEquals(false, languageList.containsLanguage("Python"));
  }

  @Test
  public void countEmpty() {
    Assertions.assertEquals(0, languageList.count());
  }

  @Test
  public void countThree() {
    languageList.addLanguage("Java");
    languageList.addLanguage("Python");
    languageList.addLanguage("Ruby");
    Assertions.assertEquals(3, languageList.count());
  }

  @Test
  public void excitingLanguageListWithKotlin() {
    languageList.addLanguage("Python");
    languageList.addLanguage("Kotlin");
    Assertions.assertEquals(true, languageList.isExciting());
  }

  @Test
  public void addOneLanguage() {
    languageList.addLanguage("Java");
    Assertions.assertEquals(true, languageList.containsLanguage("Java"));
    Assertions.assertEquals(false, languageList.containsLanguage("Python"));
  }

  @Test
  public void empty() {
    Assertions.assertEquals(true, languageList.isEmpty());
  }

  @Test
  public void firstLanguage() {
    languageList.addLanguage("Java");
    languageList.addLanguage("Python");
    languageList.addLanguage("Ruby");
    Assertions.assertEquals("Java", languageList.firstLanguage());
  }

  @Test
  public void boringLanguageList() {
    languageList.addLanguage("Python");
    languageList.addLanguage("Ruby");
    languageList.addLanguage("C++");
    Assertions.assertEquals(false, languageList.isExciting());
  }

  @Test
  public void excitingLanguageListWithJava() {
    languageList.addLanguage("Java");
    Assertions.assertEquals(true, languageList.isExciting());
  }

  @Test
  public void removeLanguage() {
    languageList.addLanguage("Java");
    languageList.addLanguage("Python");
    languageList.addLanguage("Ruby");
    languageList.removeLanguage("Python");
    Assertions.assertEquals(true, languageList.containsLanguage("Java"));
    Assertions.assertEquals(false, languageList.containsLanguage("Python"));
    Assertions.assertEquals(true, languageList.containsLanguage("Ruby"));
  }

  @Test
  public void nonEmpty() {
    languageList.addLanguage("Java");
    Assertions.assertEquals(false, languageList.isEmpty());
  }
}