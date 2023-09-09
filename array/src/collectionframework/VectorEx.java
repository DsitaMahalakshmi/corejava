package collectionframework;

import java.util.Iterator;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<Integer>();
		v.add(100);
		v.add(120);
		v.add(140);
		v.add(120);
		System.out.println(v);
		Iterator<Integer> itr=v.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
