package sitha;

 abstract class AbstractEx {
	 
	abstract void cycle();
	abstract void car();
 }
// we can't create object for the abstract class 
	class Wheel extends Abstract1
	{
		void cycle()
		{
			System.out.println("cycle has 2 wheels");
			
		}
	}
	class Car extends Wheel
	{
		void car()
		{
			System.out.println("car has 4 wheels");
		}
	}
	public class Abstract1{

	public static void main(String[] args) {
	 Wheel w=new Wheel();
	 
	 w.cycle();
	 
	 Car c=new Car();
	 c.car();
	
	}

	}
