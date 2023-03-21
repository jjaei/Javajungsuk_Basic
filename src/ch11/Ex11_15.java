package ch11;

import java.util.TreeSet;

public class Ex11_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet set = new TreeSet();
		int[] score= {60, 74, 33, 25, 72, 47, 88, 15};
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		//  set.add(new Integer(score[i]);
		}
			
		System.out.println("50보다 작은 값: " + set.headSet(50));
		System.out.println("50보다 큰 값: " + set.tailSet(50));
		System.out.println("30과 60 사이의 값: " + set.subSet(30,60));
		
	}

}
