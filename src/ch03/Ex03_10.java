package ch03;

public class Ex03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a = 1_000_000 * 1_000_000; // 올바르지 않음.
		long b = 1_000_000 * 1_000_000L;
		
		System.out.println("a = " + a); 
		System.out.println("b = " + b); 
		
	}

}
