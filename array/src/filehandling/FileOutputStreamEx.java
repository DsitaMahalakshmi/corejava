package filehandling;
import java.io.*;
import java.util.*;

public class FileOutputStreamEx {

	public static void main(String[] args) {
		try
		{
			OutputStream oStream=new FileOutputStream("C:Users/darla/Desktop/Output.txt");
			oStream.write(70);
			oStream.write(65);
			oStream.write(78);
			oStream.close();
			System.out.println("successfully created and written the file.");
			
		}
		catch(Exception e)
		{
			System.out.println("Exception");
		}

	}

}
