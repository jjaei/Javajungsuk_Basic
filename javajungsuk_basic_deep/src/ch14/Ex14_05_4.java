package ch14;

import java.util.stream.Stream;

public class Ex14_05_4 {

	public static void main(String[] args) {
	
		// 람다식을 소스로 하는 스트림 생성하기
		// iterate는 초기값 지정하며 이전 요소로 다음 요소를 계산, generate는 초기값 없음.
		
		Stream<Integer> intStream = Stream.iterate(0, n -> n + 2);
		intStream.limit(10).forEach(System.out::println);
		
		Stream<Integer> oneStream = Stream.generate(() -> 1);
		oneStream.limit(20).forEach(System.out::print);

	}

}
