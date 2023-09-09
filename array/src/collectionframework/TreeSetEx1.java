package collectionframework;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<>();
        ts.add("S");
        ts.add("I");
        ts.add("T");
        ts.add("H");
        ts.add("A");
        System.out.println("TreeSet :"+ts);
        System.out.println("TreeSet elements using for each loop:");
        for(String s:ts)
        {
        	System.out.println(s);
        }
	}

}
