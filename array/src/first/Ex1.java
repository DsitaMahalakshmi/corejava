package first;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;



public class Ex1 {
	public static int add(int a,int b)
	 {
		return a+b; 
	 }
	 @Test
	 public void addTest()
	 {
		 Ex1 a=new Ex1();
		// assertEquals(6,a.add(4, 2));
	assertSame("error in add()", 4, Ex1.add(2,2));
	 }
}
