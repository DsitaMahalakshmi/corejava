package sitha;

public class ExceptionEx {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=5;
		int x,y;
		try
		{
			x=a/(b-c);
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("number can't be divided by zero");
		}
		finally {
		System.out.println("finally is awalys executed ");
		y=a/(b+c);
		System.out.println("y="+y);
		}
	}

}
