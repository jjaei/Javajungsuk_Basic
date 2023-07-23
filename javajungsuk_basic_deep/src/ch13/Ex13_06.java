package ch13;

public class Ex13_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadEx06_1 th1 = new ThreadEx06_1();
		ThreadEx06_2 th2 = new ThreadEx06_2();
	
		th2.setPriority(9);
		System.out.println("Priorty of th1(-) : " + th1.getPriority());
		System.out.println("Priorty of th2(|) : " + th2.getPriority());
		th1.start();
		th2.start();
	}
}

class ThreadEx06_1 extends Thread {
	public void run() {
		for(int i=0; i< 300; i++) {
			System.out.print("-");
			for(int x=0; x<10000000; x++);
		}
	}
}

class ThreadEx06_2 extends Thread {
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.print("|");
			for(int x=0; x<1000000; x++);
		}
	}
}