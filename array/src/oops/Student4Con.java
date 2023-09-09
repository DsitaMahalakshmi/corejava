package oops;
import java.io.*;
class Student4Con{
	int id;
	String name;
	void show()
	{
		System.out.println("default constructor");
	}
	Student4Con(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println("parameterised constructor");
		System.out.println(id+" "+name);
	}
	public static void main(String args[])
	{
		System.out.println("2 types of constructor");
		Student4Con s=new Student4Con(1, "sita");
		Student4Con s1=new Student4Con(2, "devi");
		s.show();
		s.display();
		s1.display();
		
	}
}
