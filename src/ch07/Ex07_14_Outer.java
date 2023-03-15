package ch07;

public class Ex07_14_Outer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Outer {
	private int outerIv = 0;
	static int outerCv = 0;
	
	class InstanceInner {
		int iiv = outerIv;  // 외부 클래스의 private 멤버 접근 가능
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		// static 클래스는 외부 클래스의 인스턴스 멤버에 접근 불가능
		// int siv = outerIv;
		static int scv = outerCv;
	}
	
	void myMerthod() {
		int lv = 0;
		final int LV = 0;   // final 생략 가능
		
		class LovalInner {
			int liv = outerIv;
			int liv2 = outerCv;
		// 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능
			// int liv 3 = lv;
			int liv4 = LV;
		}
	}
}