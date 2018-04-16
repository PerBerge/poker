package com.perfordummies.poker;

import org.junit.Test;
import org.springframework.util.Assert;

import com.perfordummies.poker.impl.Card;
import com.perfordummies.poker.impl.Player;
import com.perfordummies.poker.impl.PokerHandCalculator;
import com.perfordummies.poker.impl.ThreeOfAKind;
import com.perfordummies.poker.interfaces.IPlayer;
import com.perfordummies.poker.interfaces.IPokerHand;
import com.perfordummies.poker.interfaces.IPokerHandCalculator;

public class PokerHandCalculatorTests {

	@Test
	public void testIfThreeOfAKind() {
		IPlayer player = new Player("Per");
		
		player.addCard(new Card("3","C"));
		player.addCard(new Card("3","D"));
		player.addCard(new Card("3","S"));
		player.addCard(new Card("8","C"));
		player.addCard(new Card("10","D"));
		
		IPokerHandCalculator pokerHandCalculator = new PokerHandCalculator();
		IPokerHand handIsThreeOfAKind = pokerHandCalculator.calculatePokerHand(player.getCards());
		Assert.isInstanceOf(ThreeOfAKind.class, handIsThreeOfAKind,"Verifying that hand is three of a kind");
	}
	
}
