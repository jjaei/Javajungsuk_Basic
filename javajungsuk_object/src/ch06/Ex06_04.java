package ch06;

public class Ex06_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath mm = new MyMath();
		long result1 = mm.add(4, 6);
		long result2 = mm.subtract(4, 6);
		long result3 = mm.multiply(4, 6);
		double result4 = mm.divide(4, 6);
		
		System.out.println("add : " + result1);
		System.out.println("subtract : " + result2);
		System.out.println("multiply : " + result3);
		System.out.println("divide : " + result4);
		
	}
}

class MyMath{
	long add(long a, long b) {  // 메서드
		long result = a + b;
		return a + b;
	}
	
	// 메서드 오버로딩
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) { return a / b; }
	
}
