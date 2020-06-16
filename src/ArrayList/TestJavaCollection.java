package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class TestJavaCollection {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		list.add("umesh");
		list.add("karkar");
		list.add("Raj");
		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.print(" "+itr.next());
			
		}

	}

}
