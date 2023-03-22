package ch10;

import java.util.Calendar;

public class Ex10_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기분적으로 현재 날짜와 시간으로 설정된다.
		 Calendar today = Calendar.getInstance();
		 System.out.println("이 해의 연도: " + today.get(Calendar.YEAR));
		 System.out.println("이 해의 월: " + today.get(Calendar.MONTH));
		 // 0월부터 11월로 표시된다.
		 System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		 System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		 System.out.println("이 달의 일: " + today.get(Calendar.DATE));
		 System.out.println("이 달의 일: " + today.get(Calendar.DAY_OF_MONTH));
		 System.out.println("이 해의 일: " + today.get(Calendar.DAY_OF_YEAR));
		 System.out.println("오늘의 요일: " + today.get(Calendar.DAY_OF_WEEK));
		 // 1은 일요일(1부터 7까지)
		 System.out.println("이 달의 몇 째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		 System.out.println("오전과 오후: " + today.get(Calendar.AM_PM));
		 // 0은 오전 1은 오후
		 
		 System.out.println("현재 시간(0~11): " + today.get(Calendar.HOUR));
		 System.out.println("현재 시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
		 System.out.println("현재 분(0~59): " + today.get(Calendar.MINUTE));
		 System.out.println("현재 초(0~59): " + today.get(Calendar.SECOND));
		 System.out.println("천분의 일초(0~999): " + today.get(Calendar.MILLISECOND));
		 
		 // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다. (1시간 = 60*60초)
		 System.out.println("TimeZone(-12~+12): " + today.get(Calendar.ZONE_OFFSET/60*60*1000));
		 System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE));
	 
	}

}
