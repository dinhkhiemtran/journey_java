package org.khiemtran.lists.binary_search;

import java.util.List;
import java.util.Objects;

public class BinarySearch {
  private final List<Integer> items;
  private int left;
  private int right;

  BinarySearch(List<Integer> items) {
    this.items = items;
    this.left = 0;
    this.right = items.size() - 1;
  }

  public int indexOf(int item) throws ValueNotFoundException {
    while (left <= right) {
      int mid = left + (right - left) / 2;
      if (Objects.equals(items.get(mid), item)) {
        return mid;
      } else if (items.get(mid) > item) {
        right = --mid;
      } else {
        left = ++mid;
      }
    }
    throw new ValueNotFoundException("Value not in array");
  }
}
