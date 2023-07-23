package ch03;

import java.util.Scanner;

public class Ex03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		char ch = ' ' ;
		
		System.out.printf("문자를 입력하세요. :");
		
		String input = scanner.nextLine();
		// 스캐너로 입력받은 것을 input에 저장한다.
		
		ch = input.charAt(0);
		// input의 0번을 ch에 저장한다.
		
		
		if('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
			// 입력받은 ch가 0~9 사이의 값이면
		} 
		
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch<= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
			// ch가 a~z 거나 A~Z사이의 값이면
			
		}
		
	}

}
