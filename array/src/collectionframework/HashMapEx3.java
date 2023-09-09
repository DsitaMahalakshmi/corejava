package collectionframework;

import java.util.HashMap;

public class HashMapEx3 {
	 static HashMap<Character,Integer> countChar(char arr[])
	    {
	    	HashMap<Character,Integer> hs=new HashMap<>();
	    	for(char c:arr)
	    	{
	    		if(hs.containsKey(c))
	    		{
	    			hs.put(c, hs.get(c)+1);
	    		}
	    		else
	    			hs.put(c, 1);
	    		
	    	}
	    	return hs;
	    }
	 
	    public static void main(String[] args) {
		char arr[]= {'m','a','m','a','t','h','a','t','h','s','i'};
		HashMap<Character,Integer> hs=countChar(arr);
		System.out.println(hs);
		
	}
   
    
}
