package ch05;

public class Ex05_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] score = { //국어, 영어, 수학
						{ 100, 100, 30 }, // 개인1
						{ 33, 75, 97 },   // 학생2
						{ 86, 99, 100 },  // 학생3
						{ 68, 82, 77 }    // 학생4
		};
		
		int kor = 0;
		int eng = 0;
		int mat = 0;
		
		System.out.println(" 번호  국어   영어   수학  총점  평균 ");
		System.out.println("==============================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;  // 학생별 총점
			float avg = 0f;  // 학생별 평균
			
			kor = score[i][0];
			eng = score[i][1];
			mat = score[i][2];
			System.out.printf("%3d", i+1);
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%5d",score[i][j]);
			}
			
			avg = sum/score[i].length;
			System.out.printf("%5d %5.1f%n",sum ,avg);
			
		}
	}

}
