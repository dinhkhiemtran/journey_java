package org.khiemtran.lists;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flattener {
  public static List<Object> flatten(List<Object> list) {
    return list.stream()
        .flatMap(el -> el instanceof List ? Flattener.flatten((List<Object>) el).stream() : Stream.of(el))
        .filter(Objects::nonNull)
        .collect(Collectors.toList());
  }
}
