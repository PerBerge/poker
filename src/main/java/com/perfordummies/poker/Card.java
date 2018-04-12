package com.perfordummies.poker;

public class Card{
   private String suit;
   private String rank;
   
   public Card(String suit, String rank) {
	   setCard(suit,rank);
   }
   public void setCard(String suit, String rank){this.suit=suit; this.rank=rank;}
   public String getCard(){return suit + rank;}
   public String getSuit() {return suit;}
   public String getRank() {return rank;}
}