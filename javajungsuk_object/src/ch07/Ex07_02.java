package ch07;

public class Ex07_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.method();
	}

}

class Parent {
	int x = 5;
}

class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x= " + x); // 가까운 쪽의 x
		System.out.println("this.x= " + this.x); // 객체(Child) 자신의 x
		System.out.println("super.x= " + super.x); // 부모의 x
	}
}