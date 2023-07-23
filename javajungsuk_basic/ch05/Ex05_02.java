package ch05;

public class Ex05_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		float average = 0f;
		
		int[]score = {100, 90, 67, 87, 90};
		
		for(int i=0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / score.length;
		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + average + "점");
	}

}
