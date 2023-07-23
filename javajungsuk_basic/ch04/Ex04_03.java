package ch04;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("숫자를 입력하세요 :");
		Scanner sc = new Scanner(System.in);  // ctrl + shift + O로 import문 추가
		int input = sc.nextInt();
		// 입력받은 sc를 input에 저장한다.
		
		if(input == 0) {
			// input이 0이면 실행할 문장
			System.out.println("입력하신 숫자는 0입니다.");
		} else { // 0이 아닐 경우 실행될 문장
			System.out.println("입력하신 숫자는 0이 아닙니다.");
		}
	}

}
