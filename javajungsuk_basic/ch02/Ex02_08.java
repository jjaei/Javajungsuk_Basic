package ch02;

public class Ex02_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10, y = 5;  // int x = 10; int y = 5;를 한 줄로 작성한 것
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
		int tmp = x;  // x의 값을 tmp에 저장한다.
		x = y;  // y의 값을 x에 저장한다.
		y = tmp;  // tmp의 값을 y에 저장한다.
		
		System.out.println("x= " + x);
		System.out.println("y= " + y);
		
	}

}
