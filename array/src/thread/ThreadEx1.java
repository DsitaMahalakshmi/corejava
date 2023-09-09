package thread;

import java.util.Scanner;

class Thread1 implements Runnable{

	@Override
	public void run() {
		int fact=1;
		for(int i=1;i<=5;i++)
		{
		fact=fact*i;
		System.out.println(fact);
		}
		
	}
	
}
public class ThreadEx1 {

	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread t=new Thread(t1);
		System.out.println("factorial of  number:");
		t.start();
		
		

	}

}
