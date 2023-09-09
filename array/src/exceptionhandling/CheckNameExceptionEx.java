package exceptionhandling;

import java.util.Scanner;

class MyException extends Exception{
	public MyException(String message) {
		super(message);
	}
}
public class CheckNameExceptionEx {
	public String checkName(String fname,String lname) throws MyException{
	if(fname.isEmpty()) {
		throw new MyException("fname is Empty");
	}
	else if(lname.isEmpty()) {
		throw new MyException("lname is empty");
	}
	else {
		return "welcome"+" "+fname+lname;
	}
	}

	public static void main(String[] args) {
		CheckNameExceptionEx x=new CheckNameExceptionEx();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first name");
		String fname=sc.nextLine();
		System.out.println("enter last name");
		String lname=sc.nextLine();
		
		String s;
		try {
			s=x.checkName(fname, lname);
			System.out.println(s);
		}
		catch(MyException e) {
		System.out.println(e);	
		}

	}

}
