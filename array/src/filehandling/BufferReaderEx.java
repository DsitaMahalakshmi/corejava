package filehandling;

import java.io.*;
import java.util.*;


public class BufferReaderEx {

	public static void main(String[] args) {
		try
		{
			FileInputStream file=new FileInputStream("C:/Users/darla/ListOfCourses.txt");
			BufferedReader reader=new BufferedReader(new InputStreamReader(file));
			String line;
			while((line=reader.readLine())!=null )
			{
				System.out.println(line);
			}
		}
		catch(IOException e )
		{
			e.printStackTrace();
		}

	}

}
