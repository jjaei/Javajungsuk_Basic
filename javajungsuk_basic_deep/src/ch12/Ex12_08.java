package ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Deprecated
@SuppressWarnings("1111")   // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="230401", hhmmss="235959"))

public class Ex12_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Class<Ex12_08> cls = Ex12_08.class;  // Ex12_08의 Class 객체를 얻는다.
		
		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy() = " + anno.testedBy());
		System.out.println("anno.testDate().yymmdd()=" +anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()=" +anno.testDate().hhmmss());
		
		for(String str : anno.testTools()) 
			System.out.println("testTools = " + str);
		
		System.out.println();
		
		// Ex12_08에 적용된 모든 애너테이션을 가져온다.
				Annotation[] annoArr = cls.getAnnotations();

				for(Annotation a : annoArr)
					System.out.println(a);
	}

}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용 가능하도록 지정한다.
@interface TestInfo {
	int count() default 1;
	String testedBy();
	String[] testTools() default "Junit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)   // 실행 시에 사용 가능하도록 지정한다.
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType {FIRST, FINAL}