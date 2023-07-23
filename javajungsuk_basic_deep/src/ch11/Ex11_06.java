package ch11;

import java.util.Arrays;

public class Ex11_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {0, 1, 2, 3, 4};
		int[][] arr2D = {{10, 20, 30}, {11, 21, 31}};
		
		System.out.println("arr= " + Arrays.toString(arr));
		System.out.println("arr2D= " + Arrays.toString(arr2D));
		System.out.println("arr2D= " + Arrays.deepToString(arr2D));
		
		int[] arr2 = Arrays.copyOf(arr, 3);
		int[] arr3 = Arrays.copyOf(arr, arr.length);
		int[] arr4 = Arrays.copyOf(arr, 6);
		int[] arr5 = Arrays.copyOfRange(arr,0,7);
		int[] arr6 = Arrays.copyOfRange(arr,1,5);
		
		System.out.println("arr2= " + Arrays.toString(arr2));
		System.out.println("arr3= " + Arrays.toString(arr3));
		System.out.println("arr4= " + Arrays.toString(arr4));
		System.out.println("arr5= " + Arrays.toString(arr5));
		System.out.println("arr6= " + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7,7);
		System.out.println("arr7= " + Arrays.toString(arr7));
		// 배열을 7로 채운다.
		
		Arrays.setAll(arr7, i->(int)(Math.random()*6)+1);
		// 배열을 1부터 6까지의 난수로 채운다.
		System.out.println("arr7= " + Arrays.toString(arr7));
		
		for(int i: arr7) {
			// 배열의 요소를 순서대로 꺼내 i로 저장함.
			char[] c = new char[i]; // 꺼내온 요소를 i에 저장하고
			// 캐릭터 배열을 생성한다.
			Arrays.fill(c, '*'); // *로 채운다.
			System.out.println(new String(c)+i); // String으로 바꾼다.
		}
		
		String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.equals(str2D,str2D2)); // false
		System.out.println(Arrays.deepEquals(str2D, str2D2));  // true
		
		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };
		
		System.out.println("chArr= " + Arrays.toString(chArr));
		System.out.println("index of B = "+ Arrays.binarySearch(chArr,'B')); // -2 출력
		System.out.println("정렬(sort) 후");
		Arrays.sort(chArr); // 배열을 정렬. binarySearch는 사용하기 전에 반드시 정렬을 먼저 해야한다.
		System.out.println("index of B = "+ Arrays.binarySearch(chArr, 'B')); // 1 출력
		
	}

}
