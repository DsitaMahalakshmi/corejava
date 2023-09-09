package java8;
//An interface which has only one abstract method is called functional interface.
@FunctionalInterface
interface drawing
{
	public void draw();
}
interface Sayable{  
    public String say(String name);  
}  
  

public class Ex1 {

	public static void main(String[] args) {
		int width=10;
		drawing d=()->//without parameters
		{
			System.out.println("Drawing "+width);  
        };  
        d.draw();  	
		

    // Lambda expression with single parameter.  
    Sayable s1=(name)->{  
        return "Hello, "+name;  
    };  
    System.out.println(s1.say("Sonoo"));
}
}



	
	

	


