package controlstatements;

import java.math.BigInteger;

public class Example {
	
	static BigInteger factorial(int N)
	{
		BigInteger f=new BigInteger("1");
		
		for(int i=2;i<=N;i++)
			f=f.multiply(BigInteger.valueOf(i));
		return f;
	}

	public static void main(String[] args) {
		
     int N=5;
     System.out.println(factorial(N));
	}

}
