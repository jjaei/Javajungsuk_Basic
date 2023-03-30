package ch14;

import java.util.Optional;

public class Ex14_08_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = null;
		int[] arr2 = {};
		int[] arr3 = new int[0];
		System.out.println("arr.length= " + arr3.length);
		
		Optional<String> opt = Optional.empty();
		Optional<String> opt2 = Optional.of("abc");
		System.out.println("opt=" + opt);
		
		String str="";
		String str2 = opt2.orElseGet(String::new);
		System.out.println("opt= " + opt.orElse("빈칸"));
		System.out.println("str2= " + str2);
		
	}

}
