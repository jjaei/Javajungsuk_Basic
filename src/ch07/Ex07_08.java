package ch07;

public class Ex07_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer b = new Buyer();
		Tv1 tv = new Tv1();
		
		b.buy(tv);
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 " + b.money + "만원 입니다.");
		System.out.println("현재 포인트는 " + b.bonusPoint + "점 입니다.");
	}

}

class Product {
	int price;  // 가격
	int bonusPoint; // 제품 구매시 제공하는 포인트
	
	Product(int price){
		this.price = price;
		this.bonusPoint = (int)(price/10.);
		// 포인트는 제품의 10%
	}
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		// 첫 줄에만 가능.
		super(80);  // Tv의 가격을 80만원으로 한다.
	}
	// Object 클래스의 toString을 오버라이딩 한다.
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {  // Tv와 같은 형식으로 클래스를 만든다.
	Computer() {
		super(50);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer { // 고객
	int money = 1000;   // 고객의 초기 소유 금액
	int bonusPoint = 0;  // 포인트
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		} 
		
		money -= p.price;  // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint;  // 제품을 구입하면 포인트가 쌓인다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}