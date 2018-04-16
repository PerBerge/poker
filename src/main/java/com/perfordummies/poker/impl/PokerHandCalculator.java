package com.perfordummies.poker.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.ICard;
import com.perfordummies.poker.interfaces.IPokerHand;
import com.perfordummies.poker.interfaces.IPokerHandCalculator;

@Component
public final class PokerHandCalculator implements IPokerHandCalculator{
		
   @Override
public final IPokerHand calculatePokerHand(List<ICard> cards){
      IPokerHand pokerHand=null;
           
      pokerHand = new Flush().verify(cards);
      if(pokerHand !=null) return pokerHand;
      
      pokerHand = new ThreeOfAKind().verify(cards);
      if(pokerHand !=null) return pokerHand;
      
      pokerHand = new OnePair().verify(cards);
      if(pokerHand !=null) return pokerHand;
      
      pokerHand = new HighCard().verify(cards);
      return pokerHand;
   }
}