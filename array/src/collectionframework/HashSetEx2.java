package collectionframework;
import java.util.*;

public class HashSetEx2 {
//Duplicates are not allowed in Hashset
	public static void main(String[] args) {
		HashSet<Integer> h1=new HashSet<>();
		h1.add(10);
		h1.add(20);
		h1.add(30);
		System.out.println("Hashset1:"+h1);
		HashSet<Integer> h2=new HashSet<>();
		h2.add(40);
		h2.add(50);
		h2.add(60);
		System.out.println("Hashset2:"+h2);
		//methods

		h2.addAll(h1);
		System.out.println("Union is:"+h2);//Adding two sets into one set
		h2.retainAll(h1);
		System.out.println("Intersection is:"+h2);//compare two sets and take common numbers
		h2.removeAll(h1);
		System.out.println("Difference is:"+h2);
	}

}
