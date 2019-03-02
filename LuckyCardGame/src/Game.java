import javax.swing.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;


public class Game {
 // Global Variables
	static boolean keepPlaying = false;
// Creates a deck calld gameDeck
	static Deck gameDeck = new Deck();
	
	static int firstCard;
	static int secondCard;
	static int thirdCard;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to LuckyCard game!");
		do {	// Loop for game 
			playGame();
			getResult();
		    Scanner scanInput = new Scanner(System.in); 
			System.out.println("=========> Press ENTER to play again or “q” to quit: ↵");
		    String continueGame = scanInput.nextLine();  // Reads user input
		    
		    // If-statement that determents if the game should continue, loop
		    if(continueGame.equals("q")) { // Checks if user input contains "q"
				System.out.println("Thank you for playing and welcome back!");
				keepPlaying = false;
	
		    } else if(continueGame.isEmpty()) { // Checks if user input is empty (only ENTER)
				keepPlaying = true;
		    }
		} while(keepPlaying == true);
	}

	public static void playGame(){
		System.out.println("------- Playing a game round");
		gameDeck.shuffleDeck(); // Makes sure the deck is always shuffled before each round
		
		firstCard = gameDeck.drawFirstCard();
		secondCard = gameDeck.drawSecondCard();
		thirdCard = gameDeck.drawThirdCard();
	}
/* Method for calculating the result */	
	public static void getResult() {
		int winningCard;
		int[] gameCards = {firstCard, secondCard, thirdCard}; // Puts the total values of all cards into an array
		Arrays.sort(gameCards); // Sorts the array 
		
		winningCard = gameCards[1]; // The winning card is always the [2]index
		if(thirdCard == winningCard) {
			System.out.println("You win!");
		} else if(thirdCard == gameCards[0]||thirdCard == gameCards[2]){ // Makes sure the player loses if the third card is equal to the first or last
			System.out.println("You lose!");
		} else {
			System.out.println("You lose!");
		}
			
	}
}

