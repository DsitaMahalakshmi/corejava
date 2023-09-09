package sitha;
class Bank{
	public int id;
	public String name;
	Bank(int id, String name)
	{
		this.id=id;
		this.name=name;
	  
	  System.out.println("bid:"+ id+" ," + "bname: "+name);
	  
	}
	
}
class Money extends Bank
{
 Money(int id, String name) {
		super(id, name);
		
	}

	void desopit()
	{
		System.out.println("money added successfully");
	}
	
}

public class OverridingEx {

	public static void main(String[] args) {
		Money m=new Money(6789, "SBI");
			
		m.desopit();
		
	}

}
