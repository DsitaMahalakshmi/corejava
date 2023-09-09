package collectionframework;

import java.util.ArrayList;

public class ArrayListEx2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add("Four");
		al.add("Five");
		System.out.println("ArrayList:"+al);
		System.out.println("numbers are:");
		for(String  s:al)
		{
			System.out.println(s);
		}
       System.out.println("size of an array:"+al.size());
	}

}
