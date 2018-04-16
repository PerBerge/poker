package com.perfordummies.poker.impl;

import java.util.ArrayList;
import java.util.List;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPlayer;
import com.perfordummies.poker.interfaces.IPokerHand;

public class Player implements IPlayer{
	public Player(String playerName) {
		setPlayerName(playerName);
	}
	private IPokerHand pokerHand;
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

@Override
public void setPokerHand(IPokerHand pokerHand) {this.pokerHand=pokerHand;}
@Override
public IPokerHand getPokerHand() {return pokerHand;}
   
   
}