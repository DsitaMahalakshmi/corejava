package oops;

public class DefaultConstructor {
	private String name;


	public DefaultConstructor() {
		System.out.println("Default constructor");
	}
	
	DefaultConstructor(int no,String name)
	{
		no=no;
		name=name;
		
		System.out.println("no:"+no);
		System.out.println("name:"+name);
	}
	

	public static void main(String[] args) {
	DefaultConstructor De=new DefaultConstructor();	
	System.out.println("parameterised constructor");
   DefaultConstructor de2=new DefaultConstructor(10,"sita");
   DefaultConstructor de3=new DefaultConstructor(101,"Geetha");
	}

}
