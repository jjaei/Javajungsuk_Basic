package ch09;

public class Ex09_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		// false 출력
		
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));
		// false 출력
		
		// StringBuffer의 내용을 String으로 변환한다.
		String s1 = sb1.toString();
		// String s = new String(sb1);와 같다.
		
		String s2 = new String(sb2);
		
		System.out.println("sb1 == sb2 ? " + (s1 == s2));
		// false 출력
		
		System.out.println("sb1.equals(sb2) ? " + s1.equals(s2));
		// true 출력
		
	}

}
