package ch05;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] iArr1 = new int[10];
		int[] iArr2 = new int[10];
		int[] iArr3 = new int[] {100, 90, 80, 90, 100};
		int[] iArr4 = {80, 93, 80, 95, 100};
		char[] cArr = {'A', 'B', 'C', 'D'};
		
		for(int i=0; i<iArr1.length; i++) { //iArr1 배열의 길이만큼 반복한다.
			iArr1[i] += i;
		}
		
		for(int i=0; i<iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10)+1;
		}
		
		for(int i=0; i<iArr3.length; i++) {
			System.out.println("iArr3= " + iArr3[i]);
		}
		
		System.out.println();
		System.out.println(Arrays.toString(iArr1));  // 배열 출력해줌.
		System.out.println(Arrays.toString(iArr2));
		System.out.println(iArr3); // I@7291c18f
		System.out.println(Arrays.toString(iArr3)); 
		System.out.println(Arrays.toString(iArr4)); 
		System.out.println(cArr);  // ABCD
		
	}

}
