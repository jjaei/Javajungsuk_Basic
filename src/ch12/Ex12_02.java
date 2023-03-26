package ch12;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex12_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("김자바", 1, 1));
		list.add(new Student("이자바", 1, 2));
		list.add(new Student("최자바", 2, 1));
	
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
		
	}

}

class Student {
	String name = "";
	int ban;
	int no;
	
	Student(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}