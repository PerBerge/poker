package com.perfordummies.poker.impl;

import java.util.List;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;

public class Flush implements IPokerHand {

	@Override
	public boolean verify(List<ICard> cards) {
		
		return isAllSameSuit(cards);
	}

	private boolean isAllSameSuit(List<ICard> cards) {
	    for (int i = 1; i < cards.size(); i++) {
	        if (cards.get(i).getSuit() != cards.get(0).getSuit()) {
	            return false;
	        }
	    }

	    return true;
	}
	
	
}
