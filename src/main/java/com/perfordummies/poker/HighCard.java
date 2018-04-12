package com.perfordummies.poker;

import java.util.Set;

public class HighCard implements IPokerHand {

	@Override
	public boolean verify(Set<Card> cards) {
		return true;
	}
	
}
