package practice;
class Book{
	int bid;
	String bname;
	//System.out.println("enter the value of bid and bname");
	
}

public class ObjectEx {

	public static void main(String[] args) {
		
    Book b=new Book();
    System.out.println("enter the values of bid and bname");
    b.bid=101;
    b.bname="Sql";
    System.out.println(b.bid);
    System.out.println(b.bname);
    Book b2=new Book();
    b2.bid=102;
    b2.bname="C programming Language";
    System.out.println("book2 id:"+b2.bid);
    System.out.println("book2 name:"+b2.bname);
    		
    
    
	}

}
