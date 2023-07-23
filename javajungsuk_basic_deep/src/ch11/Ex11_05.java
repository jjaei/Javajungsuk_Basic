package ch11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Ex11_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Collection list = new ArrayList(); // Collection의 자손
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		// iterator는 일회용이므로 또 사용하려면 iterator를 다시 얻어와야 한다.
		// iterator는 list와 set에서 둘 다 사용할 수 있다.
		// Map에는 iterator()가 없다.
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
