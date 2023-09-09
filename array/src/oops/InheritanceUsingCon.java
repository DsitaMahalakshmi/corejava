package oops;
import java.io.*;

class Student{
	int rno;
	String name;
	void disName() {
		System.out.println("parent class");
	}
}
class Department extends Student{
	 Department(int rno,String name)
	{
		 System.out.println("child class");
		System.out.println("rno:"+rno);
		System.out.println("name:"+name);
	}
}

	

	


public class InheritanceUsingCon {

	public static void main(String[] args) {
		Department d=new Department(101, "sita");
        d.disName();
	}

}
