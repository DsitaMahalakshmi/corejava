package sitha;
class Example
{
	public int sum(int a, int b)
	{
		System.out.println("a+b:"+(a+b));
		return a+b;
	}
	public int sub(int a, int b)
	{
		System.out.println("a-b:"+(a-b));
		return a-b;
	}
	public double mul(double a, double b)
	{
		System.out.println("a*b:"+(a*b));
		return a*b;
	}
	public double div(double a, double b)
	{
		System.out.println("a/b:"+(a/b));
		return a/b;
	}
}

public class OverloadingEx {
	public static void main(String[] args) {
		Example e=new Example();
		e.sum(25,33);
		e.sub(33, 20);
		e.mul(25, 33);
		e.div(81, 9);

	}

}
