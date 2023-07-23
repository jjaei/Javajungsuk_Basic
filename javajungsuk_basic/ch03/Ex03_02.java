package ch03;

public class Ex03_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=5, j=0;

		j = i++;
		System.out.println("j=i++; 실행 후, i=" + i +", j="+ j);
		// j에 대입된 후에 i가 증가한다. 

		i=5; 
		j=0;

		j = ++i;
		System.out.println("j=++i; 실행 후, i=" + i +", j="+ j);
		// i가 증가된 후에 j에 대입된다.
	}

}
