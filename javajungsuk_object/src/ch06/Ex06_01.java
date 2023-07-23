package ch06;

public class Ex06_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tv t = new Tv(); // Tv 객체 생성
		t.color = "rde";
		t.channel = 13; // Tv 인스턴스 멤버변수 channel의 값을 13으로 설정한다.
		t.channelDown(); // Tv 인스턴스 메서드 channelDown()을 호출한다.
		t.power();
		t.power();
		System.out.println("현재 채널은 " + t.channel + "번 입니다.");
		System.out.println("현재 Tv는 " + t.power + "입니다.");
		
	}

}

class Tv {  // Tv클래스(설계도) 생성
	// Tv의 속성(멤버변수)
	String color;  // 색상
	boolean power;  // 전원 on, off
	int channel;  // 채널
	
	// Tv의 기능(메서드)
	void power() { power = !power; }  // Tv on, off 메서드
	void channelUp() { channel++; }  // 채널을 올리는 메서드
	void channelDown() { channel--; }  // 채널을 내리는 메서드
}