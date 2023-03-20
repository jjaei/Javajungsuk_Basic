package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// comparable 기본 정렬기준, 주어진 객체를 자신과 비교 , compareTo
		// comparator 다른 기준으로 정렬하고자 할 때 사용, 왼쪽이 크면 양수, 오른쪽이 크면 음수, 같으면 0 반환, compare
		
		String[] strArr = {"cat", "Dog", "Lion", "tiger", "Cat", "dog"};
		
		Arrays.sort(strArr);
		// String의 Comparable 구현에 의한 정렬(기본정렬기준, 대문자 -> 소문자)
		System.out.println("strArr= " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		// 대소문자 구분 안 하는 정렬기준 사용
		// 같은 문자의 대소문자 중에서는 대문자가 먼저 출력됨.(C -> c)
		System.out.println("strArr= " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending()); // 역순 정렬
		System.out.println("strArr= " + Arrays.toString(strArr));
	}

}

class Descending implements Comparator {
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c2.compareTo(c1);  // 역순 정렬
			// return c1.compareTo(c2) * -1 도 역순 정렬임.		
		}
		
		return -1; 
	}
}
