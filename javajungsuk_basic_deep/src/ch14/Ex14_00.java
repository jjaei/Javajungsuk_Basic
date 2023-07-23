package ch14;

public class Ex14_00 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 함수(메서드)를 간단한 식(expression)으로 표현하는 방법, 람다식
		// 메서드 이름과 반환타입을 제거하고 -> 를 블록 앞에 추가한다.
		// 반환값이 있는 경우 식이나 값만 적고 return문 생략 가능하다.
		// 매개변수의 타입이 추론 가능하면 매개변수 생략 가능하다.(대부분 생략 가능)
		// 매개변수가 하나일 경우는 괄호 생략 가능하다. (타입이 있으면 생략 불가능)
		
//		Object obj = (a, b) -> a > b ? a : b   // 람다식. 익명객체
//		MyFunction2 f = new MyFunction2() {
//			public int max(int a, int b) {
//				return a > b ? a : b;
//			}
//		};
		
		// 람다식(익명 객체)을 다루기 위한 참조변수의 타입은 함수형 인터페이스로 한다.
		MyFunction2 f = (a, b) -> a > b ? a : b;
			
//		int value = obj.max(3, 5); // object 타입에는 max라는 메서드가 없어서 에러.
		// 형변환 할 만한 것도 없음. 함수형 인터페이스가 필요함.
		
		int value = f.max(3,  5);
		System.out.println("value= " + value);
	}

}

@FunctionalInterface
interface MyFunction2 {  // 함수형 인터페이스는 단 하나의 추상 메서드만 가져야 함.
	public abstract int max(int a, int b);
}
