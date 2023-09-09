package sitha;

public class ThrowEx {
//throw keyword is used to throw an exception
//we can throw either checked or unchecked exception
//syntax---->throw newexception_class("error message");s	
	
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("person is not eliglible to vote");
		}
		else
		{
			System.out.println("eligible to vote");
		}
	}

public static void main(String args[])
{
ThrowEx t=new ThrowEx();
try {
	t.validate(10);	
}
catch(ArithmeticException e)
{
	System.out.println("Invalid age");
	System.out.println("error message");
}
 
 
}
}
