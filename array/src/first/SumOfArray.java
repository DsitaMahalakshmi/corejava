package first;
import java.util.Scanner;
import java.io.*;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]=new int[5];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Enter the element at"+i+"index position");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
			
		}
		System.out.println("original array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Reverse array");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]+" ");
		}
				

	}

}
