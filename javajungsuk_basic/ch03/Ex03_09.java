package ch03;

public class Ex03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1_000_000;
		int b = 2_000_000;
	//	long c = a * b; // -1454759936
		long c = (long) a*b; // 형변환 해주기
		
		System.out.println(c); 
	}

}
