package collectionframework;
import java.util.*;

public class TreeSetEx {
//Tree set is arrange the data in ascending order.
	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<>();
		hs.add("Sita");
		hs.add("Devi");
		hs.add("Priyanka");
		hs.add("Lekha");
		hs.add("Sita");
		hs.add("Bhavani");
		hs.add("Uday");
		System.out.println("Tree set:"+hs);
		System.out.println("********Using Each for loop********");
		for(String h:hs)
		{
			System.out.println(h);
		}
		System.out.println("********Using Iterator*********");
		Iterator<String> i=hs.iterator();
		while(i.hasNext())
			System.out.println(i.next());
		
	}

}
