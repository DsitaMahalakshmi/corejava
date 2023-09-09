package sitha;
interface Vegetables{
	abstract void leafyVegetables();
	abstract void nonLeafyVegetables();
//interface is similar to class but the only difference is interface contains
	//abstract methods .
	//interface uses implement keyword for implementing the properties from the interface block into class block
}
class Vegetrians implements Vegetables
{
 public void leafyVegetables()
 {
	 
	System.out.println("Vegetrians are always eat leafyVegetables "); 
 }

@Override
public void nonLeafyVegetables() {
	System.out.println("Vegetrians are also eat nonLeafyVegetables");
	
}
}
public class InterfaceEx {

	public static void main(String[] args) {
		Vegetrians v=new Vegetrians();
		v.leafyVegetables();
		v.nonLeafyVegetables();

	}

}
