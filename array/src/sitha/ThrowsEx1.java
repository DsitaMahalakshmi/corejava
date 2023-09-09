package sitha;
import java.io.*;
class Example1
{
	void method()throws IOException{
		System.out.println("device operation performed");
	}

	
}
public class ThrowsEx1 {

	public static void main(String[] args) throws IOException {
		Example1 e=new Example1();
		e.method();
		System.out.println("normal flow");

	}

}
