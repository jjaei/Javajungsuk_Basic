package ch02;

public class Ex02_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String url = "jaeiva.tistory.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d);  // 전제 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n", d);
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url); 
		System.out.printf("[%-20s]%n", url);  // 왼쪽정렬 20글자
		System.out.printf("[%.8s]%n", url); // 왼쪽에서 8글자만 출력
				
	}

}
