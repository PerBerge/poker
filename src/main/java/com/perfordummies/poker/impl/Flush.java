package com.perfordummies.poker.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;

@Component("Flush")
public class Flush implements IPokerHand {

	private int handStrength = 40;
	@Override
	public int getHandStrength() {return handStrength;}
	
	@Override
	public IPokerHand verify(List<ICard> cards) {
		return isAllSameSuit(cards) ? this : null;
	}

	private boolean isAllSameSuit(List<ICard> cards) {
	    for (int i = 1; i < cards.size(); i++) {
	        if (!cards.get(i).getSuit().equalsIgnoreCase(cards.get(0).getSuit())) {
	            return false;
	        }
	    }

	    return true;
	}
	
	
}
