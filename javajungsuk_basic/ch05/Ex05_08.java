package ch05;

public class Ex05_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] score = {
						{ 100, 76, 45 },
						{ 88, 90, 73 },
						{ 40, 85, 72 },
						{ 60, 100, 55 }
		};
		
		int sum = 0; // 합계를 담기 위한 변수 선언
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d]: %d%n", i, j, score[i][j]);
				
				sum+=score[i][j];
			}
			
		}
		
		System.out.println("총점: " + sum + "점");
		
	}

}
