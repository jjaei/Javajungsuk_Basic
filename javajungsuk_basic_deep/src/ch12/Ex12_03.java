package ch12;

import java.util.ArrayList;
class Fruit implements Eatable {
	public String toString() {return "Fruit";}
}

class Apple extends Fruit { public String toString() {return "Apple";}}
class Grape extends Fruit { public String toString() {return "Grape";}}
class Toy { public String toString() {return "Toy";}}

interface Eatable {}

public class Ex12_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
	//	FruitBox<Grape> grapeBox = new FruitBox<Apple>();   에러. 타입이 불일치 함.
	//	FruitBox<toy> toyBox = new FruitBox<toy>();   에러.
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
	//	appleBox.add(new Grape());  // 에러. Grape는 Apple의 자손이 아니다.
		grapeBox.add(new Grape());
	//	grapeBox.add(new Apple());  //에러. Apple은 Grape의 자손이 아니다.
		
		System.out.println("fruitBox: " + fruitBox);
		System.out.println("appleBox: " + appleBox);
		System.out.println("grapeBox: " + grapeBox);
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
class Box<T> { 
	ArrayList<T> list = new ArrayList<T>();  // item을 저장할 list
	void add(T item) {list.add(item);}  // 박스에 item을 추가
	T get(int i) {return list.get(i);}  // 박스에서 item을 꺼냄
	int size() {return list.size();}
	public String toString() {return list.toString();}
	
}