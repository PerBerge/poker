package com.perfordummies.poker;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.util.Assert;

import com.perfordummies.poker.impl.Card;
import com.perfordummies.poker.impl.ConsoleWinnerOutputter;
import com.perfordummies.poker.impl.Player;
import com.perfordummies.poker.impl.PokerHandCalculator;
import com.perfordummies.poker.impl.WinnerCalculator;
import com.perfordummies.poker.interfaces.IPlayer;
import com.perfordummies.poker.interfaces.IPokerHand;
import com.perfordummies.poker.interfaces.IPokerHandCalculator;
import com.perfordummies.poker.interfaces.IWinnerCalculator;
import com.perfordummies.poker.interfaces.IWinnerOutputter;

public class PokerHandWinnerTest {

	
	
	@Test
	public void calculateWinnerHand() {
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
		player1.setPokerHand(player1Hand);
		 pokerHandCalculator = new PokerHandCalculator();
		IPokerHand player2Hand = pokerHandCalculator.calculatePokerHand(player2.getCards());
		player2.setPokerHand(player2Hand);
		List<IPlayer> players = new ArrayList<IPlayer>();
		players.add(player1);
		players.add(player2);
		IWinnerCalculator winnerCalculator = new WinnerCalculator();
		List<IPlayer> winners = winnerCalculator.calculateWinner(players);
		
		Assert.isTrue(winners.get(0).getPlayerName().equals("William"),"Winner is William");
//		IWinnerOutputter winnerOutputter = new ConsoleWinnerOutputter();
	}
	
	@Test
	public void printWinnerHand() {
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
		player1.setPokerHand(player1Hand);
		 pokerHandCalculator = new PokerHandCalculator();
		IPokerHand player2Hand = pokerHandCalculator.calculatePokerHand(player2.getCards());
		player2.setPokerHand(player2Hand);
		List<IPlayer> players = new ArrayList<IPlayer>();
		players.add(player1);
		players.add(player2);
		IWinnerCalculator winnerCalculator = new WinnerCalculator();
		List<IPlayer> winners = winnerCalculator.calculateWinner(players);
		
		
		IWinnerOutputter winnerOutputter = new ConsoleWinnerOutputter();
		winnerOutputter.outputWinner(winners);
		
		Assert.isTrue(winners.get(0).getPlayerName().equals("William"),"Winner is William");
	}
}
