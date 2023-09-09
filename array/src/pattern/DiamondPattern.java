package pattern;

import java.util.Scanner;

public class DiamondPattern {
	public static void printDiamondpattern(int n)
	{
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	   System.out.println("enter n value:");
        int n=sc.nextInt();
      
       printDiamondpattern(n);
	}

}
