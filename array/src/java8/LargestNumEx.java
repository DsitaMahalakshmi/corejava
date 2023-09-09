package java8;

import java.util.Scanner;

interface large{
	int show(int x,int y,int z);
}

public class LargestNumEx {

	public static void main(String[] args) {
		
		large la=(int x,int y,int z)->
		{
			if(x>y && x>z)
			{
				System.out.println(" x is big");
			}
			else if(y>x && y>z)
			{
				System.out.println("y is big");
			}
			else
			{
				System.out.println("z is big");
			}
			return x;
			
		};
		System.out.println(la.show(3, 15, 5));
		
	}

}
