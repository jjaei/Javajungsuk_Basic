package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = {"A", "A", "A", "B", "B", "C", "D", "D", "D", "Z", "K", "K"};
		HashMap map = new HashMap();
		
		for(int i=0; i<data.length; i++) {
			if(map.containsKey(data[i])) {
				int value = (int)map.get(data[i]);
				map.put(data[i], value + 1);  // 기존에 존재하는 키면 기존 값을 1 증가시킨다.
			} else {
				map.put(data[i], 1);  // 기존에 존재하지 않는 키는 값을 1로 저장한다.
			}
		}
		
		Iterator it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			int value = (int)e.getValue();
			System.out.println(e.getKey() + " : " + printBar('*',value) + " " + value);
				
		}
	}
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i<bar.length; i++) 
			bar[i] = ch;
		
		return new String(bar);
		// String(char[] chArr);		
	}
}