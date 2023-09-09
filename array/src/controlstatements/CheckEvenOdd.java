package controlstatements;
import java.util.Scanner;


public class CheckEvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n + "even");
			
		}
		else
		{
			System.out.println(n +"odd");
		}
	}

}
