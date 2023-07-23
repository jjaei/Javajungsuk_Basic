package ch08;

public class Ex08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		try {
			System.out.println(0/0);  // 에러 발생
			System.out.println(2); // 실행되지 않음
		} catch (ArithmeticException e) {
			System.out.println(3); // 실행 됨
		}  // try-catch 문의 끝
		System.out.println(4);
	}

}
