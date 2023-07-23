package ch11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex11_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set = new HashSet();
		
		for(int i=0; set.size() < 6; i++) { // set의 size가 6보다 작은 동안
			int num = (int)(Math.random()*45)+1; // 1부터 45까지의 난수를 num에 저장하기
			// set.add(new Integer(num));
			set.add(num);
		}
		// set은 정렬할 수 없음. 
		// set을 list로 옮기고 list를 정렬해야 함.
		System.out.println(set);
		// 순서없이 출력됨.
		
		List list = new LinkedList(set);  // set의 요소를 list에 저장한다.
		Collections.sort(list);  // list를 정렬한다.
		System.out.println(list);  // list를 출력한다.
	}

}
