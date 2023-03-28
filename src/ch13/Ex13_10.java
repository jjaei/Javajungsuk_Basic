package ch13;

public class Ex13_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RunImplEx10 r = new RunImplEx10();
		Thread th1 = new Thread(r, "*");
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000);
			th1.suspend();  // 스레드 th1을 잠시 중단시킨다.
			Thread.sleep(2000);
			th2.suspend();  // 스레드 th2를 잠시 중단시킨다.
			Thread.sleep(3000);
			th1.resume();   // 스레드 th1을 재개한다.
			Thread.sleep(3000);
			th1.stop();   // th1을 강제 종료시킨다.
			th2.stop();   // th2를 강제 종료시킨다.
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}
	}

}

class RunImplEx10 implements Runnable {
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName());
			// 현재 사용중인 스레드의 이름을 얻음
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
	}
}