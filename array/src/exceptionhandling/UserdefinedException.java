package exceptionhandling;

public class UserdefinedException {
	static  void  validAge(int age) {
//using static keyword infront of a method there is no need to create a object for the class
		if(age<18) {
		 throw	new ArithmeticException("invalid age");
		}
		else {
			System.out.println("valid age");
		}
	}

	public static void main(String[] args) {
		validAge(10);

	}

}
