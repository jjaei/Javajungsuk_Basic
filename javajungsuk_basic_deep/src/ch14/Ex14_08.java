package ch14;

import java.util.Optional;
import java.util.OptionalInt;

public class Ex14_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Optional은 모든 종류의 객체 저장 가능(null을 직접 다루는 건 위험하다.)
		// null체크를 하려면 if문을 사용해야 하는데 번거롭다.
	//	String str = "abcde";
	//	Optional<String> optStr = Optional.of(str);
	    Optional<String> optStr = Optional.of("abcde");
	    Optional<Integer> optInt = optStr.map(String::length);
	    System.out.println("optStr= " + optStr.get());
	    System.out.println("optInt= " + optInt.get()); 
	    
	    int result1 = Optional.of("123")
	    			.filter(x->x.length() > 0)
	    			.map(Integer::parseInt).get(); 
	    
	    int result2 = Optional.of("")
	    			.filter(x->x.length() > 0)
	    			.map(Integer::parseInt).orElse(-1);
	    // 값이 null 이면 -1을 반환한다.
	    System.out.println("result1= " + result1);
	    System.out.println("result2= " + result2);
	    
	    Optional.of("456").map(Integer::parseInt)
	    			.ifPresent(x -> System.out.printf("result3= %d%n", x));
	    // ifPresent: null이 아닐 때만 실행됨.
	    
	    OptionalInt optInt1 = OptionalInt.of(0);  // 0을 저장
	    OptionalInt optInt2 = OptionalInt.empty();  // 빈 객체 생성
	    
	    System.out.println("optInt1= " + optInt1.isPresent());  // true
	    System.out.println("optInt2= " + optInt2.isPresent());  // false
	    // isPresent: null이면 false 반환
	     
	    System.out.println(optInt1.getAsInt());   // 0
//	    System.out.println(optInt2.getAsInt());   // NoSuchElementException 발생
	    
	    System.out.println("optInt1= " + optInt1);
	    System.out.println("optInt2= " + optInt2);
	    System.out.println("optInt1.equals(optInt2) ? " + optInt1.equals(optInt2));  // false
	}

}
