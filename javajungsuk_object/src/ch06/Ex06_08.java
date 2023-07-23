package ch06;

public class Ex06_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Data3 d = new Data3();
		d.x = 10;
		
		Data3 d2 = copy(d);
		System.out.println("d.x = " + d.x);
		System.out.println("d2.x = " + d2.x);
		
	}

	static Data3 copy(Data3 d) {;
	Data3 d3 = new Data3();  // 새로운 객체 d3를 생성
	d3.x = d.x;
	return d3;
	
	}
	
}

class Data3 {
	int x;
}