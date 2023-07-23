package ch07;

public class Ex07_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Buyer2 b = new Buyer2();
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio());
		b.summary();
	}

}

class Product2 {
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10.0);
	}
	Product2(){}  // 기본 생성자
}

class Tv2 extends Product2 {
	Tv2(){
		super(100);
		}
	public String toString() { return "Tv"; }
}
class Computer2 extends Product2 {
	Computer2(){
		super(200);
		}
	public String toString() { return "Computer"; }
}
class Audio extends Product2 {
	Audio(){
		super(50);
		}
	public String toString() { return "Audio"; }
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	Product2[] cart = new Product2[10];  // 구입한 제품을 저장하기 위한 배열
	int i=0;  // Product 배열에 사용될 카운터
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += bonusPoint;
		cart[i++] = p;  // 제품을 Product[] cart에 저장한다.
		System.out.println(p + "을/를 구입하셨습니다.");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		
		System.out.println("구입하신 물건의 총 금액은 " + sum + "만원 입니다.");
		System.out.println("구입하신 물건은 " + itemList + "입니다." );
	}
}