package ch05;

import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] words = {
				{"chair", "의자"},
				{"desk", "책상"},
				{"computer", "컴퓨터"}
		};
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은?%n", i+1, words[i][0]);
			
			String input = sc.nextLine();
			
			if(input.equals(words[i][1])) {
				System.out.println("정답입니다!");
			} else {
				System.out.printf("틀렸습니다! 정답은 %s입니다.%n", words[i][1]);
			}
		}
	}

}
