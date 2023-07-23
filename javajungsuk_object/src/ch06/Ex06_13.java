package ch06;

public class Ex06_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car2 c1 = new Car2();
		Car2 c2 = new Car2("skyblue");
		
		System.out.println("[c] color: " + c1.color + ", gearType: "+ c1.gearType
				+ ", door: " + c1.door);
		System.out.println("[c2] color: " + c2.color + ", gearType: "+ c2.gearType
				+ ", door: " + c2.door);
		
	}

}

class Car2 {
	String color;
	String gearType;
	int door;
	
	Car2(){
		this("white", "auto", 4);
	}
	
	Car2(String color){
		this(color, "auto", 4);
	}
	
	Car2(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}