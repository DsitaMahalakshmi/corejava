package oops;

public class Objects {
	public String sname;
	public double percentage;
	void display()
	{
		System.out.println("student name:"+sname);
		System.out.println("percentage:"+percentage);
	}

	public static void main(String[] args) {
		
       Objects b1=new Objects();
       b1.display();
       b1.sname="sita";
       b1.percentage=82.89;
       
	}

}
