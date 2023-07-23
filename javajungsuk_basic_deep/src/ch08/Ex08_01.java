package ch08;

public class Ex08_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		try {
			System.out.println(2);
			System.out.println(3);
		} catch(Exception e) {
			System.out.println(4);  // 실행되지 않음.
		}  // try-catch문의 끝
		
		System.out.println(5);
	}

}
