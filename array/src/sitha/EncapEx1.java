package sitha;
class Person1
{
	private String name;
	public String getName()
	{
		return name;
		
	}
	public String setName(String name)
	{
		return this.name=name;
	}
}

public class EncapEx1 {
	

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Lucky");
		System.out.println(p.getName());
	}

}
