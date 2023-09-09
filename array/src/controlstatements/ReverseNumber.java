package controlstatements;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.println("enter number");
     int n=sc.nextInt();
     int sum=0,r=0,temp;
     
    	temp=n;	 
     
     while(n!=0)
     {
    	 r=n%10;
    	 sum=(sum*10)+r;
    	 n=n/10;
    	     }
    System.out.println(" The reverse of the given number is:"+sum);
     if(temp==sum)
     {
    	 System.out.println("palendrome");
    	 
     }
     else
     {
    	 System.out.println(("not palendrome"));
     }
     
   
	}
 
}
