package ch11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new TreeSet();  // 범위 검색, 정렬, 정렬 필요 없음, 중복 허용 X
	//  Set set = new HashSet();   정렬 필요함, 중복허용 X
		int num = 0;
		for(int i=0; set.size() < 6; i++) {
			num = (int)(Math.random() * 45) + 1;
			// 1부터 45까지의 난수를 num에 저장한다.
			set.add(num);
		//  set.add(new Integer(num));  와 같음.
		}
		
		System.out.println(set); // 로또번호 추첨하기
	}

}
