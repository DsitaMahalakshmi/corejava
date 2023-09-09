package accessmodifiers;
class PrivateEx{
	private int b=10;
	private String name;
	public void displayB()
	{
		System.out.println("value of B:"+b);
	}
	public String getName() {
		return name;
		
	}
	public void setName(String name)
	{
		this.name=name;
		
	}
}

public class PrivateClass {
	private int a=20;
	private void display() {
		System.out.println("value of A:"+a);
	}

	public static void main(String[] args) {
		PrivateClass p=new PrivateClass();
		System.out.println("value of a:"+p.a);
		p.display();
		PrivateEx p1=new PrivateEx();
		p1.displayB();
		p1.setName("EduBridge");
		System.out.println("Name:"+p1.getName());

	}

}
