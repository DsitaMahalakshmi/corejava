package controlstatements;

public class Factorial {
	void fact(int num)
	{
		int fact=1,i=1;
		for(i=1;i<=num;i++) {
		fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		//int fact=1,n=5;
		//for(int i=1;i<=n;i++)
		//{
			//fact=fact*i;
			//System.out.println(fact);
	//	}
		//int fact=1,num=5,i=1;
		//while(i<=num)
		//{
			//fact=fact*i;
			//i++;
		//}
		//System.out.println("factorial of a number is:"+fact);
		Factorial f=new Factorial();
		System.out.println("The factorial of a given nuumber is:");
		f.fact(5);
		
	}

}
