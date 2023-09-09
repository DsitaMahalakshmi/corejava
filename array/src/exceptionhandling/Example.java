package exceptionhandling;

public class Example {

	public static void main(String[] args) {
		
		try {
			int a=10,b=0;
			int c=a/b;
			System.out.println("The value of c:"+c);
		}
        catch(Exception e)
		{
        	System.out.println("number can't divide by zero");
		}
	}

}
