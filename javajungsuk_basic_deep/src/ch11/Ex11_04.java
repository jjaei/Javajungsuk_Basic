package ch11;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_04 {
	// Queue는 최근사용문서, 인쇄작업대기목록 등에 사용함
	static Queue q = new LinkedList(); 		// LinkedList를 사용해서 만들기
	static final int MAX_SIZE = 5;
	//Queue에 최대 5개까지만 저장한다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print(">>");
			try {
				// 화면으로부터 라인 단위로 입력받는다.
				String input = sc.nextLine().trim();  // 공백 제거
				
				if("".equals(input)) continue;
				// 입력이 빈칸이면 true로 돌아가서 무한반복 실행함.
				
				if(input.equalsIgnoreCase("q")) {
					System.out.println("프로그램이 종료됩니다.");
					System.exit(0); // 프로그램 종료
				} else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - 도움말을 보여줍니다.");
					System.out.println(" q(Q) - 프로그램을 종료합니다.");
					System.out.println(" history - 최근에 입력한 명령어 " 
					+ MAX_SIZE + "개를 보여줍니다.");
				} else if(input.equalsIgnoreCase("history")) {
					// 입력받은 명령어를 저장한다.
					save(input);
					
					// LinkedList의 내용을 보여준다.
					LinkedList list = (LinkedList)q;
					
					final int SIZE = list.size();
					for(int i=0; i<SIZE; i++) {
						System.out.println((i+1)+". "+ list.get(i));
					}
					
				} else {
					save(input);
					System.out.println(input);
				}

			} catch(Exception e) {
				System.out.println("입력 오류입니다.");
			}
			
		}
		
	}
	public static void save(String input) {
		// queue에 저장한다.
		if(!"".equals(input)) // if(input!=null && input.equals("")
			q.offer(input); // 큐에 명령어를 저장한다.
		
		// queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if(q.size() > MAX_SIZE) {  // size()는 Collection 인터페이스에 있다.
			q.remove();
		}
		
	}
}

