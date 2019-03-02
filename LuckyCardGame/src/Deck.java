import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    ArrayList<Card> cardDeck = new ArrayList<Card>();
    String cardDeckString;
    
	public Deck(){
		fillDeck();
		shuffleDeck();
	
	}
/* Method that fills the card deck with 52 cards */	
	public void fillDeck() {
		// First for-loop assigns card type
		for(int cardColor = 1; cardColor < 5; cardColor++) {
			// Second for-loop assigns card value
			for(int cardVal = 1; cardVal <14; cardVal++) {
			Card newCard = new Card(cardColor, cardVal);
			cardDeck.add(newCard); // Uses .add to add card objects into the array
			}
		}
	}
/* Method using shuffle to make sure the deck is randomized*/
	public void shuffleDeck() {
		Collections.shuffle(cardDeck);
	}
/* Method for getting the first card element at index [0]*/
	public int drawFirstCard() {	
		Card firstCard =  cardDeck.get(0);
			System.out.println("Card 1" + ": "  + firstCard);
	
			return firstCard.getTotal(); // gets total value of card
	}

/* Method for getting the second card element at index [1]*/
	public int drawSecondCard() {	
		Card secondCard =  cardDeck.get(1);
			System.out.println("Card 2" + ": "  + secondCard);
			
			return secondCard.getTotal();
	}
/* Method for getting the third card element at index [2]*/	
	public int drawThirdCard() {	
		Card thirdCard =  cardDeck.get(2);
			System.out.println("Card 3" + ": "  + thirdCard);
			return thirdCard.getTotal();
	}
	



}
