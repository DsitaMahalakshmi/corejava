package oops;
class Stud{
	private int m1;
	private int m2;
	public Stud()
	{
		m1=0;
		m2=0;
	}
	public Stud(int m1,int m2)
	{
		this.m1=m1;
		this.m2=m2;
	}
	public int display()
	{
		return m1+m2;
	}
}
class Marks extends Stud
{
	private int m3;
	public Marks()
	{
		super();
		m3=0;
	}
	Marks(int m1,int m2,int m3)
	{
		super(m1,m2);
		this.m3=m3;
	}
	public int dis()
	{
		return display()*m3;
	}
}

public class SuperCon2 {

	public static void main(String[] args) {
		Marks s=new Marks();
		System.out.println("marks of a student:"+s.dis());
		Marks s2=new Marks(25, 59, 45);
		System.out.println("marks of a student:"+s2.dis());
		

	}

}
