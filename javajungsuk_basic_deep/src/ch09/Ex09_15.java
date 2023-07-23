package ch09;

public class Ex09_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = new Integer("100").intValue();
		int i2 = Integer.parseInt("100");
		int i3 = Integer.valueOf("100");
		
		int i4 = Integer.parseInt("100",2); // 2진수로 출력
		int i5 = Integer.parseInt("100", 8); // 8진수로 출력 
		int i6 = Integer.parseInt("100", 16); // 16진수로 출력 
		int i7 = Integer.parseInt("FF", 16); // 16진수로 출력 
//		int i8 = Integer.parseInt("FF");    NumberFormatException 발생 
		
		int i9 = Integer.valueOf("100",2); // 2진수로 출력
		int i10 = Integer.valueOf("100", 8); // 8진수로 출력 
		int i11 = Integer.valueOf("100", 16); // 16진수로 출력 
		int i12 = Integer.valueOf("FF", 16); // 16진수로 출력 
//		int i13 = Integer.valueOf("FF");    NumberFormatException 발생 
		
		System.out.println(i);  // 100
		System.out.println(i2);  // 100
		System.out.println(i3);  // 100
		System.out.println("100(2) -> " + i4);  // 4
		System.out.println("100(8) -> " + i5);  // 64
		System.out.println("100(16) -> " + i6);  // 256
		System.out.println("100(16) -> " + i7);  // 255

		System.out.println("100(2) -> " + i9);  // 4
		System.out.println("100(8) -> " + i10);  // 64
		System.out.println("100(16) -> " + i11);  // 256
		System.out.println("100(16) -> " + i12);  // 255
	}
}
