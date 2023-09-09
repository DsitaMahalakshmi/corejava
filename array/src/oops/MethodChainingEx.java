package oops;
class Employee{
	int eid;
	String ename;
	int esal;
	public Employee setEid(int eid)
	{
		this.eid=eid;
		return this;
	}
	public Employee setEname(String ename)
	{
		this.ename=ename;
		return this;
	}
	public Employee setEsal(int esal)
	{
		this.esal=esal;
		return this;
	}
	void display()
	{
		System.out.println("eid:"+eid+"  "  +"ename:"+ename+ "  "+" esal:"+esal);
	}
	
}

public class MethodChainingEx {

	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(10).setEname("sita").setEsal(30).display();
	}

}
