package ch11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set은 순서 유지 안 하고 중복도 허용하지 않는다.
		Object[] objArr = {new Integer(1), "1", "2", "2", "3", "3", "4", "4", "5"};
		Set set = new HashSet();
		// HashSet은 Set 인터페이스를 구현한 대표적인 컬렉션클래스
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(set.add(objArr[i]));
			// false는 set에 추가되지 않았다는 의미이다. (중복X)
		}
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) { // 읽어올 요소가 남아있는지 확인
			System.out.println(it.next());  // 요소 하나 꺼내오기
		}
	}

}
