package oops;
class Book{
	static String name="Java";
	void disname() 
	{
		
		System.out.println("out of stock");
	}
}
class Author extends Book
{
	String name="Tagore";
	void disname() {
		super.disname();
		
		System.out.println("name:"+super.name);
		System.out.println(name);
//using super keyword, we can call both the same methods contain in parent&child class 		
		System.out.println("This book is written by Tagore");
	}
}

public class MethodOverridingEx {

	public static void main(String[] args) {
		Author a=new Author();
		a.disname();

	}

}
