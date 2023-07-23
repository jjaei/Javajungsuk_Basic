package ch04;

import java.util.Scanner;

public class Ex04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;
		char grade = ' ';
		char op = '0';
		
		System.out.println("점수를 입력하세요. :");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt();
		System.out.printf("당신의 점수는 %d점 입니다.%n", score);
		
		
		if(score>=90) { // 입력받은 score가 90점 이상일 경우 A 학점
			grade = 'A';
			 if(score > 97) 
			op = '+'; // 97점 초과일 경우 A+
			 else if(score<93) 
			op = '-';  // 93점 미만일 경우 A-이며, 그 사이는 A0 학점.
		} else if(score >= 80) {
			grade = 'B';
			 if(score > 87) 
				op = '+';
			 else if(score <83) 
				op = '-';
		} else if(score >= 70) {
			grade = 'C';
			 if(score > 77) 
				op = '+';
			 else if(score <73) 
				op = '-';
		} else {
			grade = 'D'; // 나머지 점수는 D학점
		}
		
		System.out.printf("당신의 학점은 %c%c 입니다.", grade, op);
	}

}
