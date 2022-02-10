import java.util.ArrayList;
import java.util.Random;

public class TestDeck {

	public static void main(String[] args) {
		System.out.println("-------Game Setup---------");
		Deck myDeck = new Deck();
        User user1=new User();
        User user2=new User();
		for (Card card: myDeck.getCards()) {
			card.showCard();
		}
		
        ArrayList<Card> deck = myDeck.getCards();
        System.out.println(deck.size());
    
        System.out.println("Start game");
        System.out.println("-------Each Player Draw 2---------");
        user1.draw(deck);
        user1.draw(deck);
        user2.draw(deck);
        user2.draw(deck);
        


        System.out.println("-------Player 1 turn---------");
    while (user1.getHandTotal()<=21){
        System.out.println("-------Current hand Total---------");
        user1.showHand();
        System.out.println(user1.getHandTotal());
        System.out.println("Would you like to draw again Player 1? Y/N");
        String answer = System.console().readLine();
        if (answer.equals("Y")){
					user1.draw(deck);
                    user1.showHand();
					if (user1.getHandTotal()>21){
                        System.out.println("User has BUSTED");
                    }
        }
        else if (answer.equals("N")){
            System.out.println("User stays.");
            break;
        }
    }
    System.out.println("-------Player 2 turn---------");
    while (user2.getHandTotal()<=21){
        System.out.println("-------Current hand Total---------");
        user2.showHand();
        System.out.println(user2.getHandTotal());
        System.out.println("Would you like to draw again Player 2? Y/N");
        String answer = System.console().readLine();
        if (answer.equals("Y")){
					user2.draw(deck);
                    user2.showHand();
					if (user2.getHandTotal()>21){
                        System.out.println("User has BUSTED");
                    }
        }
        else if (answer.equals("N")){
            System.out.println("User stays.");
            break;
        }
    }
    System.out.println("-------Current hand Total Player 1---------");
    System.out.println(user1.getHandTotal());
    System.out.println("-------Current hand Total Player 2---------");
    System.out.println(user2.getHandTotal());


    System.out.println("-------Result---------");
    if (user1.getHandTotal()>21 || user2.getHandTotal()>21){
        if (user1.getHandTotal()>21 && user2.getHandTotal()<21){
           System.out.println("User 1 busted. User 2 wins");
        }
        if (user2.getHandTotal()>21 && user1.getHandTotal()<21){
            System.out.println("User 2 busted. User 1 wins");
        }
        if (user2.getHandTotal()>21 && user1.getHandTotal()>21){
            System.out.println("Both users busted");
        }
    }
    else{
        if (user1.getHandTotal()>user2.getHandTotal()){
            System.out.println("User 1 wins");
        }
        else if (user1.getHandTotal()<user2.getHandTotal()){
            System.out.println("User 2 wins");
        }
        else if (user1.getHandTotal()==user2.getHandTotal()){
            System.out.println("Cowards!!!!");
        }
    }
    System.out.println("-------Final Deck size---------");
    System.out.println(deck.size());






	}
    

    // private static ArrayList<Card> getSlice(ArrayList<Card> cards, int i, int j) {
    //     return null;
    // }

}



// BLACKJACK
//     Deal 1 card to player
//             randomize card
//             add to user hand Array
//             if card is ace choose 1 or 11
//             add value to user total array
//             remove card from deck
//     Deal 1 card to player
//             randomize card
//             add to user hand Array
//             if card is ace choose 1 or 11
//             add value to user total array
//             remove card from deck
//     DISPLAY cards in hand method
//     PLAYER 1 input hit or stay
//     Hit->Deal 1 card to player
//             randomize card
//             add to user hand Array
//             if card is ace choose 1 or 11
//             add value to user total array
//             remove card from deck
//         IF CHECK ON USER total
//         IF BUST go to Player 2
//             IF NOT BUST{
//                 REPEAT HIT OR STAY
//             }

//     EMPTY USER HAND
//     Stay->Player 2 and repeat steps


// }
// AT VERY END EMPTY TOTAL FOR BOTH PLAYERS
