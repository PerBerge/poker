package com.perfordummies.poker.impl;

import java.util.List;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;

public class HighCard implements IPokerHand {

	@Override
	public IPokerHand verify(List<ICard> cards) {
		return this;
	}
	
}
