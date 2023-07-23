package ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_05_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream();
		// list를 Stream으로 변환함.
		
		intStream.forEach(System.out::print);  // forEach는 최종 연산.
		// stream은 1회용. 최종연산을 하면 stream이 닫힌다.
		
		intStream = list.stream();  // 최종연산 후 다시 list로부터 Stream을 생성함.
		intStream.forEach(System.out::print);
	}

}
