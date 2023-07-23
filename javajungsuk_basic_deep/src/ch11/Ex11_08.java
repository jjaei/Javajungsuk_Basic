package ch11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr = {25, 17, 72, 44, 37, 10};
		
		Arrays.sort(arr); // Integer가 가지고 있는 기본 정렬기준 compareTo로 정렬함.(오름차순)
		System.out.println("arr= " + Arrays.toString(arr));
		
		// sort(Object[] objArr, Comparator c)
		Arrays.sort(arr, new DescComp());
		// DescComp에 구현된 정렬 기준으로 정렬하기
		System.out.println("arr= " + Arrays.toString(arr));
	}

}

class DescComp implements Comparator {
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer)) 
			return -1; // 형변환 할 수 없으면 비교하지 않고 -1 반환
			
			Integer i  = (Integer)o1;
			Integer i2 = (Integer)o2;
			// 아니면 형변환
			
			return i.compareTo(i2)*-1;
			// 기본 정렬인 compareTo()의 역순으로 정렬
			// return i2.compareTo(i1)도 같은 결과값을 출력함.
		
	}
}
