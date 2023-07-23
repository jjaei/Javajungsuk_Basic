package ch14;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_05_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream<String> strStream = Stream.of("a", "b", "c");
		Stream<String> strStream2 = Stream.of(new String[] {"a", "b", "c", "d"});
		
		String[] strArr = {"a", "b", "c", "d", "e"};
		Stream<String> strStream3 = Arrays.stream(strArr);
		strStream.forEach(System.out::println);
		strStream2.forEach(System.out::println);
		strStream3.forEach(System.out::println);

		// 기본형 스트림은 숫자인 걸 알기 때문에 sum, average 등 숫자와 관련된 메서드가 있음.
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
//		intStream.forEach(System.out::print);
//		System.out.println("sum= " + intStream.sum());
		System.out.println("avg= " + intStream.average());
	
		// 객체 스트림은 count밖에 없음.
		Integer[] intArr2= {new Integer(1),2,3,4,5};
		Stream<Integer> intStream2 = Arrays.stream(intArr2);
//		intStream2.forEach(System.out::print);
		System.out.println("count= " + intStream2.count());
		
	}
}
