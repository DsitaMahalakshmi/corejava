package sitha;
import java.io.*;
class Error
{
	void display()throws IOException
	{
		System.out.println("error occured");
	}
}

public class ThrowsEx2 {

	public static void main(String[] args)throws IOException {
		Error e=new Error();
		e.display();
		System.out.println("end of the code");
		

	}

}
