package org.khiemtran.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

class WordCount {
  public Map<String, Integer> phrase(String input) {
    return Arrays.stream(input
            .toLowerCase()
            .replaceAll("[^a-z0-9']", " ")
            .trim()
            .split("\\s+"))
        .map(el -> el.replaceAll("^'|'$", ""))
        .collect(Collectors.toMap(
            key -> key,
            value -> 1,
            Integer::sum,
            HashMap::new
        ));
  }
}
