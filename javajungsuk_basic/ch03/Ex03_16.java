package ch03;

public class Ex03_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean b = true;
		char ch = 'A';
		
		System.out.printf("b = %b%n", b);  // true
		System.out.printf("!b = %b%n", !b);  // false
		System.out.printf("!!b = %b%n", !!b);  // true
		System.out.printf("!!!b = %b%n", !!!b);  // false
		System.out.println();  // 엔터
		
		System.out.printf("ch = %c%n", ch);  // A
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		// ch가 소문자가 아닌지?  true
	  	System.out.printf("!('a'<=ch && ch<='z')=%b%n", !('a'<= ch && ch<='z'));
	  	// ch가 소문자가 아닌지?  true
	    System.out.printf("'a'<=ch && ch<='z' =%b%n", 'a'<=ch && ch<='z');
	    // ch가 소문자인가?  false
	}

}
