package ch03;

public class Ex03_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc"=="abc");  // true
		System.out.printf(" str1==\"abc\" ? %b%n", str1=="abc");  // true
		System.out.printf(" str2==\"abc\" ? %b%n", str2=="abc");  // false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));  // true
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));  // true
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));  // false
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		//대소문자 구별없이 str2와 ABC가 같은지?
	}

}
