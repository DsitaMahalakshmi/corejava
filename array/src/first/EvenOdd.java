package first;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String result=(num%2==0)?"even":"odd";
		System.out.println(num+"is"+result+" .");
		
	}

}
