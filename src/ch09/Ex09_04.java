package ch09;

public class Ex09_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card c1 = new Card();
		Card c2 = new Card();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}

class Card {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}