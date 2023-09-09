package first;
import java.util.Scanner;
import java.io.*;

public class Array {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		int sum1=0;
		int sum2=0;
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter array elements");
			arr[i]=sc.nextInt();
			
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}else if(max>arr[i])
				{
					System.out.println("2nd largest element");
				}
				else if(arr[i]<min)
				{
					min=arr[i];
				}
				else if(min<arr[i])
				{
					System.out.println("2nd smallest number");
				}
			System.out.println(max);
			System.out.println(min);
			}
			
		}
		
	    
	}
  
 
