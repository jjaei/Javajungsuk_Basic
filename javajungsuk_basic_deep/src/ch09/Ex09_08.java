package ch09;

public class Ex09_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 길이가 0인 캐릭터 배열을 생성한다.
		char[] c = new char[0];
		char[] c2 = {}; // 위의 문장과 같다.
		String s = new String(c);
		String s2 = new String(""); // 위의 문장과 같다.
		
		System.out.println("c.length = " + c.length);
		System.out.println("s.length = " + s);
	}

}
