package practice;

public class ConEx2 {
	int l;
	int b;
	ConEx2()
	{
		l=0;
		b=0;
	}
	void show()
	{
		System.out.println("default constructor");
	}
	ConEx2(int x,int y)
	{
		l=x;
		b=y;
	}
	void dis()
	{
		System.out.println("parameterised constructor");
	}
	void farea()
	{
		int area=l*b;
		System.out.println("area:"+area);
	}
		
	
	public static void main(String[] args) {
	ConEx2 c=new ConEx2();
	ConEx2 c1=new ConEx2(10, 20);
	c.show();
	c.dis();
	c1.farea();

	}

}
