package designpattern.transferobjectmodel;

public class Student {
    int RollNo;
    String name;
    Student(int RollNo,String name)
     {
	 this.RollNo=RollNo;
	 this.name=name;
     }
 
      public int getRollNo() {
	   return RollNo;
      }

      public void setRollNo(int rollNo) {
	    this.RollNo = rollNo;
     }

       public String getName() {
	   return name;
     }

      public void setName(String name) {
	   this.name = name;
      }

     @Override
      public String toString() {
	    return "Student [RollNo=" + RollNo + ", name=" + name + "]";
      }
 
}
