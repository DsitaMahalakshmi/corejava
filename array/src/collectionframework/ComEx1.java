package collectionframework;
import java.util.*;
class Fruits{
	int price;
	String name;
	Fruits(int price,String name)
	{
		this.price=price;
		this.name=name;
	}

	@Override
	public String toString() {
		return "Fruits [price=" + price + ", name=" + name + "]";
	}
}	 
class SortByName1 implements Comparator<Fruits>
	{
		public int compare(Fruits f1,Fruits f2)
		{
			return f1.name.compareTo(f2.name);
		}
	}
	class SortByPrice implements Comparator<Fruits>
	{
		public int compare(Fruits f1,Fruits f2)
		{
			return f1.price-f2.price;
		}
	}

public class ComEx1 {

	public static void main(String[] args) {
	 List<Fruits> al=new ArrayList<Fruits>();
	 al.add(new Fruits(100,"apple"));
	 al.add(new Fruits(50,"guava"));
	 al.add(new Fruits(60,"banana"));
	 al.add(new Fruits(80,"mango"));
	 
	
	// Collections.sort(al,new SortByPrice());
	 System.out.println("Fruits are sorted by name:");
	 Collections.sort(al,new SortByName1());
	
	 for(Fruits f:al)
	 {
		 System.out.println(f);
	 }
	 System.out.println("****************************");
	 System.out.println("Fruits are sorted by price:");
	 Collections.sort(al, new SortByPrice());
	 for(Fruits f1:al)
	 {
		 System.out.println(f1);
	 }

	}
}

	


