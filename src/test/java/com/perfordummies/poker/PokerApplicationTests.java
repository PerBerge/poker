package com.perfordummies.poker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class PokerApplicationTests {
	Player player=null;
	@Test
	public void contextLoads() {
	}

	public void init() {
		player = new Player("Per");
		//3C, 3D, 3S, 8C, 10D
		player.addCard(new Card("3","C"));
		player.addCard(new Card("3","D"));
		player.addCard(new Card("3","S"));
		player.addCard(new Card("8","C"));
		player.addCard(new Card("10","D"));
	}
	@Test
	public void testIfThreeOfAKind() {
		init();
		
		IPokerHand pokerHand = new ThreeOfAKind();
		boolean hasThreeOfAKind = pokerHand.verify(player.getCards());
		Assert.isTrue(hasThreeOfAKind,"Three of a kind");
		
	}
	
	@Test
	public void testIfPair() {
		init();
		
		IPokerHand pokerHand = new OnePair();
		boolean hasAtLeastAPair = pokerHand.verify(player.getCards());
		Assert.isTrue(hasAtLeastAPair,"Has at least a pair");
		
	}
	
	@Test
	public void testIfFlush() {
		init();
		
		IPokerHand pokerHand = new Flush();
		boolean hasFlush = pokerHand.verify(player.getCards());
		Assert.isTrue(hasFlush,"Has a Flush");
		
	}
	@Test
	public void testIfHighCard() {
		init();
		
		IPokerHand pokerHand = new HighCard();
		boolean hasHighCard = pokerHand.verify(player.getCards());
		Assert.isTrue(hasHighCard,"Has high card");
		
	}
}
