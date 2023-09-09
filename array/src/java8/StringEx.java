package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringEx {
	public static void main(String[] args) {
	ArrayList<String> al = new ArrayList<String >();
	al.add("Abhi");
	al.add("Radha");
	al.add("Anu");
	al.add("Aniket");
	al.add("Ashish");
	al.add("Krishna");

	// to use multiple function using stream api
	long count = al.stream().filter(a -> a.length() > 4 && a.length() < 7).count();
	System.out.println("Names length less than 5:...." + count);

	List<String> strList = Arrays.asList("abc", "", "bcd", "", "defg", "jk");
	long count1 = strList.stream().filter(x -> x.isEmpty()).count();
	System.out.println("Count space....." + count1);
}
}
