//Felix Olieveira-Machado
//Jose Delgadillo
//01-30-25

//package cardGame;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CardGame {

	private static ArrayList<Card> deckOfCards = new ArrayList<Card>();
	private static ArrayList<Card> playerCards = new ArrayList<Card>();


	public static void main(String[] args) {

		Scanner input = null;
		try {
			input = new Scanner(new File("cards.txt"));
		} catch (FileNotFoundException e) {
			// error
			System.out.println("error");
			e.printStackTrace();
		}

		while(input.hasNext()) {
			String[] fields  = input.nextLine().split(",");
			//	public Card(String cardSuit, String cardName, int cardValue, String cardPicture) {
			Card newCard = new Card(fields[0], fields[1].trim(),
					Integer.parseInt(fields[2].trim()), fields[3]);
			deckOfCards.add(newCard);	
		}
		
		//for(Card c: deckOfCards)
			//System.out.println(c);

		//deal the player 5 cards
		//Changd the i to a 0 to continually deal cards without removing any
		for(int i = 0; i < 5; i++) {
			playerCards.add(deckOfCards.remove(0));
		}
		
		System.out.println("players cards");
		for(Card c: playerCards)
			System.out.println(c);

		System.out.println("pairs is " + checkFor2Kind());

	}//end main

	public static void shuffle() {
        // Shuffles cards without deleting and reinserting
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		Collections.shuffle(deckOfCards);
		}
	}

	//check for 2 of a kind in the players hand
	public static boolean checkFor2Kind() {
		//Adding a Counter that Counts Player pairs
		int playerPairs = 0;
		
		for(int i = 0; i < playerCards.size() - 1; i++) {
			Card current = playerCards.get(i);
			Card next = playerCards.get(i+1);

			int count =0;
			
			for(int j = i+1; j < playerCards.size(); j++) {
				next = playerCards.get(j);
				System.out.println(" comparing " + current);
				System.out.println(" to " + next);
				if(current.equals(next))
					count++;
			}//end of inner for
			if(count == 1){
			//Added a player count to count the amount of times a player gets a pair
				playerPairs++;
				System.out.println(playerPairs);
				//removed return true
			}

		}//end outer for
		//Removed the return false
	}
}//end class
