package com.perfordummies.poker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Player{
	public Player(String playerName) {
		setPlayerName(playerName);
	}
   private String playerName;
   private List<Card> cards = new ArrayList<Card>();
   public void setPlayerName(String playerName){this.playerName = playerName;}
   public String getPlayerName(){return playerName;}
   public void addCard(Card card){cards.add(card);}
   public List<Card> getCards(){return cards;}
   
   private Map<String, Integer> ranksMap;

	public Map<String, Integer> getCardRankMap(List<Card> cards) {
	    if (ranksMap == null) {
	        ranksMap = new HashMap<String, Integer>();
	        for (Card card : cards) {
	            if (ranksMap.containsKey(card.getRank())) {
	                String rank = card.getRank();
	                int count = ranksMap.get(rank);
	                ranksMap.put(rank, count + 1);
	            } else {
	                ranksMap.put(card.getRank(), 1);
	            }

	        }
	    }

	    return ranksMap;
	}
}