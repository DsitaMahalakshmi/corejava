package controlstatements;
class DisplaySquare{
	static void square(int x)
	{
		System.out.println("square:"+(x*x));
	}
}

public class FunctionType {
	void add(int a,int b)
	{
		System.out.println("Addition:"+(a+b));
	}
	static void mul(int a,int b)
	{
		System.out.println("Multiplication:"+(a*b));
	}
	int sub(int a,int b)
	{
		return a-b;
	}
	float div(int a, int b)
	{
		return a/b;
	}
	String displayName(String name)
	{
		return "Hello"+name;
	}

	public static void main(String[] args) {
		FunctionType f=new FunctionType();
		f.add(3, 5);
		mul(3,6);
		System.out.println("subtraction:"+f.sub(6, 3));
		System.out.println("Division:"+f.div(10,5));
		System.out.println(f.displayName(" Sita"));
		DisplaySquare.square(8);
	}

}
