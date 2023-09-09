package oops;
class Father{
	String name="srinu";
	void display()
	{
		System.out.println("parent class");
		System.out.println("father name:"+name);
	}
}
class Mother extends Father{
	String name="Ganga";
	void display()
	{
		super.display();
		System.out.println("child class");
		System.out.println("mother name:"+name);
	}
}
class Son extends Mother{
	String name="Mani";
	void display3() {
		
		System.out.println("son name is:"+name);
	}
}
public class SuperEx1{
	public static void main(String args[]) {
		Son s=new Son();
		s.display();
		
		System.out.println();
		System.out.println("multilevel inheritance");
		s.display3();
	}
}


	


