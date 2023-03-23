package ch10;

import java.util.Calendar;

public class Ex10_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int[] TIME_UNIT = {3600, 60, 1};   // 큰 단위를 앞에 놓기
		final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초"};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		time1.set(Calendar.HOUR_OF_DAY, 8);
		time1.set(Calendar.MINUTE, 54);
		time1.set(Calendar.SECOND, 14);   // 시간을 8시 54분 14초로 설정한다.
		
		time2.set(Calendar.HOUR_OF_DAY, 22);
		time2.set(Calendar.MINUTE, 31);
		time2.set(Calendar.SECOND, 15);   // 시간을 22시 31분 15초로 설정한다.
		
		System.out.println("time1: " + time1.get(Calendar.HOUR_OF_DAY) + "시 "
				+ time1.get(Calendar.MINUTE) + "분 " + time1.get(Calendar.SECOND) + "초");
		
		System.out.println("time2: " + time2.get(Calendar.HOUR_OF_DAY) + "시 "
				+ time2.get(Calendar.MINUTE) + "분 " + time2.get(Calendar.SECOND) + "초");
		
		long dt = (time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000;
		System.out.println("time1과 time2의 차이는 "+ dt + "초 입니다.");
		
		String s = "";
		for (int i=0; i<TIME_UNIT_NAME.length; i++) {
			s += dt / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			dt %= TIME_UNIT[i];
		}
		
		System.out.println("시분초로 변환하면 " + s + " 입니다.");
	}

}
