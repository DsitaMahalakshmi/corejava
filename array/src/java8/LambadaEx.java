package java8;
interface Myinterface{
	int mul(int a,int b);
}
interface Evenodd
{
	int evod(int a);
}

public class LambadaEx {

	public static void main(String[] args) {
	Myinterface f=(int a,int b)->a+b;
	System.out.println("sum :"+f.mul(2,3));
	Myinterface f1=(int a,int b)->a*b;
	System.out.println("Multiplication:"+f1.mul(2,3));
	
	Evenodd e=(int a)->{
	if(a%2==0)
	{
		System.out.println("even");
	}
	else
	{
		System.out.println("odd");
	}
	return a;
	};	
	System.out.println(e.evod(8));

	}
}
