package sitha;

public class Flowers {
	int fprice;
	String fname;
	Flowers()
	{
		fprice=0;
		fname=" ";
		
	}
	void dis()
	{
		System.out.println("default constructor");
	}
	Flowers(int fprice,String fname)
	{
		this.fprice=fprice;
		this.fname=fname;
	}
	void show()
	{
		System.out.println("parameterised constructor");
	}
	void display()
	{
		System.out.println("flowers are of two types");
		System.out.println("thron flowers");
		System.out.println(fprice+ " "+fname+"  ");
		
	}
	void showData()
	{
		System.out.println("Non-thron flowers");
		System.out.println(fprice+ " "+fname+"  ");
	}

	public static void main(String[] args) {
		Flowers f=new Flowers();
		f.dis();
		Flowers f1=new Flowers(10, "Jasmine");
         f1.show();
         f1.display();
         f1.fprice=10;
       //  System.out.println(f1.fprice);
         f1.fname="Jasmine";
        // System.out.println(f1.fname);
         Flowers f2=new Flowers(5, "Rose");
         f2.showData();
	}

}
