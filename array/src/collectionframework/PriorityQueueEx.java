package collectionframework;
import java.util.*;


class Student implements Comparable<Student>
{
	private String sname;
	private double savg;
	public Student(String sname, double savg) {
		this.sname=sname;
		this.savg=savg;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSavg() {
		return savg;
	}
	public void setSavg(double savg) {
		this.savg = savg;
	}




	@Override
	public String toString() {
		return "Student{" +  "name:" +sname+"      "+"average: "+savg+'}';
	           
	            
	      
	}
	public int compareTo(Student stud) {
		if(this.getSavg()>stud.getSavg())
		{
			return 1;
		}else if(this.getSavg()<stud.getSavg()) {
			return -1;
	    }
	   else {
	  	 return 0;
	   }	
	}
	
}
	
	public class PriorityQueueEx {

	public static void main(String[] args) {
		PriorityQueue<Student> studPriorityQueue=new PriorityQueue<>();
		studPriorityQueue.add(new Student("Sita",989.08));
		studPriorityQueue.add(new Student("Divya",890.09));
		studPriorityQueue.add(new Student("Devi",909.87));
		
		
		
//		for(Student s:studPriorityQueue)
//		{
//			System.out.println(s);
//		}
//		
		
	
		while(!studPriorityQueue.isEmpty())
		{
			System.out.println(studPriorityQueue.remove());
		}
		
	

	}

}
