package ch04;

public class Ex04_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0; i<=10; i++) {
			if(i%3==0) { // i가 3의 배수일 때
				continue; 
			} else { // 3의 배수가 아닐 때 i 출력
				System.out.println(i);
			}
		}
	}

}
