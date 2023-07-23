package ch09;

public class Ex09_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Card2 c1 = new Card2();
		Card2 c2 = new Card2("HEART", 5);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}

}

class Card2 {
	String kind;
	int number;
	
	Card2() {
		this("SPADE", 1);  
		//Card(String kind, int number)를 호출한다.
	}
	
	Card2(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
}