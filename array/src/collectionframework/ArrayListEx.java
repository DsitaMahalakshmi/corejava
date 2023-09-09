package collectionframework;
import java.util.ArrayList;
import java.util.Collections;



public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String>  a1=new ArrayList<>();
		a1.add("Sita");//allow duplicate values
		a1.add("Devi");
		a1.add(2, "priyanka");
		System.out.println("Array list:"+a1);
		a1.add(3, "lekha");
		System.out.println("Array list:"+a1);
		a1.remove(3);
		System.out.println("Array list:"+a1);
		a1.get(1);
		System.out.println("Array list:"+a1);
		a1.set(2, "Bhavani");
		System.out.println("Array list:"+a1);
		//System.out.println("size of Array list:"+a1.size());
		a1.add("Ashok");
		System.out.println("Array list:"+a1);
		a1.add("Mani");
		System.out.println(" Array list:"+a1);
		//a1.add(null);
		System.out.println(" Array list:"+a1);
		System.out.println("size of Array list:"+a1.size());
		System.out.println("**************");
		ArrayList<String> a2=new ArrayList<>();
		a2.addAll(a1);
		System.out.println(" Array list:"+ a2);
		
		
		ArrayList<Integer> n=new ArrayList<>();
		n.add(10);
		System.out.println("integer ArrayList:"+n);
		n.add(25);
		System.out.println("integer Array list:"+n);
		n.add(33);
		System.out.println("integer Array list:"+n);
		Collections.sort(a1);
		System.out.println("sorting data:"+a1);
		System.out.println("My data:"+a1);
		for(String str:a1) {
			System.out.println(str);
		}
		System.out.println(a1.contains("priyanka"));
		
		
		
		
		
		
 
	}

}
