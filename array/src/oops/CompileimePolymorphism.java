package oops;

public class CompileimePolymorphism {
	void add(int a)//method overloading is also known as early binding polymorphism
	{
		System.out.println("sum:"+a);//In method overloading, same method name but diff parameter lists.
	}
    void add(int a,int b)
    {
    	System.out.println("sum:"+a+" +"+b+":"+(a+b));
    	
    }
    //real time of example method overloading are a student behaviour in class 
    void add(int a,float b)//mobile phone, water in different states
    {
    	System.out.println("sum:"+a+" +"+b+":"+(a+b));
    }
    int sum(int a,int b)
    {
    	return a+b;
    }
	public static void main(String[] args) {
		CompileimePolymorphism c=new CompileimePolymorphism();
		c.add(25);
		c.add(10, 15);
		c.add(12, 14f);
		System.out.println("Addition of 2 numbers:"+c.sum(25,33));
	}

}
