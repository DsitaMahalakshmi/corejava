package java8;

import java.util.Scanner;

interface factorial{
	int fact(int f);
}

public class FactorialEx {

	public static void main(String[] args) {
		//int n=5;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		
		factorial fa=(int f)->
		{
			for(int i=1;i<n;i++)
			{
				f=f*i;
			}
			return f;
		};
		System.out.println("factorial of a number:"+fa.fact(n));
	}

}
