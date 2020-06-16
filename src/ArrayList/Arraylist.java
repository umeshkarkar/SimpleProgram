package ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

import org.omg.Messaging.SyncScopeHelper;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> s1=new ArrayList<String>();

		s1.add("ABC");

		s1.add("EFG");

		s1.add("HIJ");

		System.out.println(s1);

		s1.remove("EFG");

		System.out.println(s1);

		s1.add("LMN");

		s1.add(2, "PQR");

		System.out.println(s1);

		String s2=s1.get(1);

		System.out.println(s2);
		s1.set(3,"TUV");

		System.out.println(s1);
		
	/*	ListIterator<String> str = s1.listIterator(); {
		
			while (str.hasNext()) {
				String value = str.next();
				System.out.println("Values are "+value);
				
			}
		}*/
		
		s1.forEach(i-> System.out.print(i));//lamba expression

	}



}
