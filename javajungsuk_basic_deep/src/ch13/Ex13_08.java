package ch13;

public class Ex13_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx08_1 th1 = new ThreadEx08_1();
		ThreadEx08_2 th2 = new ThreadEx08_2();
		
		th1.start();
		th2.start();
		
		try {
			th1.sleep(2000);
		} catch (InterruptedException e) {}
	
		System.out.print("<<main 종료>>");
		//th1과 th2가 종료된 2초 후에 main이 종료된다.
	}

}

class ThreadEx08_1 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("-");
		}	
		
		System.out.print("<<th1 종료>>");
		
	}
}

class ThreadEx08_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
		}
			
		System.out.print("<<th2 종료>>");	
	}
}