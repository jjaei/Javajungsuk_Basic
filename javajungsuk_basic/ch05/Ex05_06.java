package ch05;

public class Ex05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = {"Kwon", "Ahn", "Lee"};
		
		for(int i=0; i<name.length; i++) {
			System.out.println("[name]" + name[i]);
		}
		
		String tmp = name[0];
		// 0번째 요소를 tmp에 저장하고 출력하기
		System.out.println("tmp : " + tmp);
		
		name[2] = "Choi";
		// 2번째 요소를 Choi로 변경
		
		for(int i=0; i<name.length; i++) {
			System.out.println("[name]" + name[i]);

		}
	}

}
