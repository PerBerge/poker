package com.perfordummies.poker.interfaces;

import java.util.List;

import com.perfordummies.poker.interfaces.IPlayer;

public interface IWinnerCalculator{
	public List<IPlayer> calculateWinner(List<IPlayer> players);
}