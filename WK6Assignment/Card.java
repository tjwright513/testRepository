package WK6Assignment;

public class Card {

	int value;
	String name;
	
	public Card(int c, String s) {
		value = c;
		name = s;
	}
	
	public void describe() {
	
		System.out.println("Card value = " + value + " card name = " + name);
	}
}
