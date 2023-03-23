package ch10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2023년 3월 27일");
			System.out.println(df2.format(d));
		} catch(Exception e) {
			
		}
	}

}
