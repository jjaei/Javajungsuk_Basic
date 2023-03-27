package ch13;

import javax.swing.JOptionPane;

public class Ex13_04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String s = JOptionPane.showInputDialog("아무 값이나 입력하세요.");
		System.out.println("입력하신 값은 " + s + "입니다.");
		
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);   // 1초간 시간을 지연시킨다.
				// 입력을 받고나서 카운트다운이 시작됨.
				// 입력받는데 기다리는 시간이 낭비됨.
			} catch(Exception e) {}
		}
	}

}
