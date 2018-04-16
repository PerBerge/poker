package com.perfordummies.poker;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.perfordummies.poker.impl.ConsoleInputReader;
import com.perfordummies.poker.interfaces.IInputReader;
import com.perfordummies.poker.interfaces.IPlayer;
import com.perfordummies.poker.interfaces.IPokerHandCalculator;
import com.perfordummies.poker.interfaces.IWinnerCalculator;
import com.perfordummies.poker.interfaces.IWinnerOutputter;

@SpringBootApplication(scanBasePackages = {"com.perfordummies.poker.impl"})
public class PokerApplication implements CommandLineRunner{
	
	@Autowired
	IInputReader inputReader;
	
	@Autowired
	IPokerHandCalculator pokerHandCalculator;
	
	@Autowired
	IWinnerCalculator winnerCalculator;
	
	@Autowired
	IWinnerOutputter winnerOutputter;
	
	public static void main(String[] args) {
		SpringApplication.run(PokerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		inputReader = new ConsoleInputReader();
		List<IPlayer> players = inputReader.receive(args);
		
		for(IPlayer player : players) {
			player.setPokerHand(pokerHandCalculator.calculatePokerHand(player.getCards()));
		}
		List<IPlayer> winners = winnerCalculator.calculateWinner(players);
		winnerOutputter.outputWinner(winners);
        System.exit(0);
		
        
	        
	}
	
	
}
