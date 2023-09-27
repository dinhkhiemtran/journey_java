package org.khiemtran.lists.doubly_linked_list;

public class Element<T> {
  public final T value;
  public Element<T> prev;
  public Element<T> next;

  Element(T value, Element<T> prev, Element<T> next) {
    this.value = value;
    this.prev = prev;
    this.next = next;
  }

  Element(T value) {
    this.value = value;
  }

  public Element<T> getPrev() {
    return prev;
  }

  public void setPrev(Element<T> prev) {
    this.prev = prev;
  }

  public Element<T> getNext() {
    return next;
  }

  public void setNext(Element<T> next) {
    this.next = next;
  }

  public T getValue() {
    return value;
  }
}
