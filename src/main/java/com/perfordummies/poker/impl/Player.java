package com.perfordummies.poker.impl;

import java.util.ArrayList;
import java.util.List;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPlayer;

public class Player implements IPlayer{
	public Player(String playerName) {
		setPlayerName(playerName);
	}
   private String playerName;
   private List<ICard> cards = new ArrayList<ICard>();
   @Override
public void setPlayerName(String playerName){this.playerName = playerName;}
   @Override
public String getPlayerName(){return playerName;}
   @Override
public void addCard(ICard card){cards.add(card);}
   @Override
public List<ICard> getCards(){return cards;}
   
   
}