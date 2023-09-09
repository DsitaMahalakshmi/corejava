package thread;
class ThreadTwo implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread1");
		for(int i=0;i<5;i++)
			System.out.println(i);
	}
	
}

public class ThreadUsingInterface {

	public static void main(String[] args) {
		ThreadTwo t1=new ThreadTwo();
		Thread t=new Thread(t1);
		t.start();

	}

}
