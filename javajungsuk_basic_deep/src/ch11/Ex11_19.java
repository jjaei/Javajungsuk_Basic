package ch11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;

public class Ex11_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		System.out.println(list);
		
		Collections.addAll(list, 1,2,3,4,5);
		System.out.println(list);
		
		Collections.rotate(list,1);  // 반시계 방향으로 회전
		System.out.println(list);
		
		Collections.swap(list, 0, 2); // 인덱스 0과 2의 위치를 교환함
		System.out.println(list);
		
		Collections.shuffle(list);
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());  // 역순 정렬
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		int i = Collections.binarySearch(list,3);  
		// 3이 저장된 위치(index)를 반환하되, list가 정렬되어 있는 상태여야 올바른 답이 출력됨.
		System.out.println(i);
		
		System.out.println("max=" + Collections.max(list));
		System.out.println("min" + Collections.min(list));
		System.out.println("min=" + Collections.max(list, Collections.reverseOrder()));
		
		Collections.fill(list, 7);  // list를 7로 채운다.
		System.out.println(list);
		
		List list2 = Collections.nCopies(list.size(), 3);
		// list2를 생성하고 3으로 채운다. 결과는 변경할 수 없다.
		System.out.println(list2);
		
		System.out.println(Collections.disjoint(list, list2));
		// 공통요소가 없으면 true 출력
		
		Collections.copy(list, list2);
		// list2의 내용을 list1에 복사한다.
		System.out.println("list= " + list);
		System.out.println("list2= " + list2);
		
		Collections.replaceAll(list,3,1);
		// 리스트에서 3을 1로 바꿔준다.
		System.out.println("list= " + list);
		
		Enumeration e = Collections.enumeration(list);
		// iterator의 예전 버전, 열거형
		ArrayList list3 = Collections.list(e);	
		System.out.println("list3= " + list3);
		
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
