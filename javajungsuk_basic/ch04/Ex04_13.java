package ch04;

public class Ex04_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int i=0;
		// i를 1씩 증가시켜서 sum에 계속 더해간다.
		
		while(sum<=100){
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i;
		}
	}

}
