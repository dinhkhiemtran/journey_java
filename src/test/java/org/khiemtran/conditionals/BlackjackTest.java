package org.khiemtran.conditionals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlackjackTest {
  private Blackjack blackjack;

  @BeforeEach
  public void init() {
    blackjack = new Blackjack();
  }

  @Test
  public void blackjackWithKingAceSecond() {
    Assertions.assertEquals(true, blackjack.isBlackjack("king", "ace"));
  }

  @Test
  public void firstTurnWithAceAceAndDealerAce() {
    Assertions.assertEquals("P", blackjack.firstTurn("ace", "ace", "ace"));
  }

  @Test
  public void firstTurnWithTwoNineAndDealerQueen() {
    Assertions.assertEquals("H", blackjack.firstTurn("two", "nine", "queen"));
  }

  @Test
  public void firstTurnWithKingSevenAndDealerAce() {
    Assertions.assertEquals("S", blackjack.firstTurn("king", "seven", "ace"));
  }

  @Test
  public void firstTurnWithTwoTenAndDealerQueen() {
    Assertions.assertEquals("H", blackjack.firstTurn("two", "ten", "queen"));
  }

  @Test
  public void firstTurnWithTwoTenAndDealerSeven() {
    Assertions.assertEquals("H", blackjack.firstTurn("two", "ten", "seven"));
  }

  @Test
  public void firstTurnWithKingTenAndDealerAce() {
    Assertions.assertEquals("S", blackjack.firstTurn("king", "ten", "ace"));
  }

  @Test
  public void firstTurnWithFourTenAndDealerQueen() {
    Assertions.assertEquals("H", blackjack.firstTurn("four", "ten", "queen"));
  }

  @Test
  public void firstTurnWithFourTenAndDealerSeven() {
    Assertions.assertEquals("H", blackjack.firstTurn("four", "ten", "seven"));
  }

  @Test
  public void correctParsesEight() {
    Assertions.assertEquals(8, blackjack.parseCard("eight"));
  }

  @Test
  public void correctParsesQueen() {
    Assertions.assertEquals(10, blackjack.parseCard("queen"));
  }

  @Test
  public void correctParsesSeven() {
    Assertions.assertEquals(7, blackjack.parseCard("seven"));
  }

  @Test
  public void correctParsesThree() {
    Assertions.assertEquals(3, blackjack.parseCard("three"));
  }

  @Test
  public void firstTurnWithJackJackAndDealerAce() {
    Assertions.assertEquals("S", blackjack.firstTurn("jack", "jack", "ace"));
  }

  @Test
  public void firstTurnWithFiveTenAndDealerKing() {
    Assertions.assertEquals("H", blackjack.firstTurn("five", "ten", "king"));
  }

  @Test
  public void firstTurnWithEightTenAndDealerAce() {
    Assertions.assertEquals("S", blackjack.firstTurn("eight", "ten", "ace"));
  }

  @Test
  public void blackjackWithJackAceSecond() {
    Assertions.assertEquals(true, blackjack.isBlackjack("jack", "ace"));
  }

  @Test
  public void firstTurnWithSixTenAndDealerAce() {
    Assertions.assertEquals("H", blackjack.firstTurn("six", "ten", "ace"));
  }

  @Test
  public void firstTurnWithSixTenAndDealerSix() {
    Assertions.assertEquals("S", blackjack.firstTurn("six", "ten", "six"));
  }

  @Test
  public void firstTurnWithThreeTenAndDealerSix() {
    Assertions.assertEquals("S", blackjack.firstTurn("three", "ten", "six"));
  }

  @Test
  public void noBlackjackWithTwoFigures() {
    Assertions.assertEquals(false, blackjack.isBlackjack("queen", "jack"));
  }

  @Test
  public void firstTurnWithTwoTwoAndDealerAce() {
    Assertions.assertEquals("H", blackjack.firstTurn("two", "two", "ace"));
  }

  @Test
  public void firstTurnWithAceKingAndDealerQueen() {
    Assertions.assertEquals("S", blackjack.firstTurn("ace", "king", "queen"));
  }

  @Test
  public void firstTurnWithTwoEightAndDealerTwo() {
    Assertions.assertEquals("H", blackjack.firstTurn("two", "eight", "two"));
  }

  @Test
  public void firstTurnWithKingKingAndDealerAce() {
    Assertions.assertEquals("S", blackjack.firstTurn("king", "king", "ace"));
  }

  @Test
  public void firstTurnWithJackAceAndDealerAce() {
    Assertions.assertEquals("S", blackjack.firstTurn("jack", "ace", "ace"));
  }

  @Test
  public void firstTurnWithFiveFiveAndAce() {
    Assertions.assertEquals("H", blackjack.firstTurn("five", "five", "ace"));
  }

  @Test
  public void noBlackjackWithKingAndFive() {
    Assertions.assertEquals(false, blackjack.isBlackjack("king", "five"));
  }

  @Test
  public void firstTurnWithFiveTenAndDealerSeven() {
    Assertions.assertEquals("H", blackjack.firstTurn("five", "ten", "seven"));
  }

  @Test
  public void blackjackWithTenAceSecond() {
    Assertions.assertEquals(true, blackjack.isBlackjack("ten", "ace"));
  }

  @Test
  public void firstTurnWithTwoTwoAndDealerFive() {
    Assertions.assertEquals("H", blackjack.firstTurn("two", "two", "five"));
  }

  @Test
  public void firstTurnWithFourTenAndDealerSix() {
    Assertions.assertEquals("S", blackjack.firstTurn("four", "ten", "six"));
  }

  @Test
  public void noBlackjackWithTwoAces() {
    Assertions.assertEquals(false, blackjack.isBlackjack("ace", "ace"));
  }

  @Test
  public void correctParsesAce() {
    Assertions.assertEquals(11, blackjack.parseCard("ace"));
  }

  @Test
  public void correctParsesSix() {
    Assertions.assertEquals(6, blackjack.parseCard("six"));
  }

  @Test
  public void correctParsesTen() {
    Assertions.assertEquals(10, blackjack.parseCard("ten"));
  }

  @Test
  public void correctParsesTwo() {
    Assertions.assertEquals(2, blackjack.parseCard("two"));
  }

  @Test
  public void firstTurnWithNineTenAndDealerAce() {
    Assertions.assertEquals("S", blackjack.firstTurn("nine", "ten", "ace"));
  }

  @Test
  public void firstTurnWithKingAceAndDealerNine() {
    Assertions.assertEquals("W", blackjack.firstTurn("king", "ace", "nine"));
  }

  @Test
  public void blackjackWithQueenAceSecond() {
    Assertions.assertEquals(true, blackjack.isBlackjack("queen", "ace"));
  }

  @Test
  public void correctParsesFive() {
    Assertions.assertEquals(5, blackjack.parseCard("five"));
  }

  @Test
  public void correctParsesFour() {
    Assertions.assertEquals(4, blackjack.parseCard("four"));
  }

  @Test
  public void correctParsesJack() {
    Assertions.assertEquals(10, blackjack.parseCard("jack"));
  }

  @Test
  public void correctParsesKing() {
    Assertions.assertEquals(10, blackjack.parseCard("king"));
  }

  @Test
  public void correctParsesNine() {
    Assertions.assertEquals(9, blackjack.parseCard("nine"));
  }

  @Test
  public void firstTurnWithSixTenAndDealerSeven() {
    Assertions.assertEquals("H", blackjack.firstTurn("six", "ten", "seven"));
  }

  @Test
  public void firstTurnWithTenAceAndDealerFive() {
    Assertions.assertEquals("W", blackjack.firstTurn("ten", "ace", "five"));
  }

  @Test
  public void firstTurnWithFiveTenAndDealerSix() {
    Assertions.assertEquals("S", blackjack.firstTurn("five", "ten", "six"));
  }

  @Test
  public void firstTurnWithTwoThreeAndDealerQueen() {
    Assertions.assertEquals("H", blackjack.firstTurn("two", "three", "queen"));
  }

  @Test
  public void noBlackjackWithEightAndFive() {
    Assertions.assertEquals(false, blackjack.isBlackjack("eight", "five"));
  }

  @Test
  public void firstTurnWithThreeTenAndDealerQueen() {
    Assertions.assertEquals("H", blackjack.firstTurn("three", "ten", "queen"));
  }

  @Test
  public void firstTurnWithThreeTenAndDealerSeven() {
    Assertions.assertEquals("H", blackjack.firstTurn("three", "ten", "seven"));
  }

  @Test
  public void noBlackjackWithFive() {
    Assertions.assertEquals(false, blackjack.isBlackjack("ace", "five"));
  }

  @Test
  public void noBlackjackWithNine() {
    Assertions.assertEquals(false, blackjack.isBlackjack("ace", "nine"));
  }
}