package ch10;

import java.util.Calendar;

public class Ex10_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 2023;
		int month = 5;
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		
		// 월의 경우 0~11의 값을 가지므로 -1 해주기
		sDay.set(year, month-1, 1);
		eDay.set(year, month, 1);
		
		eDay.add(Calendar.DATE, -1);  // 다음 달의 1에서 -1을 해주면 현재 월의 마지막 날이 된다.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);  // 첫번째 요일 찾기
		END_DAY = eDay.get(Calendar.DATE);   // eDay에 지정된 날짜 얻기
	
		System.out.println("      " + year + "년 " + month + "월");
		System.out.println(" SU MO TU WE TH FR SA");
		
		// 해당 월의 1일이 어느 요일인지에 따라 공백을 출력한다.
		// 만약 1일이 수요일이라면, 공백을 세 번 찍어야 한다. (일요일부터 시작하니까)
		
		for(int i=1; i<START_DAY_OF_WEEK; i++) {
			System.out.print("   ");
		}
		
		for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++, n++) {
			System.out.print( (i<10)? "  " + i : " " +i);
			if(n%7==0) 
				System.out.println();
		}
	}

}
