package com.perfordummies.poker.interfaces;

import java.util.List;

public interface IPlayer{
   //public IPlayer(String playerName);
   public void setPlayerName(String playerName);
   public String getPlayerName();
   public void addCard(ICard card);
   public List<ICard> getCards();
   
   
}