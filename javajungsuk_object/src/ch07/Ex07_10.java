package ch07;

public class Ex07_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Unit[] group ={new Marine(), new Tank(), new Dropship()};
		for(int i=0; i<group.length; i++) {
			group[i].move(200, 300);
		}
		
	}

}

abstract class Unit { // 추상클래스
	int x, y;
	abstract void move(int x, int y);  // 추상메서드
	void stop() {}  // 현재 위치에 정지
}

class Marine extends Unit {
	void move(int x, int y) {
		System.out.println("Marine: " + x + "," + y + " 좌표로 이동합니다.");
	}
	void stimPack() {}
}

class Tank extends Unit {
	void move(int x, int y) {
		System.out.println("Tank: " + x + "," + y + " 좌표로 이동합니다.");
	}
	void changeMod() {}
}

class Dropship extends Unit {
	void move(int x, int y) {
		System.out.println("Dropship: " + x + "," + y + " 좌표로 이동합니다.");
	}
	void load() {}
	void unload() {}
}