package java8;
interface MyInter1{
	void msg();
	default void display()
	{
		System.out.println("Default method of interface");
	}
	static void displayStatic()
	{
		System.out.println("static display method");
	}
}
interface MyInter2{
	void msg2();
}
public class DefaultStatic implements MyInter1,MyInter2 {

	public static void main(String[] args) {
		DefaultStatic d=new DefaultStatic();
		d.msg();
		d.msg2();
		d.display();
		MyInter1.displayStatic();

	}

	@Override
	public void msg2() {
		System.out.println("MyInter2 method");
		
	}

	@Override
	public void msg() {
		System.out.println("MyInter1 method");
		
	}

}
