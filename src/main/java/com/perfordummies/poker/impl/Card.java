package com.perfordummies.poker.impl;

import com.perfordummies.poker.interfaces.ICard;

public class Card implements ICard{
	private String suit;
	private String rank;

	public Card(String rank, String suit) {
		setCard(rank, suit);
	}
	@Override
	public void setCard(String rank, String suit){this.suit=suit; this.rank=rank;}
	@Override
	public String getCard(){return rank +suit;}
	@Override
	public String getSuit() {return suit;}
	@Override
	public String getRank() {return rank;}
}