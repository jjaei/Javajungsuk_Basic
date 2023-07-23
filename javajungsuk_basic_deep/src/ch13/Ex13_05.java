package ch13;

import javax.swing.JOptionPane;

class Ex13_05 {

	public static void main(String[] args) throws Exception {

		ThreadEx05_1 t1 = new ThreadEx05_1();
		t1.start();
		
		String s = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + s + "입니다.");
	}

}

class ThreadEx05_1 extends Thread {
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				sleep(1000);  // 1초간 시간을 지연시킨다.
			} catch (Exception e) {}
		}
	}
}