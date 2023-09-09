package practice;

import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		System.out.println("select a option");
		int a;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("Go to beach");
			break;
		case 2:
			System.out.println("Go to movie");
			break;
		case 3:
			System.out.println("Go to mall"); 
			break;
			default:System.out.println("Go to bed");
		}
		
		

	}

}
