package ch07;

public class Ex07_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		f.water(); // 가능
		car = (Car)f;  // 형변환 생략 가능. car = f;
		// car.water();  // 사용불가
		f2 = (FireEngine)car;
		// 조상타입을 자손타입으로 형변환 할 때 타입 생략 불가능
		
		f2.water();
	}

}

class Car{
	String color;
	int door;
	
	void drive() {  // 운전하는 기능
		System.out.println("brrrr~");
	}
	
	void stop() {  // 멈추는 기능
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{ // Car를 상속받는다.
	void water() {  // 물 뿌리는 기능
		System.out.println("water!");
	}
}