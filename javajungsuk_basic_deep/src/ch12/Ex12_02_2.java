package ch12;

import java.util.HashMap;

public class Ex12_02_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Students2> map = new HashMap<>();
		map.put("김자바", new Students2("김자바", 1, 1, 100, 100, 100));
				
		Students2 s = map.get("김자바");
		System.out.println(map);
			
	}

}

class Students2 {
	String name = "";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
			
	Students2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
	}

}
