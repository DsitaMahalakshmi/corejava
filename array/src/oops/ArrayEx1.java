package oops;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;

import first.Ex1;

public class ArrayEx1 {
 int arr[]= {10,20,30};
 int arr1[]= {10,20,30};
 @Test
 
 public void test()
 {
	 ArrayEx1 a=new ArrayEx1();
	
    assertArrayEquals(arr, arr1);
 }
 
}



 

