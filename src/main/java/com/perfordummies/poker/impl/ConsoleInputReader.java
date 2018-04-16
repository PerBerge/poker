package com.perfordummies.poker.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.perfordummies.poker.interfaces.IInputReader;
import com.perfordummies.poker.interfaces.IPlayer;

@Component
public class ConsoleInputReader implements IInputReader {

	@Override
	public List<IPlayer> receive(String[] input) {
		List<IPlayer> players = new ArrayList<IPlayer>();
		int i=0;

        while(i<input.length) {	
        	
	          String name = input[i].toString();
	          IPlayer player = new Player(name);
	          i++;
	          int cardCount=i+4;
	          while(i< cardCount) {
	        	  String inputCard=input[i].toString();
	        	  String rank=inputCard.substring(0, 1);
	        	  String suit=inputCard.substring(1,2);
	        	  player.addCard(new Card(rank,suit));
	        	 
	        	  i++;
	          }
	          
	         players.add(player);
	         System.out.println(name);
			  i++;
	         }
     return players;   
	}
}
