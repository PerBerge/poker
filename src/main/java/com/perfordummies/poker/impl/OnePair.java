package com.perfordummies.poker.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;
import com.perfordummies.poker.util.PokerUtility;

@Component("OnePair")
public class OnePair implements IPokerHand {

	private int handStrength = 20;
	@Override
	public int getHandStrength() {return handStrength;}
	@Override
	public IPokerHand verify(List<ICard> cards) {
		int numberOfPairs = numberOfPairs(cards);
		return numberOfPairs >0? this : null;
			
	}
	
	private int numberOfPairs(List<ICard> cards) {
		PokerUtility pokerUtility = new PokerUtility();
	    Map<String, Integer> ranksMap = pokerUtility.getCardRankMap(cards);
	    int numberOfPairs = 0;
	    for (Map.Entry<String, Integer> entry : ranksMap.entrySet()) {
	        if (entry.getValue() >= 2) {
	            numberOfPairs++;
	        }
	    }
	    return numberOfPairs;
	}

	
	
}
