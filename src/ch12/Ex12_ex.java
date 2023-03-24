package ch12;

import java.util.*;

public class Ex12_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		// 여러 종류의 객체를 저장하고 싶다면 타입에 Object를 적어주면 됨.
		
		list.add(10);  // list.add(new Integer(10));
		list.add(20);
	//	list.add("30");  지네릭스 덕분에 타입 체크가 강화됨.
		list.add(30);
		
	//	Integer i = (Integer)list.get(2);   // 컴파일 OK, 실행 에러 컴파일러의 한계
		Integer i = list.get(2);  // 형변환 생략 가능
		
		System.out.println(list);	
		
	}
}
