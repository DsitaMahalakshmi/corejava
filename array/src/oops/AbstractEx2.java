package oops;
abstract class Bird{
	abstract  void makeSound();
//	static void makeSound1() {
//		System.out.println("Dog makes the sound is bow bow");
//	}
}
class Duck extends Bird{

	@Override
	void makeSound() {
		System.out.println("Duck makes the sound is Quack Quack");
	}
	static void Sound() {
		System.out.println("Dog makes the sound is bow bow");
	}
	
}
class Owl extends Bird{

	@Override
	void makeSound() {
		System.out.println("owl makes the sound is Hoot hoot");
		
	}
	
}

public class AbstractEx2 {

	public static void main(String[] args) {
		Duck d= new Duck();
		d.makeSound();
		Owl w=new Owl();
		w.makeSound();
	
		d.Sound();
		
	}

}
