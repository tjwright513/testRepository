package WK6Assignment;

import java.util.*;

public class Deck {
	List<Card> cards  = new ArrayList<Card>();
	int nextCardIndex = 0;
	

public Deck() {
	Card card;

	for(int k=2; k<= 14; k++) {
		card = new Card(k,"Clubs");
		cards.add(card);
	}
		
	for(int k=2; k<= 14; k++) {
		card = new Card(k,"Diamonds");
		cards.add(card);
	}
	for(int k=2; k<= 14; k++) {
		card = new Card(k,"Hearts");
		cards.add(card);
	}
	for(int k=2; k<= 14; k++) {
		card = new Card(k,"Spades");
		cards.add(card);
	//	System.out.println(cards.size());
	}

}
public void shuffle(){
Collections.shuffle(cards);
}

public Card drawCard() {
	if (nextCardIndex < cards.size()) {
		Card drawnCard = cards.get(nextCardIndex);
		nextCardIndex++;
		return drawnCard;
	}else {
	return null;
	}
	}
	

	public void describe(){
	{
		for(int k=0; k<cards.size(); k++) {
			cards.get(k).describe();
//			System.out.println("WTF"+ k +" " + cards.size());
		}  
}
 
}
	
	}



