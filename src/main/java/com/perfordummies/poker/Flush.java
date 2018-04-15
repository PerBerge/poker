package com.perfordummies.poker;

import java.util.List;

public class Flush implements IPokerHand {

	@Override
	public boolean verify(List<Card> cards) {
		
		return isAllSameSuit(cards);
	}

	private boolean isAllSameSuit(List<Card> cards) {
	    for (int i = 1; i < cards.size(); i++) {
	        if (cards.get(i).getSuit() != cards.get(0).getSuit()) {
	            return false;
	        }
	    }

	    return true;
	}
	
	
}
