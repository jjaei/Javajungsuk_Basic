package ch02;

import java.util.Scanner;

public class Ex02_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("두 자리 정수를 한 번 입력하세요. :");
		
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		// 입력받은 문자열을 숫자로 변환한다.
		
		System.out.println("입력받은 내용: " + input);
		// System.out.println(num);
		System.out.printf("%d%n", num);
	}

}
