package sitha;

interface Animal{
	abstract void makeSound();
	abstract void sleep();
}
interface Crow{
	abstract void fly();
}
class Dog implements Animal,Crow
{
	public void makeSound()
	{
		
		System.out.println("Dog makes sound is bow bow");
	}

	@Override
	public void sleep() {
		
		System.out.println("Zzzzzz");
	}

	@Override
	public void fly() {
		System.out.println("crow is bird");
		
	}
}
	
public class MutilpleInheritEx {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.makeSound();
		d.sleep();
		d.fly();

	}

}
