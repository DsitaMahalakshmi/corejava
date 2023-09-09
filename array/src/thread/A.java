package thread;

public class A implements Runnable{
public void run() {
	System.out.println(Thread.currentThread());	
		
	}
public static void main(String[] args) {
		
A a=new A();
Thread t1=new Thread(a,"First Thread");
Thread t2=new Thread(a,"second Thread");
Thread t3=new Thread(a,"Third Thread");

t1.setPriority(4);
t2.setPriority(2);

t3.setPriority(8);
t1.start();
t2.start();
t3.start();

}

}
