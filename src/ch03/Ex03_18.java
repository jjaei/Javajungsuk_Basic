package ch03;

public class Ex03_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiNumber numbers = new BiNumber(2, 3);
		System.out.println(numbers.add());
		System.out.println(numbers.multiply());
		numbers.doubleValue();
		System.out.println(numbers.getNumber1());
		System.out.println(numbers.getNumber2());
		
	}
}

class BiNumber{
	private int number1=0;
	private int number2=0;
	BiNumber(int number1, int number2){
		this.number1=number1;
		this.number2=number2;
	}
	
	BiNumber(){}
	
	public int add(){
		return number1 + number2;
	}
	
	public int multiply() {
		return number1 * number2;
	}
	
	public void doubleValue() {
		this.number1 *= 2;
		this.number2 *= 2;
	}
	
	public void setNumber1(int number1) {
		this.number1 = number1;
	}
	
	public int getNumber1() {
		return number1;
	}
	
	public void setNumber2(int number2) {
		this.number2 = number2;
	}
	
	public int getNumber2() {
		return number2;

	}

}
