package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayListEx {
	int id;
	String name;
	String grade;
	StudentArrayListEx(int id,String name,String grade) 
	{
		this.id=id;
		this.name=name;
		this.grade=grade;
	}	


	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<StudentArrayListEx> sl=new ArrayList<StudentArrayListEx>();
		int choice;
		do {
			System.out.println("Enter your choice:---1 or 2 or 3 or 4");
			choice=sc.nextInt();
			switch(choice) {
			case 1://1.enter student details
				System.out.println("Enter student details:");
				System.out.print("Enter student Roll no:");
				int id=sc.nextInt();
				System.out.print("Enter student name:");
				String name=sc.next();
				System.out.print("Enter student Grade:");
				String grade=sc.next();
				sl.add(new StudentArrayListEx(id,name,grade));
				break;
			case 2://display student details
				System.out.println("student details are:");
				for(StudentArrayListEx st:sl) {
					System.out.println("student Roll no:" +st.id);
					System.out.println("student name: "+st.name);
					System.out.println("student grade: "+st.grade);
					System.out.println("**************************");
				}
					break;
					
			case 3://delete student details
				System.out.println("Enter index to delete student details:");
				int n=sc.nextInt();
				sl.remove(n);
				break;
			case 4:break;//exit
			default:System.out.println("Invalid choice");
				}
			}while(choice!=4);
			sc.close();
		}
	}		
	
		
				
					
				
			
		

	


