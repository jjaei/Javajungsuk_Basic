package ch14;

import java.util.function.Function;

public class Ex14_04_2 {

	public static void main(String[] args) {
	
		// 메서드 참조란 람다식을 더 간단히 하는 것.
//		Function<String, Integer> f = (String s) -> Integer.parseInt(s);
//		System.out.println(f.apply("100") + 200);   // 300

		// 클래스이름::메서드이름
		Function<String, Integer> f = Integer::parseInt;
		System.out.println(f.apply("100") + 200);   // 300
	}
}
