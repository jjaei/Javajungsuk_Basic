package ch11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new TreeSet();
		int num = 0;
		for(int i=0; set.size() < 6; i++) {
			num = (int)(Math.random() * 45) + 1;
			// 1부터 45까지의 난수를 num에 저장한다.
			set.add(num);
		}
		
		System.out.println(set); // 로또번호 추첨하기
	}

}
