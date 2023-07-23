package ch04;

import java.util.Scanner;

public class Ex04_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int sum = 0;
		
		System.out.println("숫자를 입력하세요. >");
		Scanner sc = new Scanner(System.in);
		//String input = sc.nextLine();
		//num = Integer.parseInt(input);
		num = sc.nextInt();
		
		while(num!=0) {
			// num을 10으로 나눈 나머지를 sum에 더한다.
			sum += num%10;
			System.out.printf("sum= %d, num= %d%n", sum, num);
			num = num/10;
		}
		
		System.out.println("각 자리수의 합 : " + sum);
	}

}
