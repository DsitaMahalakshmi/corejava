package practice;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		System.out.println("enter array elements:");
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<arr.length;i++)
        {
        	System.out.print("The elements are:");
        	arr[i]=sc.nextInt();
        }
        System.out.println("elements are:");
        for(int i=0;i<arr.length;i++) {
        	
        	System.out.println(arr[i]+" ");
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
    	System.out.println("max element:"+max);
    	System.out.println("min element:"+min);
    	
       
      
        	
	}
}


