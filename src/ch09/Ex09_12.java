package ch09;

public class Ex09_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb1 = new StringBuffer("01");
		StringBuffer sb2 = sb1.append(23);
		sb1.append('4').append(56);
		
		StringBuffer sb3 = sb1.append(78);
		sb3.append(9.0);
		
		System.out.println("sb1= " + sb1);  // 0123456789.0
		// append의 반환타입이 StingBuffer의 자신이어서 sb1에도 모든 것이 append된 것을 볼 수 있다.
		System.out.println("sb2= " + sb2);  // 0123456789.0
		System.out.println("sb3= " + sb3); // 0123456789.0
		System.out.println("sb1= " + sb1.deleteCharAt(10));  // 01234567890
		System.out.println("sb1= " + sb1.delete(3, 6));  // 01267890
		System.out.println("sb1= " + sb1.insert(3, "abc"));  // 012abc67890
		System.out.println("sb1= " + sb1.replace(6, sb1.length(), "END"));  // 012abcEND
		System.out.println("sb1.capacity= " + sb1.capacity());   //18 
		System.out.println("sb1.length= " + sb1.length());  //9

	}

}
