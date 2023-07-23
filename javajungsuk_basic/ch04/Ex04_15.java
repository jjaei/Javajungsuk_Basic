package ch04;

import java.util.Scanner;

public class Ex04_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		int answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		// answer에 1부터 100까지의 정수 난수를 저장한다.
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1과 100 사이의 정수를 하나 입력하세요. >");
			input = sc.nextInt();
			if(input>answer) {
				System.out.println("더 작은 수를 입력하세요.");
			} else if(input < answer) {
				System.out.println("더 큰 수를 입력하세요.");
			}
		} while(input!=answer);
		
		System.out.println("정답입니다!");	
		
	}

}
