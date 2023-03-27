package ch12;

class Parent {
	void parentMethod() {}
}

class Child extends Parent {
//	@Override
//	void parentmethod() {}  // 조상 메서드의 이름을 잘못 적은 경우 애너테이션이 에러를 알려줌.
}