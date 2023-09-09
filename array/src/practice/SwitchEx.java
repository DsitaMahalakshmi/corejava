package practice;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		System.out.println("enter  a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        switch(n)
        {
        case 1:System.out.println("Today is Monday");
        break;
        case 2:System.out.println("Today is Tuesday");
        break;
        case 3:System.out.println("Today is wednesday");
        break;
        case 4:System.out.println("Today is THursday");
        break;
        case 5:System.out.println("Today is friday");
        break;
        case 6:System.out.println("Today is saturday");
        break;
        case 7:System.out.println("Today is sunday");
        break;
        default:System.out.println("invalid choice");
        }
	}

}
