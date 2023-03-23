package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		Scanner sc = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("날짜를 " + pattern + "의 형태로 입력해주세요. 예) 2023/03/31 ");
		while(true) {
			try {
				inDate = df.parse(sc.nextLine());
				break;
			} catch(Exception e) {
				System.out.println("형식이 올바르지 않습니다. 다시 입력해주세요. 예) 2023/03/31 ");
			}
		}
		
		Calendar c = Calendar.getInstance();
		c.setTime(inDate);
		Calendar today = Calendar.getInstance();
		long day = ((c.getTimeInMillis() - today.getTimeInMillis())/(60*60*1000));
		System.out.println("입력하신 날짜는 현자 날짜와 " + day + "시간 차이가 있습니다.");
	}

}
