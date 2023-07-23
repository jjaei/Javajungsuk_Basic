package ch04;

import java.util.Scanner;

public class Ex04_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("현재 월(Month)을 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println("현재 계절은 봄 입니다.");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("현재 계절은 여름입니다.");
			break;
		case 9 : case 10 : case 11 :  // 한 줄로 작성하는 게 깔끔함.
			System.out.println("현재 계절은 가을입니다.");
			break;
			
			default: // 1~12월이 입력되지 않고 조건이 만족하지 않을 때 겨울이 기본값으로 나오게 설정함.
		case 12 : case 1 : case 2 :
			System.out.println("현재 계절은 겨울입니다.");
			break;
			
		}
	}

}
