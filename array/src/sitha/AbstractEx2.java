package sitha;

abstract class A
{
	abstract void sum(int a, int b);
	abstract void sub(int a, int b);
}
class B extends A
{
	 void  sum(int a, int b)
	{
		System.out.println("sum:"+(a+b));
		
	}
	void sub(int a, int b)
	{
		System.out.println("sub:"+(a-b));
		
	}
}

public class AbstractEx2 {

	public static void main(String[] args) {
	B b=new B();
	b.sum(10, 20);
	b.sub(20, 10);

	}

}
