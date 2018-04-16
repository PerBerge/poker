package com.perfordummies.poker.interfaces;

import java.util.List;

public interface IPokerHand{
	IPokerHand verify(List<ICard> cards);
}