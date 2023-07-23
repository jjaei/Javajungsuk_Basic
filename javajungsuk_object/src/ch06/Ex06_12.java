package ch06;

public class Ex06_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		c.color = "Red";
		c.gearType = "auto";
		c.door = 4;
		
		Car c2 = new Car("White", "auto", 4);
		
		System.out.println("[c] color: " + c.color + ", gearType: "+ c.gearType
				+ ", door: " + c.door);
		System.out.println("[c2] color: " + c2.color + ", gearType: "+ c2.gearType
				+ ", door: " + c2.door);
	}

}

class Car {
	String color;    // 색상
	String gearType;  // 변속기 종류
	int door;  // 문의 개수
	
	Car(){}  // 기본 생성자
	Car(String c, String g, int d){ // 매개변수가 있는 생성자
		color = c;
		gearType = g;
		door = d;
	}
}