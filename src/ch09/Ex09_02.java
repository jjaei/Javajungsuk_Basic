package ch09;

public class Ex09_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person(1234567890123L);
		Person p2 = new Person(1234567890123L);
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");  // 출력
		} else {
			System.out.println("p1과 p2는 다른 사람입니다.");
		}
	}

}

class Person {
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person) // Person으로 형변환 여부 확인
			return id == ((Person)obj).id; // true면 형변환
		else
			return false;
	}
	
	Person(long id) {
		this.id = id;
	}
}
