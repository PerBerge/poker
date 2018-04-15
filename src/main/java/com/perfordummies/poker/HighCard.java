package com.perfordummies.poker;

import java.util.List;

public class HighCard implements IPokerHand {

	@Override
	public boolean verify(List<Card> cards) {
		return true;
	}
	
}
