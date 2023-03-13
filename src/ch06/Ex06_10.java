package ch06;

public class Ex06_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyMath3 mm = new MyMath3(); // 객체 생성
		System.out.println("mm.add(3, 3) 결과: " + mm.add(5,7));
		System.out.println("mm.add(3, 3) 결과: " + mm.add(5,7L));
		System.out.println("mm.add(3, 3) 결과: " + mm.add(5L,7));
		System.out.println("mm.add(3, 3) 결과: " + mm.add(5L,7L));
		
		int[] a= {10, 20, 30};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
		
	}

}

class MyMath3 {  // 메서드 오버로딩
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.print("long add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("long add(long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("long add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {		// 배열의 모든 요소의 합을 결과로 돌려준다.
		System.out.print("int add(int[] a) - ");
		int result = 0;
		for(int i=0; i < a.length;i++) 
			result += a[i];
		
		return result;

		}
	}
