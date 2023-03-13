package ch07;

public class Ex07_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		
		System.out.println(stv.channel);
		stv.displayCaption("Hello, World!");
		stv.caption= true;
		stv.displayCaption("Hello, World!");
		// 캡션 상태가 true가 되었기 때문에 display가 정상적으로 호출 됨.
		
	}

}

class Tv{
	boolean power;  // 전원상태 (on, off)
	int channel; 
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDwon() {--channel;}
}

class SmartTv extends Tv{ // Tv클래스를 상속받는다.
	boolean caption;
	void displayCaption(String text) {
		if(caption) {  // caption상태가 true일 때만 text를 보여준다.
			System.out.println(text);
		}
	}
}