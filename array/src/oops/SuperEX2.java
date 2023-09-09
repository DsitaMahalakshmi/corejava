package oops;
class Vehicle{
	static int vno=10;
	String vname="car";
	void print()
	{
		System.out.println("parent class");
		System.out.println("vno:"+vno);
		System.out.println("vname:"+vname);

	}
}
class Bike extends Vehicle
{
	void display() {
		System.out.println("child class");
	}
}
class Car extends Bike{
	void dis() {
		System.out.println("Multilevel inheritance");
	}
}

public class SuperEX2 {

	public static void main(String[] args) {
		Car c= new Car();
		c.print();
		
		c.display();
		c.dis();
		

	}

}
