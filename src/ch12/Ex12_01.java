package ch12;

import java.util.*;

public class Ex12_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Tv> list = new ArrayList<Tv>();  // Tv타입의 객체만 저장할 수 있음.
		list.add(new Tv());
//		list.add(new Audio());  에러
		
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv> tvList = new ArrayList<Tv>();
	//  ArrayList<Product> tvList = new ArrayList<Tv>();  에러
	//  List<Tv> tvList = new ArrayList<Tv>();   Ok. 다형성
		
		productList.add(new Tv());  // public boolean add(Product e)
		productList.add(new Audio());
		
		tvList.add(new Tv());  // public boolean add(Tv e)
		tvList.add(new Tv());
	//	tvList.add(new Audio());  에러
		
		printAll(productList);
	//  printAll(tvList)  // 컴파일 에러
		
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p : list)
			System.out.println(p);
	}

}

class Product{}
class Tv extends Product{}
class Audio extends Product{}