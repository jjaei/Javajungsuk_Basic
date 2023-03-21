package ch11;

import java.util.HashSet;
import java.util.Iterator;

public class Ex11_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet setA = new HashSet();
		HashSet setB = new HashSet();
		HashSet setHab = new HashSet();
		HashSet setKyo = new HashSet();
		HashSet setCha = new HashSet();
		
		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
		System.out.println("setA= " + setA);
		
		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
		System.out.println("setB=" + setB);
		
		// 교집합 (A와 B 중에 공통된 것)
		Iterator it = setB.iterator(); // setB에서 하나씩 꺼내서 
		while(it.hasNext()) {
			Object tmp = it.next(); 
			if(setA.contains(tmp))  // A에 있는지 확인
				setKyo.add(tmp);  // 있으면 setKyo에 추가
		}
		
		System.out.println("setKyo(교집합)= " +setKyo);
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp))
				setCha.add(tmp);
		}
		// B에 포함되지 않는 A를 tmp에 저장해서 출력하기
		
		System.out.println("setCha(차집합)= " +setCha);
		
		
		// 합집합은 A와 B를 둘 다 읽어서 저장하면 된다.
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next());
		}
		
		System.out.println("setHab(합집합)= " +setHab);
			
	}

}
