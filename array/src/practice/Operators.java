package practice;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		System.out.println("enter any two numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		c=a+b;
		
		System.out.println("enter p,q and r values");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int r=sc.nextInt();
		System.out.println("Arithematic operators");
		System.out.println("a+b:"+c);
		int d=a-b;
		System.out.println("a-b:"+d);
		int e=a*b;
		System.out.println("a*b:"+e);
		int f=a/b;
		System.out.println("a/b:"+f);
		System.out.println("**************");
		System.out.println();
		System.out.println("Relational operators");
		if(p>=q&&p>=r) {
			System.out.println("a is big:"+p);
		}
		else if(q>=p && q>=r){
			System.out.println("b is big:"+q);
		}
		else {
			System.out.println("c is big:"+r);
		}
	}

}
