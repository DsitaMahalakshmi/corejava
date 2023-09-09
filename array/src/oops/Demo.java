package oops;

public class Demo {
	int no;
	String name;
	public Demo()//default constructor
	{
		no=1;
		name="sita";
		
	}
	Demo(int no,String nm)//parameterised constructor
	{
		this.no=no;
		name=nm;
		
	}
	Demo(String nm)
	{
		name=nm;
	}
	Demo(Demo d)//copy constructor
	{
		no=d.no;
		name=d.name;
	}
	void display() {
		System.out.println("No:"+no+" "+"Name:"+name);
		
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		d.no=10;
		d.name="dfgh";
		d.display();
		System.out.println("*********");
		Demo d1=new Demo(15,"leka");
		d1.display();
		System.out.println("********");
        Demo d2=new Demo("Mani");
        d2.display();
        System.out.println("**********");
        Demo d3=new Demo(d1);
        d3.display();
	}

}
