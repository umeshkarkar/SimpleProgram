package Hashmap;

import java.util.Map;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) {

		 ArrayList<String> list = new ArrayList<String>(); 

     // Adding object in ArrayList 
     list.add("A"); 
     list.add("B"); 
     list.add("C"); 
     list.add("D"); 

     // Invoking ArrayList object 
     //System.out.println("ArrayList: " + list); 
     
     Iterator<String> itr = list.iterator();
     while(itr.hasNext()){
    	 System.out.println(itr.next());
     }

     // Creating HashMap 
       HashMap<Integer, String> hm = new HashMap<Integer, String>(); 

     // Adding object in HashMap 
     hm.put(1, "A"); 
     hm.put(2, "B"); 
     hm.put(3, "C"); 
     hm.put(4, "D"); 

     // Invoking HashMap object 
     // It might or might not display elements 
     // in the insertion order 
    // System.out.print("HasMap: " + hm); 
		
     Iterator<Integer> it = hm.keySet().iterator();
     
     while(it.hasNext()){
    	 
    	 int key = (int)it.next();
    	
    	 System.out.println("Roll no:"+key+ " Name: "+hm.get(key));
    	// System.out.println(it.next());
     }

	}

}
