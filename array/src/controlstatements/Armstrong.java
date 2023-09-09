package controlstatements;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int num,temp,rem;
		double sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		num=sc.nextInt();
		temp=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+Math.pow(rem,3);
			num=num/10;
	}
		
		if(temp==sum)
		{
			System.out.println(" Armstrong number");
			
		}
		else
		{
			System.out.println( "not armstrong number");
		}
		

	}

}
