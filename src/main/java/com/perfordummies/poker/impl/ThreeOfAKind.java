package com.perfordummies.poker.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;
import com.perfordummies.poker.util.PokerUtility;

@Component("ThreeOfAKind")
public class ThreeOfAKind implements IPokerHand {

	private int handStrength = 30;
	@Override
	public int getHandStrength() {return handStrength;}
	
	@Override
	public IPokerHand verify(List<ICard> cards) {
		return hasNumberOfCardsEqualToN(cards, 3) ? this : null;
	}
	
	private boolean hasNumberOfCardsEqualToN(List<ICard> cards, int number) {
		PokerUtility pokerUtility = new PokerUtility();
        Map<String, Integer> ranksMap = pokerUtility.getCardRankMap(cards);
        for (Map.Entry<String, Integer> entry : ranksMap.entrySet()) {

            if (entry.getValue() == number) {
                return true;
            }

        }
        return false;
    }

	
	
}
