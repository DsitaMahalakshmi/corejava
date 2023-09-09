package sitha;

class GrandParent{
	void display()
	{
		System.out.println("This is Grandparent class");
	}
}
class  Parent extends GrandParent{
	
	void display()
	{
		super.display();
		System.out.println("This is Parentclass");
	}
}
class Child extends Parent{
	void data()
	{
		System.out.println("This is child class");
	}
}

public class InheritEx {
	public static void main(String[] args) {
		Child c=new Child();
		c.data();
		//c.show();
		c.display();
		

	}

}
