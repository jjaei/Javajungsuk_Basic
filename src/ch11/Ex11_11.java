package ch11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashSet은 중복허용 하지 않기 때문에 기존에 같은 객체가 있는지 확인하기
		// equals와 hashCode가 오버라이딩 되어있어야 함.
		
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");  // 출력 안 됨.
		set.add("abcd");
		set.add(new Person("김자바", 15));
		set.add(new Person("김자바", 15)); 
		// 객체는 두 번 저장해도 중복제거가 안 되기 때문에 equals와 hashCode를 오버라이딩 해줘야 함.
		set.add(new Person("이자바", 17));
		
		System.out.println(set);
	}

}
// 이클립스 메뉴의 Source - Generate HashCode()... 메뉴 사용할 것
class Person {
	
	String name;
	int age;
	
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person))
			return false; // 형변환 할 수 없으면 false를 반환
		
			 Person p = (Person)obj; 
			 return this.name.equals(p.name) && this.age == p.age;
			 // 나 자신의 이름과 나이를 p의 이름과 나이랑 비교하기

	}
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){ // toString 오버라이딩
		return name + ":" + age;
	}
}