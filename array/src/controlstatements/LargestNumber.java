package controlstatements;

public class LargestNumber {
	 void maxfun(int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println("a is big");
			
		}else if(b>c&& b>a)
		{
			System.out.println(" b is big");
		}
		else
		{
			System.out.println(" c is big");
		}
	}

	public static void main(String[] args) { 
		LargestNumber b=new LargestNumber();
		
		b.maxfun(12,4,5);

	}

}
