package ch14;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex14_04_3 {

	public static void main(String[] args) {
		
		// Supplier는 입력은 없고 출력만 있음.
		Supplier<MyClass> s = () -> new MyClass();
		System.out.println("s= " + s.get());   // 객체 반환
		MyClass mc = s.get();
		System.out.println("mc= " + mc);
		
		// 클래스이름::new 메서드 참조로 바꿈.
		Supplier<MyClass> s2 = MyClass::new;
		System.out.println("s2= " + s2.get());
		
		// 매개변수 있는 경우에도 같다.
		Function<Integer, MyClass2> f = (i) -> new MyClass2(i);
		MyClass2 mc2 = f.apply(100);
		System.out.println("mc2= " + mc2.iv);
		
		Function<Integer, MyClass2> f2 = MyClass2::new;
		System.out.println("f2= " + f2.apply(200).iv);
		
		// 배열
		Function<Integer, int[]> f3 = (i) -> new int[i];
		System.out.println("f3= " + f3.apply(100).length);
		Function<Integer, int[]> f4 = int[]::new;  // 배열 메서드 참조
	
	}

}

class MyClass {
	
}

class MyClass2 {
	int iv;
	MyClass2(int iv) {  // 생성자
		this.iv = iv;
	}
}