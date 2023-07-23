package ch14;

import java.io.File;
import java.util.stream.*;

public class Ex14_06 {

	public static void main(String[] args) {
		
		File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"),
				new File("Ex2.java"), new File("Ex1"), new File("Ex1.txt")};
		
		Stream<File> fileStream = Stream.of(fileArr);
		
		//map()으로 Stream<File>을 Stream<String>으로 변환함.
		Stream<String> filenameStream = fileStream.map(File::getName);
//		Stream<String> filenameStream = fileStream.map((f) -> f.getName());
		
		filenameStream.forEach(System.out::println);   // 모든 파일의 이름을 출력
		
		fileStream = Stream.of(fileArr);   // 스트림을 다시 생성한다.
		
		fileStream.map(File::getName)   // Stream<File> -> Stream<String>
		.filter(s -> s.indexOf('.')!=-1)   // 확장자가 없는 것은 제외한다.
		.peek(s -> System.out.printf("filename=%s%n",s))
		// 스트림을 소모하지 않고 중간 작업결과를 볼 수 있다.
		.map(s -> s.substring(s.indexOf('.')+1))   // 확장자만 추출한다.
		.map(String::toUpperCase)   // 모두 대문자로 변환한다.
		.distinct()     // 중복을 제거한다.
	    .forEach(System.out::print);
		
		System.out.println();
	}
}
