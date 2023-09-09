package designpattern.transferobjectmodel;
import java.io.*;
import java.util.*;

public class StudentBio {
	List<Student>st;
	StudentBio(){
  List<Student>st=new ArrayList<Student>();
  Student stud1=new Student(1,"Rekha");
  Student stud2=new Student(2,"Uday");
  Student stud3=new Student(3,"Kiran");
  st.add(stud1);
  st.add(stud2);
  st.add(stud3);
  
	}
	
	public void deleteStudent(Student student)
	{
		 st.remove(student.getRollNo());
		 System.out.println("Student: Roll No " + student.getRollNo() + ", deleted from database");
	}
	
	public List<Student>getAllStudent(){
		return st;
	}
	public Student getstudent(int RollNo) {
		return st.get(RollNo);
	}
	
	public void updateStudent(Student stud) {
		st.get(stud.getRollNo()).setName(stud.getName());
		System.out.println(" Student Rollno"+stud.getRollNo()+",updated in the database");
	
	}

}
