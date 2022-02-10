import java.util.ArrayList;
import java.util.Random;

public class User {
    private Integer handTotal;
    private ArrayList<Card> hand;

    // Constructor
    public User() {
        this.handTotal = 0;
        this.hand = new ArrayList<Card>();
    }
  
    // Methods

    // Checks if user's hand is over 21 in value (Busted)
    public boolean isOver21() {
        return this.getHandTotal() <= 21 ? false : true;
    }

    // Calculates hand total and checks if ace is 1 or 11
    // check current total
    // if total > 11
    // check users hand for aces
    // if total >= 11 -> ace = 1 Default value
    // if total < 11 ace = 11
    
    // public int Aces() {
        // 12? Ace and 10 value edge case for 2 cards
        // int aceValue = this.getHandTotal() < 12 ? 
        //     (aceValue = 11) : (aceValue = 1);
        // Loops through user
    //     int i = 0;
    //     while (i < this.hand.size()) {
	// 		if (this.hand.get(i).getRank()==1){
    //             this.setHandTotal()
    //         }
    //         i++;
    //     }
    // }

    public void draw(ArrayList<Card>deck){
        Random random= new Random();
        int i = random.nextInt(deck.size());  // pull any card from the deck
        
        System.out.println("---------THIS CARD---------");
        deck.get(i).showCard();

        // Adds the VALUE of the card you just drew into your hand total
        this.setHandTotal(deck.get(i).getRank());
         
        // Adds the CARD OBJECT to the users hand
        this.hand.add(deck.get(i)); 
        // Removes card from deck
        deck.remove(i);
    }

    public void showHand() {
        System.out.println("-------THIS IS MY HAND---------");
        for (Card card : hand) {
            card.showCard();
        }
    }
    
    // Getters & Setters     
    public void setHandTotal(Integer value) {    
        this.handTotal += value;
    }
    
    public int getHandTotal() {
        return this.handTotal;
    }

}