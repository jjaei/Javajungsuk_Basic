class MyMath {
	long a, b;
	
	// 인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	long add() {return a + b;}   // a, b는 iv
	long subtract() {return a - b;}
	long multiply() {return a * b;}
	double divide() {return a / b;}
	
	// 인스턴스 변수와 관계없이 매개변수만으로도 작업이 가능하다.
	
	static long add(long a, long b) {return a + b;}  // a와 b는 지역변수
	static long subtract(long a, long b) {return a - b;}  
	static long multiply(long a, long b) {return a * b;}  
	static double divide(long a, long b) {return a / (double)b;}  
	
 }

class Ex06_09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 클래스 메서드를 호출한다.
		// 클래스 메서드는 인스턴스(객체)생성 없이 호출이 가능하다.
		//대신 호출할 때 참조변수가 없으므로 클래스 이름을 앞에 붙여줘야 한다.
		
		System.out.println(MyMath.add(5L, 7L));
		System.out.println(MyMath.subtract(5L, 7L));
		System.out.println(MyMath.multiply(5L, 7L));
		System.out.println(MyMath.divide(5L, 7L));

		
		MyMath mm = new MyMath(); // 객체 생성
		mm.a = 5;
		mm.b = 7;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}
}