package com.perfordummies.poker.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.IPlayer;
import com.perfordummies.poker.interfaces.IWinnerCalculator;

@Component
public class WinnerCalculator implements IWinnerCalculator{
	@Override
	public List<IPlayer> calculateWinner(List<IPlayer> players) {
		int highestHand = players.stream().mapToInt(x -> x.getPokerHand().getHandStrength()).max().orElse(-1);
		List<IPlayer> winners = players.stream().filter(s -> s.getPokerHand().getHandStrength() == highestHand).collect(Collectors.toList());
		return winners;
		
	}
}