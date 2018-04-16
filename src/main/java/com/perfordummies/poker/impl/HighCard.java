package com.perfordummies.poker.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;

@Component("HighCard")
public class HighCard implements IPokerHand {

	private int handStrength = 10;
	@Override
	public int getHandStrength() {return handStrength;}
	@Override
	public IPokerHand verify(List<ICard> cards) {
		return this;
	}

	
	
}
