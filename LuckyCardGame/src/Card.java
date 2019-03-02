public class Card {
	
	private String cardType;
	private int cardVal;
	private int cardBonus;
	private int cardTotalVal;
	
	int cardTypeNum;

	
	public Card(int cardTypeNum, int cardVal) {
		getCardType(cardTypeNum);
		getCardVal(cardVal);		
	}

	public int getCardVal(int inVal) {
		cardVal = inVal;
		return cardVal;
	}

/* Method that converts number 1-4 into card types  */
	public void getCardType(int inCardNum) {
		cardTypeNum = inCardNum;
	
		switch (cardTypeNum) {
		case 1: cardType = "Hearts";
			break;
		case 2: cardType = "Diamonds";
			break;
		case 3: cardType = "Spades";
			break;
		case 4: cardType = "Clubs";
			break;
		default: cardType = "Invalid card type!";
		}
        getCardBonus(cardType);

	}
/* Method for assigning the correct bonus for corresponding card type */	
	 public void getCardBonus(String inCardType) {
		 cardType = inCardType;

		switch (cardType) {
		case "Hearts": cardBonus = 8;
			break;
		case "Diamonds":  cardBonus = 4;
			break;
		case "Spades": cardBonus = 10;
			break;
		case "Clubs":  cardBonus = 6;
			break;
		default: System.out.println("Invalid CardBonus");
		}

	}
/* Method for calculating the total value of a card */		 
	 public int getTotal() {
		 cardTotalVal = (cardVal + cardBonus);
		 return cardTotalVal;
	 }
/* An override for toString printing out all the values of the card */	              
	  @Override
	  public String toString() {
		  return cardType + " Of " + cardVal + " + "+ "bonus: " + cardBonus + " → " + "Total: " + getTotal(); 
	  }
	  
}

