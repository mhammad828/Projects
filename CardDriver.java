
public class CardDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card cardArray[] = new Card[52];
		String suit[]= {"Hearts","Diamonds","Clubs","Spades"};
		String rank[]= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		int x = 0;
		
		for(int s =0; s<4; s++) {
			for(int j = 0; j<13; j++) {
				cardArray[x]= new Card(suit[s], rank[j]);
				System.out.println(cardArray[x].toString());
				x++;

			}
		}
		for(int y = 0; y<100; y++) {
			Card temporary;

			int a = (int)(Math.random()*52);
			int b = (int)(Math.random()*52);

			temporary = cardArray[a];
			cardArray[a] = cardArray[b];
			cardArray[b] = temporary;

			if(y == 99) {
				Card Check = new Card("Clubs","Queen");
				for(int i = 0; i<52; i++) {
					System.out.println(cardArray[i].toString());	
				}

				for(int i = 0; i<52; i++) {

					if(Check.equals(cardArray[i])) {
						System.out.println("The queen of clubs is located at position " + i);
					}
				}
			}
		}
	}

}
