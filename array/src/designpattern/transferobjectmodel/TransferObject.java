package designpattern.transferobjectmodel;

public class TransferObject {

	public static void main(String[] args) {
		StudentBio obj = new StudentBio();
		//print all students
		for (Student stud : obj.getAllStudent()) {
		System.out.println("Student: [RollNo : " + stud.getRollNo() + ", Name : " + stud.getName() + " ]");
		}
       
		Student s=obj.getAllStudent().get(1);
	     s.setName(" sita ");
	     
	     s=obj.getstudent(1);
	     System.out.println("Student:[RollNO:"+s.getRollNo()+",Name : "+s.getName()+"]");
		

	}

}
