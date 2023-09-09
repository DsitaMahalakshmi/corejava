package accessmodifiers;

public class ExamplePrivate {
 private String fname;
public void MethodEx()
 {
	 String fname="Sita";
	 System.out.println(fname); 
	 
 }
 public static void main(String args[])
 {
	 ExamplePrivate e=new ExamplePrivate();
	 System.out.println("fname:"); 
	 e.fname="mahalakshmi";
	 
 }
}
  