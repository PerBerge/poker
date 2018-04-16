package com.perfordummies.poker.impl;

import java.util.List;

import com.perfordummies.poker.interfaces.IPlayer;
import com.perfordummies.poker.interfaces.IWinnerOutputter;

public class ConsoleWinnerOutputter implements IWinnerOutputter{

	@Override
	public void outputWinner(List<IPlayer> players) {
		System.out.println("Winner(s) are: ");
		for(IPlayer player : players)
			System.out.println(player.getPlayerName());
	}
	
}