package oops;
class Parent
{
	public void display()
	{
		int no=100;
		String name="sita";
		System.out.println("parent class");
		System.out.println(no +" "+name+" ");
	}
}
class Child extends Parent{
	public void display(int no,String name) {
		
		
		super.display();
		
		
		
		System.out.println("child class");
	}
}
class Grandchild extends Child{
	public void dis()
	{
		System.out.println("Grandchild class");
	}
}
class Son1 extends Grandchild{
	public void dis1()
	{
		System.out.println("son class");
	}
}
public class HierarchicalInheritanceEx {

	public static void main(String[] args) {
		System.out.println("Hierarchical inheritance");
    Son1 g=new Son1();
		g.display();
		//System.out.println(g.display();
		g.dis();
		g.dis1();
		
		

	}

}
