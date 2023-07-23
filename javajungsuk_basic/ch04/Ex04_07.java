package ch04;

public class Ex04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		// 괄호 {} 안에 내용을 5번 반복하는 반복문 만들기
		
		for(int i=0; i<5; i++) {
			System.out.println(num);
		}
		
		// Math.Random을 이용한 정수 5개 만들기
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*5)+1);
		}
	}

}
