package ch09;

public class Ex09_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		// 기본형을 참조형으로 형변환한다. (형변환 생략 가능하다.)
		
		Integer intg = i;
		// Integer intg = (Integer)i; 위와 같음.
		// Integer intg = Integer.valueOf(i); 위와 같음.
		Object obj = (Object)i;
		Object obj2 = Integer.valueOf(i);
		
		Long l = 100L;
		// Long l = new Long(100L);과 같음
		
		int i2 = intg + 10;  
		// 참조형과 기본형 간에 연산도 가능하다.
		long l2 = intg + l;
		// 참조형 간에 덧셈도 가능하다.
		
		Integer intg2 = new Integer(20);
		int i3 = (int)intg2;
		// 참조형을 기본형으로 형변환도 가능. 형변환 생략 가능
		
		Integer intg3 = intg2 + i3;
		
		System.out.println("i= "+i); // 10;
		System.out.println("intg= "+intg); // 10;
		System.out.println("obj= "+obj); // 10;
		System.out.println("l= "+l);  // 100;
		System.out.println("intg + 10= "+i2);  // 20
		System.out.println("intg + lng = "+l2);  // 110
		System.out.println("intg2= "+intg2);   // 20
		System.out.println("i3= "+i3);  // 20
		System.out.println("intg2 + i3 = "+intg3);   // 40

	}

}
