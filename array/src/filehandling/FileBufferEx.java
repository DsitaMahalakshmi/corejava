package filehandling;

import java.io.*;
import java.util.*;

public class FileBufferEx {

	public static void main(String[] args) throws IOException,FileNotFoundException {
	FileReader	fReader=new FileReader("C:Users/darla/Desktop/ListOfCourses1.txt");
    BufferedReader bReader=new BufferedReader(fReader);
    int records;
    while((records=bReader.read())!=-1)
    {
    	System.out.println((char)records);
    }
    bReader.close();
    fReader.close();
	}

}
