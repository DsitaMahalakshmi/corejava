package sitha;

public class MultipleCatchEx {

	public static void main(String[] args) {
	int a[]= {5,10};
	int b=5;
	try
	{
		int x=a[1]/(b-a[0]);
		
	}
	catch(ArithmeticException e)
	{
    System.out.println("Division error");
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Bad Index error");
	}
	catch(ArrayStoreException e)
	{
		System.out.println("wrong data");
	}
	finally
	{
		System.out.println("finally block is always executed");
	}
}

}
