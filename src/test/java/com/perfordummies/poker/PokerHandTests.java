package com.perfordummies.poker;

import org.junit.Test;
import org.springframework.util.Assert;

import com.perfordummies.poker.impl.Card;
import com.perfordummies.poker.impl.Flush;
import com.perfordummies.poker.impl.HighCard;
import com.perfordummies.poker.impl.OnePair;
import com.perfordummies.poker.impl.Player;
import com.perfordummies.poker.impl.ThreeOfAKind;
import com.perfordummies.poker.interfaces.IPlayer;
import com.perfordummies.poker.interfaces.IPokerHand;

public class PokerHandTests {
	IPlayer player=null;
	
	public void initPlayer() {
		player = new Player("Per");
		
	}
	@Test
	public void testIfThreeOfAKind() {
		initPlayer();
		
		player.addCard(new Card("3","C"));
		player.addCard(new Card("3","D"));
		player.addCard(new Card("3","S"));
		player.addCard(new Card("8","C"));
		player.addCard(new Card("10","D"));
		
		IPokerHand pokerHand = new ThreeOfAKind();
		IPokerHand handIsThreeOfAKind = pokerHand.verify(player.getCards());
		Assert.isInstanceOf(ThreeOfAKind.class, handIsThreeOfAKind,"Verifying that hand is three of a kind");
		
	}
	@Test
	public void testNotThreeOfAKind() {
		initPlayer();
		
		player.addCard(new Card("3","C"));
		player.addCard(new Card("4","D"));
		player.addCard(new Card("3","S"));
		player.addCard(new Card("8","C"));
		player.addCard(new Card("10","D"));
		
		IPokerHand pokerHand = new ThreeOfAKind();
		IPokerHand notThreeOfAKind = pokerHand.verify(player.getCards());
		Assert.isNull(notThreeOfAKind,"Verify that hand is not three of a kind");
		
	}
	
	@Test
	public void testIfPair() {
		initPlayer();
		
		player.addCard(new Card("3","C"));
		player.addCard(new Card("3","D"));
		player.addCard(new Card("3","S"));
		player.addCard(new Card("8","C"));
		player.addCard(new Card("8","D"));
		
		IPokerHand pokerHand = new OnePair();
		IPokerHand hand = pokerHand.verify(player.getCards());
		Assert.isInstanceOf(OnePair.class,hand,"Verifying that hand is at least a pair");
		
	}
	@Test
	public void testNotAPair() {
		initPlayer();
		
		player.addCard(new Card("3","C"));
		player.addCard(new Card("4","D"));
		player.addCard(new Card("6","S"));
		player.addCard(new Card("9","C"));
		player.addCard(new Card("8","D"));
		
		IPokerHand pokerHand = new OnePair();
		IPokerHand hand = pokerHand.verify(player.getCards());
		Assert.isNull(hand,"Verifying that hand is not a pair");
		
	}
	
	@Test
	public void testIfFlush() {
		initPlayer();
		
		player.addCard(new Card("3","C"));
		player.addCard(new Card("4","C"));
		player.addCard(new Card("1","C"));
		player.addCard(new Card("8","C"));
		player.addCard(new Card("10","C"));
		
		IPokerHand pokerHand = new Flush();
		IPokerHand hand = pokerHand.verify(player.getCards());
		Assert.isInstanceOf(Flush.class,hand,"Verifying that hand is a Flush");
		
	}
	
	@Test
	public void testNotAFlush() {
		initPlayer();
		
		player.addCard(new Card("3","C"));
		player.addCard(new Card("4","C"));
		player.addCard(new Card("1","S"));
		player.addCard(new Card("8","C"));
		player.addCard(new Card("10","C"));
		
		IPokerHand pokerHand = new Flush();
		IPokerHand hand = pokerHand.verify(player.getCards());
		Assert.isNull(hand,"Verifying that hand is not a Flush");
	}
	@Test
	public void testIfHighCard() {
		initPlayer();
		
		IPokerHand pokerHand = new HighCard();
		IPokerHand hand = pokerHand.verify(player.getCards());
		Assert.isInstanceOf(HighCard.class,hand,"Verfiying that hand is a high card.");
		
	}
}
