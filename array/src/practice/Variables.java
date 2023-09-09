package practice;
 
class Library
{
	int bid;
    String bname;//instance variables
    static int bcount;//static variables
}
public class Variables {
public static void main(String[] args) {
	System.out.println("local variables");
	int bid=100;
	String bname="java";
	//local variables
	System.out.println(bid+" "+bname+" ");
	Library l=new Library();
	System.out.println("instace variables");
	l.bid=101;
	l.bname="pyhton";
	System.out.println(l.bid+" "+l.bname+" ");
	
	
	System.out.println("static variables");
	l.bcount=100;
	System.out.println("The list of thhe books in the library are:"+l.bcount);
	
	}

}
