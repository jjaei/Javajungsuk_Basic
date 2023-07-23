package ch14;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_09 {

	public static void main(String[] args) {
		
		String[] strArr = {
				"Inheritance", "Java", "Lambda", "stream",
				"OptionalDouble", "IntStream", "count", "sum"
			};
		
		Stream.of(strArr).forEach(System.out::println);  // 스트림 생성 후 출력하기
	//	Stream.of(strArr).parallel().forEach(System.out::println);  // 병렬로 출력해서 순서유지 X
		
		boolean noEmptyStr = Stream.of(strArr).noneMatch(s -> s.length() == 0);
		// s의 길이가 0인 게 하나라도 있으면 false
		Optional<String> sWord = Stream.of(strArr)
							.filter(s->s.charAt(0)=='s').findAny();
		// s의 인덱스 0이 s로 시작하는 첫번째 단어
		
		
		System.out.println("noEmptyStr= " + noEmptyStr);
		System.out.println("sWord= " + sWord.get());
		
		// Stream<String[]>을 IntStream으로 변환
		IntStream intStream1 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream2 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream3 = Stream.of(strArr).mapToInt(String::length);
		IntStream intStream4 = Stream.of(strArr).mapToInt(String::length);
		
		int count = intStream1.reduce(0, (a,b) -> a + 1);
		int sum = intStream2.reduce(0, (a,b)-> a+b);
		OptionalInt max = intStream3.reduce(Integer::max);
		OptionalInt min = intStream4.reduce(Integer::min);
		
		System.out.println("count= " + count);
		System.out.println("sum= " + sum);
		System.out.println("max= " + max.getAsInt());
		System.out.println("min= " + min.getAsInt());
	}
}
