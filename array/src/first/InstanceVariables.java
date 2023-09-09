package first;
class SubjectMarks{
	int sciencemarks;
	int mathsmarks;
	
}

public class InstanceVariables {

	public static void main(String[] args) {
		SubjectMarks subj1=new SubjectMarks();
		subj1.sciencemarks=80;
		subj1.mathsmarks=70;
		//student2
		SubjectMarks subj2=new SubjectMarks();
		subj2.sciencemarks=88;
		subj2.mathsmarks=79;
		
		System.out.println("Marks for student1:");
		System.out.println(subj1.sciencemarks);
		System.out.println(subj1.mathsmarks);
		System.out.println("Marks for student2:");
		System.out.println(subj2.sciencemarks);
		System.out.println(subj2.mathsmarks);

	}

}
