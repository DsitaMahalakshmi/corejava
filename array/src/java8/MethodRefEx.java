package java8;

@FunctionalInterface
interface Display{
	void display();
}

public class MethodRefEx {
	public void myMethod()
	{
		System.out.println("Method Reference in java 8");
	}
	

	public static void main(String[] args) {
	MethodRefEx obj=new MethodRefEx();
	obj.myMethod();
	System.out.println("********");
	Display ref=obj::myMethod;//Method Reference 
	ref.display();
	

	}

}
