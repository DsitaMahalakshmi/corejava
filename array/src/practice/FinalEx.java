package practice;
final class Parent1{// we can't extend the final class
final void display() {
		
	}
}

public class finalEx extends Parent1{
	final int a=10;// we can't change the value of a final variable
	//final variables are like constants we can't change the value once it has been declared
	void display() {
		
	}
//we can't overide final method
	public static void main(String[] args) {
		finalEx f=finalEx();
		//f.a=15;

	}

}
