package com.perfordummies.poker.impl;

import com.perfordummies.poker.interfaces.ICard;

public class Card implements ICard{
   private String suit;
   private String rank;
   
   public Card(String rank, String suit) {
	   setCard(rank, suit);
   }
   public void setCard(String rank, String suit){this.suit=suit; this.rank=rank;}
   public String getCard(){return rank +suit;}
   public String getSuit() {return suit;}
   public String getRank() {return rank;}
}