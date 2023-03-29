package ch14;

import java.util.Random;
import java.util.stream.IntStream;

public class Ex14_05_3 {

	public static void main(String[] args) {
		
//		IntStream intStream = new Random().ints();   // 무한 스트림
		IntStream intStream = new Random().ints(5, 10);   // 5~10 난수
		intStream
		.limit(10)   // 5개만 자르기
		.forEach(System.out::println);
	}
}
