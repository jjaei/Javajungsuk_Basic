package ch11;

import java.util.*;

public class Ex11_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list1 = new ArrayList(10);
		// 10개를 저장할 수 있는 ArrayList 생성
		
		list1.add(new Integer(5)); //list에 저장
		list1.add(4);
		list1.add(3);
		list1.add(8);
		list1.add(0);
		list1.add(1);
		list1.add(1); // 중복 허용
		
		ArrayList list2 = new ArrayList(list1.subList(2,5));
		//list1의 2번 인덱스부터 5번 인덱스(미포함)까지를 list2에 저장한다.
		
		print(list1, list2);
		
		Collections.sort(list1);
		Collections.sort(list2);  // list1과 list2를 정렬한다.
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2): " + 
				list1.containsAll(list2));  // list2가 list1에 포함되었는지? > true
		
		list2.add("B");
		list2.add("C");
		// list2에 B와 C를 추가한다.
		list2.add(3,"A");
		// list2의 3인덱스에 "A"를 추가한다.
		
		
		list2.set(3,  "AA");
		print(list1, list2); // 인덱스3을 바꾼다.
		
		list1.add(0, "1");
		// indexOf()는 지정된 객체의 위치(인덱스)를 알려준다.	
		System.out.println("index= " + list1.indexOf("1"));
		System.out.println("index= " + list1.indexOf(new Integer(1)));
		print(list1, list2);

		list1.remove(0); // 인덱스가 0인 것을 삭제함.
		print(list1, list2);
		
		// list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2): " + list1.retainAll(list2)); 
		print(list1,list2);
		
		// list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
	
	}
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1: " + list1);
		System.out.println("list2: " + list2);
		System.out.println();
	}
}
