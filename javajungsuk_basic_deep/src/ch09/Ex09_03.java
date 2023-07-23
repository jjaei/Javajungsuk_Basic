package ch09;

public class Ex09_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));  // true
		System.out.println(str1.hashCode());  // 96354
		System.out.println(str2.hashCode());  // 96354
		System.out.println(System.identityHashCode(str1));
		// 1313922862
		System.out.println(System.identityHashCode(str2));
		// 495053715
	}

}
