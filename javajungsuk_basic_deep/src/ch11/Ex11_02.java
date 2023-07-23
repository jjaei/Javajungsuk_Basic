package ch11;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Stack s = new Stack();
		Queue q = new LinkedList();
		// Queue 인터페이스를 구현한 LinkedList 사용
		
		s.push("0"); // 저장
		s.push("1"); 
		s.push("2"); 
		
		q.offer("0"); // 저장
		q.offer("1"); 
		q.offer("2"); 
		
		System.out.println(" - Stack - ");
		while(!s.empty()) {
				System.out.println(s.pop());
		}
		
		System.out.println(" - Queue - ");
		while(!q.isEmpty()) { 
				System.out.println(q.poll());
		}
		
		
	}

}
