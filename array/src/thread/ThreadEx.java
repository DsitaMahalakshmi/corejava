package thread;
class ThreadOne extends Thread{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			
			System.out.println(i);
		}
	}
}
public class ThreadEx {

	public static void main(String[] args) {
		ThreadOne t=new ThreadOne();
		System.out.println("ThreadOne:");
		t.start();

	}

}
