package ch04;

import java.util.Scanner;

public class Ex04_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 0;  // 점수를 저장할 변수
		char grade = ' '; // 공백으로 초기화, 학점 저장할 변수
		
		System.out.println("점수를 입력하세요. >");
		Scanner sc = new Scanner(System.in);
		score = sc.nextInt(); // 입력받은 sc를 scroe에 저장한다.
		
		if(score>=95) { // score가 95점 이상일 경우 A 학점
			grade = 'A';
		} else if(score >= 85) { // score가 85점 이상일 경우 B 학점
			grade = 'B';
		} else if(score >= 75) { // score가 75점 이상일 경우 C 학점
			grade ='C';
		} else { // 나머지는 D학점
			grade = 'D';
		}
		
		System.out.println("당신의 점수는 " + score + "점이며, 학점은 " + grade + " 입니다.");
	}

}
