package ch11;

import java.util.HashSet;

public class Ex11_12_2 {

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
		
		setA.retainAll(setB); // 교집합, 공통된 요소만 남기고 삭제
		System.out.println(setA); 
		setA.addAll(setB); // 합집합, setB의 모든 요소를 setA에 추가
		System.out.println(setA); 
		setA.removeAll(setB); // 차집합, setB와의 공통요소를 제거하기
		System.out.println(setA); 

	}

}
