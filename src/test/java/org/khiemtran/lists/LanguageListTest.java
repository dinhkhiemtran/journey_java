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
    Assertions.assertTrue(languageList.containsLanguage("Java"));
    Assertions.assertTrue(languageList.containsLanguage("Ruby"));
    Assertions.assertTrue(languageList.containsLanguage("C++"));
    Assertions.assertFalse(languageList.containsLanguage("Python"));
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
    Assertions.assertTrue(languageList.isExciting());
  }

  @Test
  public void addOneLanguage() {
    languageList.addLanguage("Java");
    Assertions.assertTrue(languageList.containsLanguage("Java"));
    Assertions.assertFalse(languageList.containsLanguage("Python"));
  }

  @Test
  public void empty() {
    Assertions.assertTrue(languageList.isEmpty());
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
    Assertions.assertFalse(languageList.isExciting());
  }

  @Test
  public void excitingLanguageListWithJava() {
    languageList.addLanguage("Java");
    Assertions.assertTrue(languageList.isExciting());
  }

  @Test
  public void removeLanguage() {
    languageList.addLanguage("Java");
    languageList.addLanguage("Python");
    languageList.addLanguage("Ruby");
    languageList.removeLanguage("Python");
    Assertions.assertTrue(languageList.containsLanguage("Java"));
    Assertions.assertFalse(languageList.containsLanguage("Python"));
    Assertions.assertTrue(languageList.containsLanguage("Ruby"));
  }

  @Test
  public void nonEmpty() {
    languageList.addLanguage("Java");
    Assertions.assertFalse(languageList.isEmpty());
  }
}