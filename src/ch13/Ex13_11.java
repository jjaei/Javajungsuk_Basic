package ch13;

public class Ex13_11 {
	static long st = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Thread11_1 th1 = new Thread11_1();
		Thread11_2 th2 = new Thread11_2();
		th1.start();
		th2.start();
		st = System.currentTimeMillis();
		
		try {
			th1.join();  // main스레드가 th1의 작업이 끝날 때까지 기다린다.
			th2.join();  // main스레드가 th2의 작업이 끝날 때까지 기다린다.
		} catch(InterruptedException e) {}
		
		System.out.print("소요시간: " + (System.currentTimeMillis()-Ex13_11.st));
		
	}

}

class Thread11_1 extends Thread {
	public void run(){
		for(int i=0; i<300; i++) {
			System.out.print(new String("-"));
		}
	}
}

class Thread11_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
	}
}