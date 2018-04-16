package com.perfordummies.poker;

import org.junit.Test;

import com.perfordummies.poker.impl.Card;
import com.perfordummies.poker.impl.Player;
import com.perfordummies.poker.impl.PokerHandCalculator;
import com.perfordummies.poker.impl.WinnerCalculator;
import com.perfordummies.poker.interfaces.IPlayer;
import com.perfordummies.poker.interfaces.IPokerHand;
import com.perfordummies.poker.interfaces.IPokerHandCalculator;
import com.perfordummies.poker.interfaces.IWinnerCalculator;

public class PokerHandCalculatorTests {

	@Test
	public void calculatePokerHand() {
		IPlayer player1 = new Player("Per");
		player1.addCard(new Card("4","D"));
		player1.addCard(new Card("4","J"));
		player1.addCard(new Card("5","C"));
		player1.addCard(new Card("6","H"));
		player1.addCard(new Card("7","D"));
		
		IPlayer player2 = new Player("William");
		player2.addCard(new Card("4","D"));
		player2.addCard(new Card("4","J"));
		player2.addCard(new Card("4","C"));
		player2.addCard(new Card("6","H"));
		player2.addCard(new Card("7","D"));
		
		IPokerHandCalculator pokerHandCalculator = new PokerHandCalculator();
		IPokerHand player1Hand = pokerHandCalculator.calculatePokerHand(player1.getCards());
		
		IPokerHand player2Hand = pokerHandCalculator.calculatePokerHand(player2.getCards());
		IWinnerCalculator winnerCalculator = new WinnerCalculator();
		
	}
}
