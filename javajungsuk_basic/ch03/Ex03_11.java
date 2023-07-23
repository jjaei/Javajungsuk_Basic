package ch03;

public class Ex03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double pi = 3.141592;
		double shortPi = Math.round(pi * 1000) / 1000.0;	
		// 3141.592에서 반올림하고 다시 1000으로 나눈다.
		System.out.println(shortPi);
		// 3.142 출력
	}

}
