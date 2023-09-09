package first;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) throws NumberFormatException,IOException{
	int arr[]=new int[5];
	//BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("enter the element at"+i+"index position");
		//arr[i]=Integer.parseInt(bufferedReader.readLine());
		arr[i]=sc.nextInt();
	}
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>max)
		{
			max=arr[i];
		}
		if(arr[i]<min)
		{
			min=arr[i];
			
		}
		
	}
	System.out.println(max);
	System.out.println(min);
	
  }

}
