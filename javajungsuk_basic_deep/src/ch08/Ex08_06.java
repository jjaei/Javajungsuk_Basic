package ch08;

public class Ex08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Exception e = new Exception("고의로 발생 시키는 오류");
			throw e;
		//  thorw new Exception("고의로 발생 시키는 오류"); 와 같은 문장
		} catch(Exception e) {
			System.out.println("에러 메시지: "+ e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("시스템이 정상 종료되었습니다.");
	}

}
