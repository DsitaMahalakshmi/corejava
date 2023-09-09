package controlstatements;
import java.util.Scanner;

public class MarksGrade {

	public static void main(String[] args) {
		System.out.println("enter marks:");
		Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		
		if(marks>90)
		{
			System.out.println("Grade is A:"+marks);
		}else if(marks>80)
		{
			System.out.println("Grade is B:"+marks);
		}else if(marks>70)
		{
			System.out.println("Grade is c:"+marks);
		}else if(marks>60)
		{
			System.out.println("Grade is D:"+marks);	
		}
		else
		{
			System.out.println("fail");
		}

	}

}
