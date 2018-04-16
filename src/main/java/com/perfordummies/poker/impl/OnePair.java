package com.perfordummies.poker.impl;

import java.util.List;
import java.util.Map;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;
import com.perfordummies.poker.util.PokerUtility;

public class OnePair implements IPokerHand {

	@Override
	public boolean verify(List<ICard> cards) {
		int numberOfPairs = numberOfPairs(cards);
		if(numberOfPairs >0)
			return true;
		
		return false;
	}
	
	private int numberOfPairs(List<ICard> cards) {
	    Map<String, Integer> ranksMap = PokerUtility.getCardRankMap(cards);
	    int numberOfPairs = 0;
	    for (Map.Entry<String, Integer> entry : ranksMap.entrySet()) {
	        if (entry.getValue() >= 2) {
	            numberOfPairs++;
	        }
	    }
	    return numberOfPairs;
	}

	
	
}
