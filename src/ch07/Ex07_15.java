package ch07;

public class Ex07_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 인스턴스 클래스의 인스턴스를 생성하려면 외부 클래스의 인스턴스를 먼저 생성해야 한다.
		Outer2 outer = new Outer2();
		Outer2.InstanceInner ii = outer.new InstanceInner();
		
		System.out.println("ii.iv : " + ii.iv);
		System.out.println("Outer2.StaticInner.cv : " + Outer2.StaticInner.cv);
		
		// static 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer2.StaticInner cc = new Outer2.StaticInner();
		System.out.println("cc.cv : " + cc.cv);
	}

}

class Outer2 {
	class InstanceInner {
		int iv = 100;
	}
	
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
	}
	
	void method() {
		class LocalInner{
			int iv = 400;
		}
	}
}
