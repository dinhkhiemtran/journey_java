package org.khiemtran.conditionals;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FootballMatchReports {
  private static final String GOALIE = "goalie";
  private static final String LEFT_BACK = "left back";
  private static final String CENTER_BACK = "center back";
  private static final String RIGHT_BACK = "right back";
  private static final String MIDFIELDER = "midfielder";
  private static final String LEFT_WING = "left wing";
  private static final String STRIKER = "striker";
  private static final String RIGHT_WING = "right wing";
  private static final String OUTSIDE_RANGE_NUMBER = "Shirt number outside range 1-11!";
  private static Map<Integer, String> players;

  static {
    players = IntStream.range(1, 12)
        .boxed()
        .collect(Collectors.toMap(
            key -> key,
            value ->
                value == 1 ? GOALIE
                    : value == 2 ? LEFT_BACK
                    : value == 3 || value == 4 ? CENTER_BACK
                    : value == 5 ? RIGHT_BACK
                    : value == 6 || value == 7 || value == 8 ? MIDFIELDER
                    : value == 9 ? LEFT_WING
                    : value == 10 ? STRIKER
                    : RIGHT_WING,
            (existing, replacement) -> existing,
            HashMap::new
        ));
  }

  public static String onField(int shirtNum) {
    if (players.containsKey(shirtNum))
      return players.get(shirtNum);
    throw new IllegalArgumentException(OUTSIDE_RANGE_NUMBER);
  }
}
