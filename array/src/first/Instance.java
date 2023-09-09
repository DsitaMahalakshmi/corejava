package first;
class Book
{
	private long id;
	private String name;
	private double price;
	static String libraryName="sita library";
	public Book(long id,String name,double price) {
		this.id=id;
		this.name=name;
		this.price=price;
	}
	void display()
	{
		System.out.println(this.id+" "+this.name+" "+this.price+" "+this.libraryName);
	}
}

public class Instance {

	public static void main(String[] args) {
		Book book1=new Book(123,"java",500);
		book1.display();
		Book book2=new Book(234,"c",800);
		Book book3=new Book(143,"python",390);
		book2.display();
		book3.display();
	}

}
