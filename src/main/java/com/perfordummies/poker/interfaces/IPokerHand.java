package com.perfordummies.poker.interfaces;

import java.util.List;

public interface IPokerHand{
	boolean verify(List<ICard> cards);
}