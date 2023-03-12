package ch06;

public class Ex06_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data d = new Data();  // 객체 생성
		d.x = 5;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);  // 메서드 호출
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {  // 기본형 매개변수, change 메서드 생성
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}

class Data{
	int x;
}