package WK6Assignment;
public class App {	

		


	public static Deck deck;
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			deck = new Deck();

			deck.shuffle();

			
			Player player1 = new Player(0, "Player1");
			Player player2 = new Player(0, "Player2");
			
			
			Card card;
			boolean p1;
			p1 = false;
			//deal cards - 26 to each player
			for (int c = 0; c <= 51; c++ ) {
				card = deck.drawCard();	
				p1 = !p1;
				if (p1) {
					player1.hand.add(card);
					
				}else {
					player2.hand.add(card);
				}
			}
	System.out.println("Start Game");
	for (int i = 0; i < 26; i++) {
	  if ((player1.hand.get(i).value) > (player2.hand.get(i).value)) {
		  System.out.println("player 1 Wins Hand!");
		  player1.score++;
	}else if  ((player1.hand.get(i).value) < (player2.hand.get(i).value)) {
		  System.out.println("Player 2 Wins Hand!");
		  player2.score++;
	  }else {
		  System.out.println("Draw");
	  }
	}
	System.out.println("Player 1 Score = " + player1.score);
	System.out.println("Player 2 Score = " + player2.score);
	if (player1.score > player2.score) {
		System.out.println("Player 1 Wins Game!!");	
		}else {
			System.out.println("Player 2 Wins Game!!");
	}
	}
	}
	
	
	