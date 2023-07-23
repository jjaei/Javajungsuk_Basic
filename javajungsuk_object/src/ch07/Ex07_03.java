package ch07;

public class Ex07_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child2 c2 = new Child2();
		c2.method();
		
	}

}

class Parent2 {
	int x = 10;
}

class Child2 extends Parent2 {
	void method() {
		System.out.println("x= " + x); // 가까운 쪽의 x, 10
		System.out.println("this.x= " + this.x); // 객체(Child) 자신의 x, 10
		System.out.println("super.x= " + super.x); // 부모의 x, 10
	}
	
}
