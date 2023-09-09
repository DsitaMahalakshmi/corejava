package filehandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut {

	public static void main(String[] args) throws IOException  {
		FileOutputStream fos=new FileOutputStream("C:Users/darla/Desktop/file11.txt");
		String s="The next release in the six-month";
		byte b[]=s.getBytes();
		fos.write(b);
		System.out.println("content written successfully");
		
		FileInputStream fis=new FileInputStream("c:Users/darla/Desktop/sitha.txt");
		System.out.println("file content");
		int i=fis.read();
		System.out.println((char) i);
		System.out.println();
		
		while(1!=-1)
		{
			System.out.println((char)i);
			i=fis.read();
		}
		fis.close();

	}

}
