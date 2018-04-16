package com.perfordummies.poker.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.perfordummies.poker.interfaces.ICard;

public class PokerUtility {

	private static Map<String, Integer> ranksMap;

	public static Map<String, Integer> getCardRankMap(List<ICard> cards) {
	    if (ranksMap == null) {
	        ranksMap = new HashMap<String, Integer>();
	        for (ICard card : cards) {
	            if (ranksMap.containsKey(card.getRank())) {
	                String rank = card.getRank();
	                int count = ranksMap.get(rank);
	                ranksMap.put(rank, count + 1);
	            } else {
	                ranksMap.put(card.getRank(), 1);
	            }

	        }
	    }

	    return ranksMap;
	}
}
