package ch12;

import java.util.ArrayList;

class Fruit2		       	{ public String toString() { return "Fruit";}}
class Apple2 extends Fruit2	{ public String toString() { return "Apple";}}
class Grape2 extends Fruit2	{ public String toString() { return "Grape";}}

class Juice {
	String name;
	Juice(String name) {
		this.name = name + "Juice";
	}
	public String toString() {return name;}
}

class Juicer {  // 메서드의 매개변수에도 와일드카드 사용 가능함. Fruit2와 그 자손만 가능함.
	static Juice makeJuice(FruitBox2<? extends Fruit2> box) {
		String tmp = "";
		for(Fruit2 f : box.getList()) 
			tmp += f + " ";
		return new Juice(tmp);
	}
}
public class Ex12_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>();
	//	FruitBox2<? extends Fruit2> appleBox = new FruitBox2<Apple2>();
		
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		appleBox.add(new Apple2());
	//	appleBox.add(new Grape2());  에러
		appleBox.add(new Apple2());
		
		System.out.println(Juicer.makeJuice(fruitBox));
		System.out.println(Juicer.makeJuice(appleBox));
	}

}

class FruitBox2<T extends Fruit2> extends Box2<T> {}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item);      }
	T get(int i)     { return list.get(i);  }
	ArrayList<T> getList() { return list;   }
	int size()       { return list.size();  }
	public String toString() { return list.toString();}
}