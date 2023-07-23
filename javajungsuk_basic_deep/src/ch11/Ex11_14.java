package ch11;

import java.util.TreeSet;

public class Ex11_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//TreeSet에 데이터를 저장할 때는 add 메서드를 사용한다.
		// set은 중복을 허용하지 않기 때문에 add 사용 시 equals()와 hashCode()를 호출한다.
		
		TreeSet set = new TreeSet();  // 범위 검색에 유리하다. (from ~ to)
		
		String from = "b";
		String to = "d";
		
		set.add("abc");      set.add("alien");    set.add("bat");
		set.add("car");      set.add("Car");      set.add("disc");
		set.add("dance");    set.add("dZZZZ");    set.add("dzzzz");
		set.add("elephant"); set.add("elevator"); set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search: from " + from + " ~ to " + to);
		System.out.println("result1 : " + set.subSet(from, to));
		System.out.println("result2 : " + set.subSet(from, to + "dzzz"));
	
	}

}
