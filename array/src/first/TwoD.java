package first;
import java.util.Scanner;
import java.io.*;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;


public class TwoD {

	public static void main(String[] args)throws NumberFormatException,IoException {
		int arr[][]=new int[3][3];
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		//int sum=0;
		//Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++) 
		{
			for(int j=0;i<3;j++)
			{
				System.out.println("Enter the value at["+i+"]["+j+"]position:");
				arr[i][j]=Integer.parseInt(bufferedReader.readLine());
			}
		}
			for(int  i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.println(arr[i][j]+" ");
					
				}
				System.out.println();
			}
		}
	}

}
