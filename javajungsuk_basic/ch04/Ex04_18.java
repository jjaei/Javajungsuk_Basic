package ch04;

import java.util.Scanner;

public class Ex04_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) 돈가스");
			System.out.println("(2) 라면");
			System.out.println("(3) 햄버거");
			System.out.println("주문하실 음식(1~3번)을 선택하세요. 취소(0번) > ");
			
			String input = sc.nextLine();
			menu = Integer.parseInt(input);
			
			if(menu==0) {
				System.out.println("음식 주문을 취소합니다.");
				break; // 0번을 선택할 경우 while문을 빠져나감.
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("잘못 선택하셨습니다. 번호를 다시 입력해주세요. 취소(0번)");
				continue; // 1~3번이 아닌 번호를 선택할 경우 while문을 계속 진행한다.
			} else {
				System.out.printf("선택하신 메뉴는 %d번 입니다.", menu);
				break;
			}
		}
	}

}
