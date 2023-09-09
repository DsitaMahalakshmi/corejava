package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class EmployeeListEx {
     int eid;
      String ename;
     String companyName;
     int esal;
     int eusal;
    EmployeeListEx(int eid,String ename,String companyName,int esal,int eusal)
    {
    	this.eid=eid;
    	this.ename=ename;
    	this.companyName=companyName;
    	this.esal=esal;
    	this.eusal=eusal;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<EmployeeListEx> emp=new ArrayList<EmployeeListEx>();
		int choice;
		do 
		{
			System.out.println("Enter your choice: 1 or 2 or 3 or 4 or 5 or 6");
			choice=sc.nextInt();
		  switch(choice)
			{
			case 1:
				System.out.println("Enter employee details:");
				System.out.println("Enter employee id:");
				int eid=sc.nextInt();
				System.out.print("Enter employee name:");
				String ename=sc.next();
				System.out.print("Enter  employee company name:");
				String companyName=sc.next();
				System.out.print("Enter employee salary:");
				int esal=sc.nextInt();
				
				break;
			case 2:
				System.out.println("Employee details:");
				for(EmployeeListEx el:emp)
				{
					System.out.println("Employee id:"+ el.eid);
					System.out.println("Employee name:"+ el.ename);
					System.out.println("Employee company name:"+ el.companyName);
					System.out.println("Employee salary:"+ el.esal);
					System.out.println(" ************************   ");
				}
				break;
			case 3:
				System.out.println("Enter index to delete Employee details:");
				int n=sc.nextInt();
				emp.remove(n);
				break;
			case 4:
				System.out.println("Updated Employee");
				System.out.println("Employee updated salary:");
				int eusal=sc.nextInt();
				System.out.println("Employee updated salary:"+eusal);
				break;
			case 5:break;
			default:
				System.out.println("Invalid choice");
			}
			}while(choice!=5);
			sc.close();
		}

	}


