package ch03;

public class Ex03_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = -10;
		i += i; // i = i + (-10)과 같음.
		
		System.out.println(i); // -20
		
		i = -10;
		i = -i;
		
		System.out.println(i); // -(-10) , 10
		
		
	}

}
