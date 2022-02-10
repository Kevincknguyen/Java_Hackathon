

import java.util.ArrayList;

public class Deck {
	
	private ArrayList<Card> cards;
	
    public Deck() {
        this.cards = new ArrayList<Card>();

        // Populate the cards list -- loop to 52
        for (String name : new String[] {"Hearts", "Clubs", "Diamonds", "Spades"}) {
            // Integer i = 1;
            for (Integer rank = 1; rank <= 13; rank++) {
                // i = rank;
                // if (rank > 10){
                //     i = 10;
                // }
                this.cards.add(new Card(name, rank));
            }
        }
    }

	public ArrayList<Card> getCards() {
		return cards;
	}

	public void setCards(ArrayList<Card> cards) {
		this.cards = cards;
	}
    
}