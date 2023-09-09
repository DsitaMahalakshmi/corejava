package oops;
interface Parent11{
	void displayParen11();
}
interface Parent2{
	void displayParent2();
	
}
interface Child3 extends Parent11,Parent2{
	void displayChild();
}
class Child1 implements Child3{

	@Override
	public void displayParen11() {
		System.out.println("parent1 class");
		
	}

	@Override
	public void displayParent2() {
		System.out.println(("parent2 class"));
		
	}

	@Override
	public void displayChild() {
		System.out.println("child class");
		
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
		Child1 c=new Child1();
		c.displayParen11();
		c.displayParent2();
		c.displayChild();
	}

}
