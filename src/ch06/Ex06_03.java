package ch06;

public class Ex06_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.width = " + Card.height);
		// static 변수는 객체생성없이 사용 가능하며,
		// 참조변수 대신 클래스를 써주면 된다.
		
		Card c1 = new Card();
		Card c2 = new Card();
		
		c1.kind = "Heart";
		c2.kind = "Spade";
		
		c1.number = 5;
		c2.number = 3;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 카드의 크기는 " 
					+ Card.width + ", " + Card.height + "입니다." );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 카드의 크기는 " 
				+ Card.width + ", " + Card.height + "입니다." );
		
		
		System.out.println("c1의 width를 200, height를 200으로 변경합니다.");
		c1.width=200;
		c1.height=200;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 카드의 크기는 " 
				+ Card.width + ", " + Card.height + "입니다." );
		System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 카드의 크기는 " 
				+ Card.width + ", " + Card.height + "입니다." );
		
		// c1의 카드속성을 변경했지만 static변수는 공통속성이기 때문에 c2의 값도 변경돼서 출력된다.
		// 그렇기 때문에 참조변수를 적지 않고 클래스를 적는 것이 좋다.
	}

}

class Card {  // Card 클래스 생성
	String kind;
	int number;
	static int width = 100;
	static int height = 250;  // 공통속성
}