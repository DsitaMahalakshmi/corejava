package collectionframework;

import java.util.Hashtable;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable();
		ht.put("1", "Mon");
		ht.put("2", "Tues");
		ht.put("3", "Wednes");
		ht.put("4", "Thurs");
		ht.put("5", "Fri");
		ht.put("6", "Sat");
		ht.put("7", "Sun");
		ht.put("8","Sun");//hash table accepts unique 
		//ht.putIfAbsent("9", null);//hash table does not take null values
		System.out.println(ht);
		
		
	}

}
