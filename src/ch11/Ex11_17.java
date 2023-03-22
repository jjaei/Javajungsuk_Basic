package ch11;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex11_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		map.put("김자바", new Integer(64));
		map.put("이자바", 30);
		map.put("권자바", 96);
		map.put("안자바", new Integer(100));
		map.put("박자바", 87);
		map.put("김자바", 75);
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			// Entry 인터페이스(Map의 내부 인터페이스)
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		}
		
		set = map.keySet();
		System.out.println("학생 명단: " + set);
		
		Collection values = map.values();
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total += i;
		}
		
		System.out.println("총점: " + total);
		System.out.println("평균: " + (float)total/set.size());
		System.out.println("최고점: " + Collections.max(values));
		System.out.println("최저점: " + Collections.min(values));
	}
	
	

}
