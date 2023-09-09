package sitha;
class Person{
	private String name;
	 private int age;
//get method returns the variable value
//set method sets the value	 
public String getName()
{
	return name;
}
public String setName(String name)
{
	return this.name=name;
}
public int getAge()
{
	return age;
}
public int setAge(int age)
{
	return this.age=age;
}
	
	
}

public class EncapsulationEx {

	public static void main(String[] args) {
		 Person myObj = new Person();
		    myObj.setName("John");
		    myObj.setAge(25);
		    System.out.println(myObj.getName());
		    System.out.println( myObj.getAge());
		   
		    
		
		
	}

}
 

