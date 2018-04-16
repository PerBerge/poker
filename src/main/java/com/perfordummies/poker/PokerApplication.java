package com.perfordummies.poker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.perfordummies.poker.impl.Card;
import com.perfordummies.poker.impl.Player;
import com.perfordummies.poker.interfaces.IPlayer;

@SpringBootApplication
public class PokerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PokerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		  if (args.length > 0 && args.length<6) {			
	          String name = args[0].toString();
	          IPlayer player = new Player(name);
	         
	          for(int i=1;i<args.length;i++) {
	        	  String inputCard=args[i].toString();
	        	  String suit=inputCard.substring(0, 1);
	        	  String rank=inputCard.substring(1,2);
	        	  player.addCard(new Card(suit,rank));  
	          }
	         
	          System.out.println(name);
			  
	         } else {
	             System.out.println("Invalid parameters");
	         }
	         System.exit(0);
		
	}
	
	
}
