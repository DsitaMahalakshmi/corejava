package first;
import java.util.Scanner;
class Student{
	public static double fees;
	public static String name="sita";
}

public class StaticVariables {

	public static void main(String[] args) {
		 Student.fees=9999.99;
				 System.out.println(Student.name+"'s annual fees:"+Student.fees);
	}

}
