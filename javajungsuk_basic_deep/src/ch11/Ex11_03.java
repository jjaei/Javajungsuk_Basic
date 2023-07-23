package ch11;

import java.util.Stack;

public class Ex11_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stack은 수식계산, 괄호검사, 웹브라우저 뒤로/앞으로 등에 사용함
		Stack s = new Stack();
		String expression = "((3+5)*8-2)";
		
		System.out.println("expression: " + expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				// expression를 한 글자씩 ch에 저장한다.
				
				if(ch == '(') {
					s.push(ch + "");
				} else if ( ch == ')'){
					s.pop();
				}
			}
			
			if(s.empty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
			
		} catch(Exception e) {
			System.out.println("오류: 괄호가 일치하지 않습니다.");
		}
	}

}
