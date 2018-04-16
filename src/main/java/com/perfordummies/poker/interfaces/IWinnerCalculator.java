package com.perfordummies.poker.interfaces;

import java.util.List;

public interface IWinnerCalculator{
	public List<IPlayer> calculateWinner(List<IPlayer> players);
}