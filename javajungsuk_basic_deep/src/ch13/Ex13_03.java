package ch13;

public class Ex13_03 {

	static long startTime = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx03_1 t1 = new ThreadEx03_1();
		t1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("-"));
		}
		
		System.out.print("소요시간2: " + (System.currentTimeMillis() - Ex13_03.startTime));
	}

}

class ThreadEx03_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.printf("%s", new String("|"));
		}
		
		System.out.print("소요시간2: " + (System.currentTimeMillis() - Ex13_03.startTime));
	}
}