package ch09;

import static java.lang.Math.*;
import static java.lang.System.*;
public class Ex09_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 3.142342;
		out.println("round(" + d + ")= " + round(d)); // 반올림, 3출력
		
		d *= 100; // 314.2342
		out.println("round(" + d + ")= " + round(d)); // 314
		
		out.println("round(" + d + ")/100= " + round(d)/100); // 3
		out.println("round(" + d + ")/100.0= " + round(d)/100.0); // 3.14
		
		out.println();
		
		out.printf("ceil(%3.1f)= %3.1f%n",1.1, ceil(1.1));  // 올림, 2.0
		out.printf("floor(%3.1f)= %3.1f%n",1.5, floor(1.5));  // 버림, 1.0
		out.printf("round(%3.1f)= %d%n",1.1, round(1.1)); // 반올림, 1
		out.printf("round(%3.1f)= %d%n",1.5, round(1.5));   // 반올림, 2
		out.printf("rint(%3.1f)= %f%n",1.5, rint(1.5));    //  2.000000
		out.printf("round(%3.1f)= %d%n",-1.5, round(-1.5));  // 반올림 -1
		out.printf("rint(%3.1f)= %f%n",-1.5, rint(-1.5));   //  -2.000000
		out.printf("ceil(%3.1f)= %f%n",-1.5, ceil(-1.5));   // 올림, -1.000000
		out.printf("floor(%3.1f)= %f%n",-1.5, floor(-1.5));  // 버림, -2.000000
		//rint는 주어진 값과 가장 가까운 정수값을 반환함. 가운데 값은 짝수를 반환함.	
	}
}
