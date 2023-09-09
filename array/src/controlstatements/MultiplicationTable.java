package controlstatements;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(no + " * "+ i+ " = "+(no*i));
		}
	}

}
