package accessmodifiers;
class ParentClass{
	int a=100;
	public String name="sita";
	protected String Degree="MCA";
	private String city="kkd";
	void showData() {
		System.out.println("inside parent class");
		System.out.println("a="+a);
		System.out.println("name="+name);
		System.out.println("Degree="+Degree);
		System.out.println("city="+city);
		
	}
}
class ChildClass extends ParentClass{
	void accessData() {
		System.out.println("inside child class");
		System.out.println("a="+a);
		System.out.println("name="+name);
		System.out.println("Degree="+Degree);
		//System.out.println("d="+d);//private member can't be accessed
	}
}

public class AccessModifiersExample {

	public static void main(String[] args) {
		
		ChildClass c=new ChildClass();
		c.showData();
		System.out.println(  );
		System.out.println("************");
		c.accessData();

	}

}
