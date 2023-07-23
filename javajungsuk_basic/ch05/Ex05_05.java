package ch05;

import java.util.Arrays;

public class Ex05_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ball = new int[45];
		// 45개 정수값을 저장하기 위한 배열 생성
		
		for(int i=0; i<ball.length; i++) {
			ball[i] += i; // ball[0]에 1을 저장한다.
		}
		
		for(int i=0; i<6; i++) {
			int j=(int)(Math.random() * 45);
			int tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}	
			// 다른 변수를 이용해 배열의 순서를 섞는다.
		
		for(int i=0; i<6; i++) {
			System.out.printf("ball[%d] = %d%n", i, ball[i]);
		
		}
	
	}
}

