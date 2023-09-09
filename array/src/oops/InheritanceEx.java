package oops;
class Flowers
	{
		String name;
		void display() {
			
			System.out.println("The name of the flower is:"+name);
		}
	}
	class Fruits extends Flowers
	{
		String fname;
		//public String vname;
		void dis() {
			System.out.println("The name of the fruit is:"+fname);
		} 
	}	
	class Vegetables extends Fruits{
			String vname;
			void display3() {
				System.out.println("The name of the vegetable is:"+vname);
			}
		}
	

public class InheritanceEx {
	public static void main(String[] args) {
	System.out.println("multilevel inheritance");	
     Vegetables v=new Vegetables();
     v.vname="brinjal";
     v.display3();
     System.out.println("***********");
     System.out.println("single inheritance");
     v.fname="Apple";
     v.dis();
     v.name="Lilly";
     v.display();
		
		
		
	}

}
