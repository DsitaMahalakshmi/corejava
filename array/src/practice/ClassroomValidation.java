package practice;
class Student{
	String name;
	int score;
	

 public Student(String name,int score)
 {
	 this.name=name;
	 this.score=score;
 }
}
class Classroom{
	public String registerStudent(Student s)
	{
	//	if(!s.name.matches("[A-Z]+")) {
		if(!s.name.equals(s.name.toUpperCase())) {
			return "Block letters needed";
		}
		if(s.score<0 || s.score>100) {
			return "Invalid score";
			
		}
		return "Register";
	}
	  public String studentCard(String card) {
		  if(!card.matches("\\d+")) {
			  return "Invalid card";
			  
		  }
		  else {
			  return "valid card";
		  }
	  }
}
	 
 


public class ClassroomValidation {

	public static void main(String[] args) {
		Student st=new Student("SIta",-56);
		Classroom c=new Classroom();
		String str=c.registerStudent(st);
		System.out.println(str);
		String str1=c.studentCard("33");
		System.out.println(str1);

	}

}
