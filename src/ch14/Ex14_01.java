package ch14;

public class Ex14_01 {
	
	static void execute(MyFunction f) {
		// 매개변수의 타입이 MyFunction인 메서드
		f.run();
	}
	
	static MyFunction getMyFunction() {
		// 반환타입이 MyFunction인 메서드
//		MyFunction f = () -> System.out.println("f3.run()");
//		return f;
		return () -> System.out.println("f3.run()");  // 위의 두 문장과 같다.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyFunction f1 = () -> System.out.println("f1.run()");
		// 람다식으로 MyFunction의 run을 구현했다.
		
		
		MyFunction f2 = new MyFunction() {  // 익명클래스로 run()을 구현했다.
			public void run() {  // public을 반드시 붙여야 한다.
				System.out.println("f2.run()");
			} 
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(() -> System.out.println("run()"));
	}
}

@FunctionalInterface  // 애너테이션으로 함수형 인터페이스 확인
interface MyFunction {
	public abstract void run();  // public abstract 생략 가능
}