package com.perfordummies.poker.interfaces;

import java.util.List;

public interface IPokerHandCalculator {
	public IPokerHand calculatePokerHand(List<ICard> cards);
}
