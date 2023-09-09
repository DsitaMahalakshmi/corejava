package accenture;
import java.io.*;
import java.util.*;
public class Main {
public static int solve(int r, int unit, int arr[],int n)
{
	if(arr==null)
		return -1;
	
		int res=r*unit;
		int sum=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			count++;
			if(sum>=res)
				break;
		}
		if(sum<res)
		return 0;
     return count;
	}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int r=s.nextInt();
	int unit=s.nextInt();
	int n=s.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
		arr[i]=s.nextInt();
	System.out.println(solve(r, unit, arr, n));
}
}

