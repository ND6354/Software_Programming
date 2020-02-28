
public class Deck extends Card{

	public void newDeck() {
		//pre-condition: no deck object is created
		//post-condition: creates a deck deck object
		Deck another = new Deck();
	}
	
	public void getCard(Card c) {
		//pre-condition: users has no card in hand
		//post-condition: users get two card randomly in hand
	}
	
	Card drawCard(Card c) {
		//pre-condition: total value of cards in user's hand does not exceed 21
		//post-condition: adds a new card to the player
		return c;
	}
	
	
	public void stopDraw() {
		//pre-condition: users decide to stop adding card to hand
		//post-condition: no more card is added to user hand
	}
	
	public void displayFrontSide() {
		//pre-condition: two Cards are passed out
		//post-condition: Shows the values of a card based on user decision
	}
	
	public void displayBackSide() {
		//pre-condition: two cards are passed out
		//post-condition: Shows back side of card to all users except the player
	}
	
	public void Shuffle(Deck d) {
		//pre-condition: Receives a deck of 52 cards
		//post-condition: randomizes order of the deck
	}
	private
		Card[] DOC =  new Card[52];
}
