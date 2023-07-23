package ch07;

public class Ex07_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer3 outer = new Outer3();
		Outer3.Inner in = outer.new Inner();
		
		in.method();
	}

}

class Outer3 {
	int value = 10;
	class Inner {
		int value = 20;
		void method() {
			System.out.println("value : " + value);  // 20
			System.out.println("this.value : " + this.value);  // 20
			System.out.println("Outer.this.value : " + Outer3.this.value);  // 10
			
		}
	}  // Inner 클래스의 끝
}  // Outer3의 끝