package thread;
class MultiplicationTable implements Runnable
{

	@Override
	public void run() {
		int n=5;
		for(int i=0;i<=5;i++)
		{
		
			System.out.println(n+" * "+i+"="+n*i);
		}
		
	}
	
}
class Fibonacci implements Runnable
{

	@Override
	public void run() {
		int num=6;
		int f1=0,f2=1,f3;
		for(int i=1;i<=num;i++)
		{
			f3=f1+f2;
			System.out.println(+f3);
			f1=f2;
			f2=f3;
		}
		
	}
	
}
class EvenOrOdd implements Runnable
{

	@Override
	public void run() {
		int n=10;
		for(int i=0;i<=n;i++)
		{
			
		if(i%2==0)
		{
			System.out.println("even numbers:"+i);
			
		}
		
		else
		{
			System.out.println("odd numbers:"+i);
			
		}
		}
	}
	
}
public class ThreadMulOperEx {

	public static void main(String[] args) {
		MultiplicationTable m=new MultiplicationTable();
		System.out.println("5th table:");
		Thread t=new Thread(m);
		t.start();
		t.setPriority(Thread.MIN_PRIORITY);
		System.out.println("thread priority:"+t.getPriority());
		Fibonacci f=new Fibonacci();
		System.out.println("Fibonacci series:");
		Thread t1=new Thread(f);
		t1.start();
		t1.setPriority(Thread.NORM_PRIORITY);
		System.out.println("thread priority:"+t.getPriority());
		EvenOrOdd e=new EvenOrOdd();
		System.out.println("even or odd number:");
		Thread t2=new Thread(e);
		t2.start();
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println("thread priority:"+t.getPriority());

	}

}
