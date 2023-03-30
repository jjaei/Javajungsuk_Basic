package ch14;

import java.util.Arrays;
import java.util.stream.Stream;

public class Ex14_07 {

	public static void main(String[] args) {
		
		Stream<String[]> strArrStream = Stream.of(
				new String[]{"abc", "def", "jkl"},
				new String[]{"ABC", "GHI", "JKL"});
		
//		Stream<Stream<String>> strStrStream = strArrStream.map(Arrays::stream);
		Stream<String> strStream = strArrStream.flatMap(Arrays::stream);
		
		strStream.map(String::toLowerCase)   // 스트림의 요소룰 모두 소문자로 변경한다.
			.distinct()  // 중복 제거
			.sorted()    // 정렬
			.forEach(System.out::println);
		System.out.println();
		
		String[] lineArr = {
				"Believe or not It is true",
				"Do or do not There is no try",				
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))
			.map(String::toLowerCase)   // 소문자로 변경
			.distinct()    // 중복 제거
			.sorted()    // 정렬
			.forEach(System.out::println);
		System.out.println();
	}
}
