package ch10;

import java.util.Arrays;
import java.util.Calendar;

public class Ex10_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
		// 요일은 1부터 시작하기 때문에 0은 비워둔다.
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2023, 2, 14);
		// 2023년 3월 23일
		// month의 경우 0부터 시작하기 때문에 3월은 2로 작성해야 한다.
		// date1.set(2023, Calendar.MARCH, 23);과 같음
		System.out.println("date1은 " + toString(date1) + "이고 " 
				+ DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일 입니다.");
		System.out.println("date2(오늘)은 " + toString(date2) + "이고 "
				+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일 입니다.");
		
		//두 날짜간의 차이를 얻으려면 getTimeInMillis() 천 분의 일초 단위로 변환해서 계산하면 된다.
		long dt = ((date2.getTimeInMillis() - date1.getTimeInMillis()) / 1000);
		System.out.println("date1부터 date2까지 " + dt + "초가 지났습니다.");
		System.out.println("일로 변환하면 " + (dt/(24*60*60)) + "일이 지났습니다.");
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH) + "월 " + 
				date.get(Calendar.DATE) + "일";
	}

}

