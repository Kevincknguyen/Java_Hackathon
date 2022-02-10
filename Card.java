
import java.util.HashMap;

public class Card {
	
	private String suit;
	private int rank;
	private String name;
	
    public Card(String suit, Integer rank) {
    	this.suit = suit;
    	this.rank = rank;
    	this.name = "";
    	
    	HashMap<Integer, String> names = new HashMap<Integer, String>();
        // make an if check if user has an Ace
				// if check if user can make the ace an 11 and not bust/go over 
				// default to 11 if under 21, set to 1 if over 21
				// check new value if ace switched to 1 check for bust with new value
				
				names.put(1, "Ace"); // default to 11 when ace function is working?????
        names.put(11, "Jack");
        names.put(12, "Queen");
				names.put(13, "King");
        
				// Methods
		
				// added - change the value of ace to 1
        // if (names.get(rank) != null && this.getRank()==1) {
        //     this.name = names.get(rank);
        //     this.setRank(1);
        // }
        // edited - change the value of the face cards to 10
        if (names.get(rank) != null) {
            System.out.println(this.getRank());
            this.name = names.get(rank);
            this.setRank(10);
        }
        else {
            this.name = Integer.toString(rank);
        }
    }
         
    
    public void showCard() {
        System.out.printf("%s of %s\n", this.name, this.suit);
    }

	// Getters & Setters
	public String getSuit() {
		return suit;
	}


	public void setSuit(String suit) {
		this.suit = suit;
	}


	public int getRank() {
		return rank;
	}


	public void setRank(int rank) {
		this.rank = rank;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
    
    
}