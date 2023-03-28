package ch13;

public class Ex13_07 implements Runnable {
	static boolean autoSave = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread(new Ex13_07());
		t.setDaemon(true);   // 이 부분이 없으면 종료되지 않는다.
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
			
			
				System.out.println(i);
				
				if(i==5)
					autoSave = true;
			}
			
			System.out.println("프로그램을 종료합니다.");
		}
	
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(3*1000);   // 3초마다 재운다.
			} catch(InterruptedException e) {}
			
			if(autoSave)  // autoSave의 값이 true일 때
				autoSave();   // autoSave를 호출한다.
		}
	}
		
	public void autoSave() {
		System.out.println("작업파일이 자동 저장되었습니다.");
	}
}




