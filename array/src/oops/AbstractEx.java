package oops;
abstract class AbstractEx1{
	abstract void display();
	void msg() {
		System.out.println("Hello");
	}
}
class AbstractChild extends AbstractEx1{

	@Override
	void display() {
		System.out.println("abstract child");
	}
	
	
}
class AbstractChild1 extends AbstractChild{
	void display() {
		System.out.println("abstract child1");
	}
}

public class AbstractEx {

	public static void main(String[] args) {
		AbstractChild1 ac=new AbstractChild1();
		ac.display();
		ac.msg();
		AbstractChild ac2=new AbstractChild();
		ac2.display();
		ac2.msg();
        AbstractEx1 aref;//we can call abstract methods by creating a refernce to the class
        aref=ac2;
        aref.display();
        aref.msg();
        
        
	}

}
