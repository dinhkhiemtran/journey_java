package org.khiemtran.lists.doubly_linked_list;

class DoublyLinkedList<T> {
  private Element<T> head;
  private Element<T> tail;
  private int size;

  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  void push(T value) {
    var newElement = new Element(value);
    if (this.size == 0) {
      this.head = newElement;
      this.tail = head;
    } else {
      newElement.setPrev(this.tail);
      this.tail.setNext(newElement);
      this.tail = newElement;
    }
    this.size++;
  }

  T pop() {
    var current = this.tail;
    if (this.size == 0) return null;
    if (this.size == 1) {
      this.head = null;
      this.tail = null;
    } else {
      this.tail = this.tail.getPrev();
    }
    this.size--;
    return current.getValue();
  }

  void unshift(T value) {
    var newElement = new Element(value);
    if (this.size == 0) {
      this.head = newElement;
      this.tail = this.head;
    } else {
      newElement.setNext(this.head);
      this.head.setPrev(newElement);
      this.head = newElement;
    }
    this.size++;
  }

  T shift() {
    var current = this.head;
    if (this.size == 0) return null;
    if (this.size == 1) {
      this.head = null;
      this.tail = null;
    } else {
      this.head = this.head.getNext();
    }
    this.size--;
    return current.getValue();
  }
}

