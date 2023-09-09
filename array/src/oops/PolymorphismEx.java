package oops;

public class PolymorphismEx {
	static int add(int a,int b)
	{
		return a+b;
	}
	static double add(double a,double b)
	{
		return a+b;
	}
	static float add(float a,float b,float c)
	{
		return a+b+c;
	}

	public static void main(String[] args) {
     System.out.println(PolymorphismEx.add(20, 30));
     System.out.println(PolymorphismEx.add(87, 90));
     System.out.println(PolymorphismEx.add(3.5f, 2.1f, 6.9f));
     
     


	}

}
