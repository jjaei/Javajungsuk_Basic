package ch05;

public class Ex05_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score[] = {79, 39, 55, 97, 48, 87, 65};
		
		int max = score[0];  // 배열의 첫 번째 값으로 초기화
		int min = score[0];  // 배열의 첫 번째 값으로 초기화
		
		for(int i=0; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			} else if(score[i] < min) {
				min = score[i];
			}
		}
		
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}
