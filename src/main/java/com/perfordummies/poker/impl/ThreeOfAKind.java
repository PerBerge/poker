package com.perfordummies.poker.impl;

import java.util.List;
import java.util.Map;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;
import com.perfordummies.poker.util.PokerUtility;

public class ThreeOfAKind implements IPokerHand {

	@Override
	public IPokerHand verify(List<ICard> cards) {
		
		return hasNumberOfCardsEqualToN(cards, 3) ? this : null;
		
//		List<Integer> numbers = Arrays.asList(1, 2, 1, 3, 4, 4);
//		Set<Integer> duplicated = numbers.stream().filter(n -> numbers.stream().filter(x -> x == n).count() > 1).collect(Collectors.toSet());
		
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
