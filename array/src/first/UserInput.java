package first;
import java.io.*;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) throws NumberFormatException,IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter ur name:");
		String name=sc.nextLine();
		System.out.println("name:"+name);
		System.out.println("enter roll number");
		int rollno=sc.nextInt();
		System.out.println("rollno:"+rollno);
		System.out.println("enter ur percentage:");
		float percentage=sc.nextFloat();
		System.out.println("percentage:"+percentage);
		
		
		System.out.println("*****Buffered Reader****");
		
		//buffer class
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("enter ur name:");
		
		String fname=br.readLine();
		
		System.out.println("fullname:"+fname);
		
		System.out.println("enter roll number");
		
		int rollno1=Integer.parseInt(br.readLine());
		System.out.println(" roll number1:"+rollno1);
		System.out.println("enter percentage");
		float percent=Float .parseFloat(br.readLine());
		
		
		
		
		
	}

}
