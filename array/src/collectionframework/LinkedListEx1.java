package collectionframework;

import java.util.LinkedList;
import java.util.*;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ajay");
        ll.add("Ravi");
        ll.add("Raju");
        ll.add("Ajay");
        System.out.println(ll);


//        Iterator<String> itr=ll.iterator();  
//        while(itr.hasNext()){  
//        System.out.println(itr.next());  
        for(String s:ll)
        {
        	System.out.println(s);
        } 
	}

}
