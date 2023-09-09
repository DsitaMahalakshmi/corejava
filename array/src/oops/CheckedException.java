package oops;

public class CheckedException {

	public static void main(String[] args) {
		try {
			Class.forName("oops.Learner1");
			System.out.println("class found");
		}
		catch(Exception e) {
			System.out.println("class not found:"+e);
		}
		finally {
     System.out.println("finally block");
	}
	}
}
