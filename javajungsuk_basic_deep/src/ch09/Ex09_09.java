package ch09;

import java.util.StringJoiner;

public class Ex09_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		// animals의 문자열을 쉼표 기준으로 분리해서 arr 배열에 넣는다.
		
		System.out.println(String.join("-", arr));
		// join 메서드를 이용해서 arr 배열의 문자열을 -로 결합해서 출력한다.
		StringJoiner sj = new StringJoiner("/", "[", "]");
		// 첫 번째는 구분기호, 두 번째는 맨 앞, 두 번째는 맨 뒤에 들어갈 것
		
		for(String s : arr) {  // 향상된 for문
			// 변수타입 변수명 : 원본 배열명 
			sj.add(s); 
			System.out.println(sj.toString());
		}
	}

}
