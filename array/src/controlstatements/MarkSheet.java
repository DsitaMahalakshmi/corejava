package controlstatements;
import java.util.Scanner;

public class MarkSheet {
	//String calculateGrade(int marks) {
	void  CalMarks(int marks) {
		
	
		//Scanner sc=new Scanner(System.in);
		System.out.println("enter marks:");
		//marks=sc.nextInt();
		if(marks>=90 && marks<=100)
		{
			System.out.println("Grade is A+:"+marks);
			
		}
		else if(marks>=76 && marks<=89)
		{
			System.out.println("Grade is A:"+marks);
			
		}
		else if(marks>=66&& marks<=75)
		{
			System.out.println("Grade is B+:"+marks);
		}
		else if(marks>=50 && marks<=65)
			{
				System.out.println("Grade is B:"+marks);
			}
		else 
		{
			System.out.println("fail:"+marks);
		}
	}
	
	
	public static void main(String[] args) {
		 MarkSheet m=new MarkSheet();
		//C(m.CalMarks(78));
		m.CalMarks(78);
		
		
		
		
	}

}
