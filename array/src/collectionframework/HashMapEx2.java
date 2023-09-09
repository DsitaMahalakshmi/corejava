package collectionframework;

import java.util.HashMap;

public class HashMapEx2 {

	public static void main(String[] args) {

     HashMap<Integer,String> sname=new HashMap<>();
     sname.put(10,"sita");
     sname.put(20, "leka");
     sname.put(30, "uday");
     System.out.println("Hashmap:"+sname);
    
	HashMap<Integer,String> clonesname=(HashMap<Integer, String>) (HashMap<Integer,String> sname.clone());
     System.out.println("cloned HashMap:"+clonesname);
     
     
     

	}

}
