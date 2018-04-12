package com.perfordummies.poker;

import java.util.HashSet;
import java.util.Set;

public class Player{
	public Player(String playerName) {
		setPlayerName(playerName);
	}
   private String playerName;
   private Set<Card> cards = new HashSet<Card>();
   public void setPlayerName(String playerName){this.playerName = playerName;}
   public String getPlayerName(){return playerName;}
   public void addCard(Card card){cards.add(card);}
}