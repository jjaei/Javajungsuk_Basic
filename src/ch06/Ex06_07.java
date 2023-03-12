package ch06;

public class Ex06_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data2 d = new Data2(); // 객체 생성
		d.x = 11;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(Data2 d) {  // 참조형 매개변수
		d.x = 1500;
		System.out.println("change() : x = " + d.x);
	}
}

class Data2 {
	int x;
}