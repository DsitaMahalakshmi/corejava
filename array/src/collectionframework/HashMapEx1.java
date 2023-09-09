package collectionframework;
import java.util.*;

public class HashMapEx1 {

	public static void main(String[] args) {
		HashMap<Integer,String> prices=new HashMap<>();
		prices.put(10 , "Pen");
		prices.put(20 , "Book");
		prices.put(15 , "Pencil");
		prices.put(5 ,"Eraser");
		System.out.println("HashMap:"+prices);
        
		//int returnedValue=prices.merge("30" , "Book",(oldValue,newValue)-> oldValue+newValue);
		
		
	}

}
