package ch03;

public class Ex03_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
		absX = x >= 0 ? x : -x;
		// x가 0이상이면 양수, 아니면 음수
		absY = y >= 0 ? y : -y;
		absZ = z >= 0 ? z : -z;
		signX = x > 0 ? '+' : ( x==0 ? ' ' : '-');
		signY = y > 0 ? '+' : ( y==0 ? ' ' : '-');
		signZ = z > 0 ? '+' : ( z==0 ? ' ' : '-');
		//조건연산자 중첩
		
		System.out.printf("x= %c%d%n", signX, absX);
		System.out.printf("y= %c%d%n", signY, absY);
		System.out.printf("z= %c%d%n", signZ, absZ);
		
		
	}

}
