package collectionframework;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<String,String> ht=new HashMap();
		ht.put("1", "Mon");
		ht.put("2", "Tues");
		ht.put("3", "Wednes");
		ht.put("4", "Thurs");
		ht.put("5", "Fri");
		ht.put("6", "Sat");
		ht.put("7", "Sun");
		ht.put("8","Sun");//hash table accepts unique 
		//ht.putIfAbsent("9", null);//hash table does not take null values
		ht.clone();//means copy
        ht.putIfAbsent("2","Tues");
        
     // methods of hashmap
      
		System.out.println(ht);
		System.out.println("copy of a hash map:"+ht.clone());
		System.out.println("contains key:"+ht.containsKey("3"));
		System.out.println("contains a value:"+ht.containsValue("Sat"));
		System.out.println("if absent:"+ht.putIfAbsent("2", "Tues"));
		System.out.println(ht.put("10", "Days"));
		System.out.println(ht.entrySet());
		System.out.println(ht.keySet());
		//System.out.println(ht.merge("sita", "maha", "lakshmi"));
		

	}

}
