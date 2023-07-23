package ch04;

import java.util.Scanner;

public class Ex04_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu=0, num=0;
		Scanner sc = new Scanner(System.in);
		group: // group으로 while문과 for문을 묶어준다.
		while(true) {
			
			System.out.println("문제 풀이할 번호(1~3번)를 선택하세요.종료(0번) >");
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			
			
			String input = sc.nextLine();
			menu = Integer.parseInt(input);
			
			if(menu==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if(!(1<=menu && menu <=3)) {
				System.out.println("번호를 잘못 입력하셨습니다. 다시 입력해주세요. 종료(0번)");
				continue;
			} 
			
			for(;;) { // for문을 이용한 무한반복문
				System.out.println("계산할 값을 입력하세요. 계산 종료: 0번, 전체 종료: 99번");
				
				String input2 = sc.nextLine();
				num = Integer.parseInt(input2);
				
				if(num==0) {
					System.out.println("이전 보기로 돌아갑니다..");
					break;
				} else if(num==99) {
					System.out.println("프로그램을 완전히 종료합니다.");
					break group; // group을 빠져나간다.
				} switch(menu) {
				case 1 :
					System.out.println("result = " + num * num);
					break;
				case 2 :
					System.out.println("result = " + Math.sqrt(num));
					break;
				case 3 :
					System.out.println("result = " + Math.log(num));
					break;
				} 
			}
		} 
	}

}
