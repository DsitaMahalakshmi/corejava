package aggregation;

public class Employee {
	private Job job;
	
	public Employee()
	{
		this.job=new Job();
		job.setJsal(50000);
		job.setJid(100);
		job.setJcity("kkd");
		
		
	}
	int getSal()
	{
		return job.getJsal();
	}
	String getcity()
	{
		return job.getJcity();
		
	}
	int getJid()
	{
		return job.getJid();
	}
}
	
		

	


