package ch11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Map 인터페이스를 구현했으며 데이터를 키와 값의 쌍으로 저장한다.
		// 순서가 없고 키는 중복 허용하지 않고 값은 중복을 허용한다.
		
		HashMap map = new HashMap();
		map.put("myId", "1234");
		map.put("myId2", "3456");
		map.put("myId", "5678");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID와 PW를 입력해주세요.");
			System.out.print("ID>> ");
			String id = sc.nextLine().trim();
			
			System.out.print("PW>> ");
			String pw = sc.nextLine().trim();
			System.out.println();
			
			if(!(map.containsKey(id))) {
				System.out.println("ID가 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} 
			
			if(!(map.get(id).equals(pw))) {
				System.out.println("PW가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("로그인에 성공했습니다.");
				break;
			}
		}
	}

}
