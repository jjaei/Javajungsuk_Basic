package ch07;

public class Ex07_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point3D p = new Point3D(1,2,3);
		System.out.println("x = " + p.x + ", y = " + p.y + ", r = "+ p.r);
		
	}

}

class Point {
	int x, y;
	Point(int x, int y){ // 생성자
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point {
	int r;
	
	Point3D(int x, int y, int r) {
		super(x,y); // Point(int x, int y)를 호출한다.
		this.r = r;
	}
}
