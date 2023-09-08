package org.khiemtran.conditionals;

import java.util.HashMap;
import java.util.Map;

public class Blackjack {
  private static final int BLACK_JACK = 21;
  private final String STAND = "S";
  private final String HIT = "H";
  private final String SPLIT = "P";
  private final String WIN = "W";
  private static Map<String, Integer> cards = new HashMap<>();

  static {
    cards.put("ace", 11);
    cards.put("two", 2);
    cards.put("three", 3);
    cards.put("four", 4);
    cards.put("five", 5);
    cards.put("six", 6);
    cards.put("seven", 7);
    cards.put("eight", 8);
    cards.put("nine", 9);
    cards.put("ten", 10);
    cards.put("jack", 10);
    cards.put("queen", 10);
    cards.put("king", 10);
  }

  public int parseCard(String card) {
    return cards.get(card);
  }

  public boolean isBlackjack(String card1, String card2) {
    return cards.get(card1) + cards.get(card2) == BLACK_JACK;
  }

  public String largeHand(boolean isBlackjack, int dealerScore) {
    return !isBlackjack ? SPLIT : dealerScore < 10 ? WIN : STAND;
  }

  public String smallHand(int handScore, int dealerScore) {
    return handScore >= 17 ? STAND : handScore <= 11 ? HIT : dealerScore >= 7 ? HIT : STAND;
  }

  public String firstTurn(String card1, String card2, String dealerCard) {
    int handScore = parseCard(card1) + parseCard(card2);
    int dealerScore = parseCard(dealerCard);

    if (20 < handScore) {
      return largeHand(isBlackjack(card1, card2), dealerScore);
    } else {
      return smallHand(handScore, dealerScore);
    }
  }
}
