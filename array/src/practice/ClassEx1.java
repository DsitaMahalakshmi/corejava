package practice;
import java.io.*;

public class ClassEx1 {
	int empid;
	String ename;
	double esal;
	//System.out.println("enter employee details");
	
	


	public static void main(String[] args) {
		ClassEx1 c=new ClassEx1();
		c.empid=100;
		c.ename="Sita";
		c.esal=50000.02;
		System.out.println("empid:  "+c.empid);
		System.out.println("ename:"+c.ename);
		System.out.println("employee salary:"+c.esal);
		
		

		
	}

}
