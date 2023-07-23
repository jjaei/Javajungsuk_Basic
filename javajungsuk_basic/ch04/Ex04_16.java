package ch04;

public class Ex04_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int i = 0;
		
		while(true) {  // 무한 반복문
			if(sum>100)
				break;
			i++;
			sum += i;
			// sum이 100 미만일 때 i를 증가시키고 sum에 누적한다.
		}
		System.out.println(sum);
		System.out.println(i);
		
	}

}
