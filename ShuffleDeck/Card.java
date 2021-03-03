
public class Card {
	private String suit;
	private String rank;

	public Card() {
		suit = "Ace";
		rank = "Clubs";
	}
	public Card(String suit, String rank) {
		setSuit(suit);
		setRank(rank);
	}
	public String getSuit() {
		return this.suit;
	}
	private void setSuit(String suit) {
		this.suit = suit; 
	}
	public String getRank() {
		return this.rank;
	}
	private void setRank(String rank) {
		this.rank = rank;
	}
	public Card clone() {
		Card clone= new Card();
		clone.setSuit(this.getSuit());
		clone.setRank(this.getRank());
		return clone;
	}
	public boolean equals(Card guest) {
		if(guest.suit == this.suit) {
			if(guest.rank == this.rank) {
				return true;
			}
		}return false;
	}

	public String toString() {
		String print = "This card is the " + rank + " of " + suit;
		return print;
	}
}
