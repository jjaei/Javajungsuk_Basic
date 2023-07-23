package ch04;

public class Ex04_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for문에 Loop1이라는 이름을 붙였다.
		Loop1: for(int i=2; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(j==7) {
						break Loop1;  // j가 7이 되면 반복문 2개를 전부 빠져나간다.
					} else {
						System.out.print(i + "*" + j + "=" + i*j);
					}
					System.out.println();  // 줄바꿈
				}
		}
	}

}
