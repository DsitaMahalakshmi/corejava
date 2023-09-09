package practice;

import java.util.Scanner;

public class SecondLargestElement {

	public static void main(String[] args) {
		System.out.println("enter array elements");
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		int temp;
		for(int i=0;i<arr.length;i++) {
			System.out.print("elements are: ");
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
