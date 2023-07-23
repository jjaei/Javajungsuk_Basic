package ch08;

public class Ex08_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);  // 실행되지 않음.
		} catch(Exception e) {
			System.out.println(5);
		}
		System.out.println(6);
	}	
		

}
