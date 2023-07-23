package ch09;

public class Ex09_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println("i1 == i2 ? " + (i1==i2));  // false
		System.out.println("il.equals(i2) ? " + i1.equals(i2));  // true
		System.out.println("i1.compareTo(i2) ? " + i1.compareTo(i2));  // 0
		System.out.println("i1.toString() ? " + i1.toString()); // 100

		System.out.println("MAX_VALUE= "+Integer.MAX_VALUE);
		// Integer의 최대값인 2147483647
		System.out.println("MIN_VALUE= "+Integer.MIN_VALUE);
		// Integer의 최소값인 -2147483648
		System.out.println("SIZE= "+Integer.SIZE+" bits");
		// Integer은 32bits
		System.out.println("BYTES= "+Integer.BYTES+" bytes");
		// Integer은 4bytes
		System.out.println("TYPE= "+Integer.TYPE);
		// Integer은 int타입
	}
}
