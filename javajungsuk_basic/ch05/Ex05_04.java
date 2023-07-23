package ch05;

import java.util.Arrays;

public class Ex05_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numArr[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println(Arrays.toString(numArr));
		// Arrays 클래스를 이용해 배열 출력해보기
		
		for(int i=0; i<100; i++) {
			int n = (int)(Math.random() * 10);
			// 1부터 9까지의 랜덤값을 얻어 n에 저장한다.
			int tmp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n]= tmp;
		}
		
		System.out.println(Arrays.toString(numArr));
	}

}
