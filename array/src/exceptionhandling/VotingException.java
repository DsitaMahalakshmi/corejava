package exceptionhandling;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String s) {
		super(s);
	}
}

public class VotingException {
	void validAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException("Invalid age");
		}
		else
		{
			System.out.println("valid age");
		}
	}

	public static void main(String[] args) {
		VotingException v=new VotingException();
		try {
			v.validAge(10);
		}catch(InvalidAgeException e) {
			System.out.println("exception occur");
			System.out.println(e.getMessage());
		}

	}

}
