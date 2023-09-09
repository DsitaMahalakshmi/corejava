package java8;

import java.util.Arrays;
import java.io.*;
import java.util.List;

class Example{
	public static void main(String args[])
	{
		List<Integer>intSeq=Arrays.asList(1,2,3);
		intSeq.forEach(x->System.out.println(x));
		int var = 10;
		System.out.println("*******");
		List<Integer> intSeq1= Arrays.asList(1,2,3);
		intSeq.forEach(x -> System.out.println(x + var));
		
		System.out.println("########");
		List<Integer> intSeq2 = Arrays.asList(1,2,3);
		intSeq2.forEach( x -> {
		x += 2;
		System.out.println(x);
		});
		
		}
	
}