package oops;

import java.io.*;
class Learner
{
	public String lname;
	 int lid;
	public String ldeg;
	Learner(){
		System.out.println("Default Constructor");
//		int lid;
//		String lname;
//		String ldeg;
//		
	}
	Learner(int lid,String lname,String ldeg)
	{
		this.lid=lid;
		this.lname=lname;
		this.ldeg=ldeg;
		System.out.println(lid +" "+lname+" "+ldeg);
		
		
	}
	Learner(Learner l2){
		lid=l2.lid;
		lname=l2.lname;
		ldeg=l2.ldeg;
		System.out.println("lid:"+lid);
		System.out.println("lname:"+lname);
		System.out.println("ldeg:"+ldeg);
	}
	public static void main(String args[])
	{
		Learner l=new Learner();
		
		System.out.println("*************");
		System.out.println("parameterised constructor");
		System.out.println("*************");
		System.out.println("copy  constructor");
		Learner l2=new Learner(10,"sita","MCA");
		Learner l3=new Learner(11,"Geetha","BTech");
		Learner l4=new Learner(12,"Devi","MSC");
		
		
	}
}

	


