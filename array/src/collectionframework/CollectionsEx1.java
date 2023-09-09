package collectionframework;
import java.util.*;

public class CollectionsEx1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Sita");
		al.add("Lekha");
		al.add("Uday");
		al.add("Sita");
		System.out.println(al);
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
