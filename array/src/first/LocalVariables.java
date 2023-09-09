package first;

public class LocalVariables {
	public void StudentAge() {
		int age=0;
		age=age+30;
		System.out.println("Student age is:"+age);
	}


	public static void main(String[] args) {
		LocalVariables temp=new LocalVariables();
		temp.StudentAge();
	
	}
}
