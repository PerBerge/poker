package com.perfordummies.poker.interfaces;

import java.util.List;

public interface IPokerHand{
	int getHandStrength();
	IPokerHand verify(List<ICard> cards);
}