package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
//read single character only
public class FileInputStreamEx {

	public static void main(String[] args) {
   try{    
	  FileInputStream fin=new FileInputStream("C://Users//darla//first.txt");    
	  int i=fin.read();  
	  System.out.print((char)i);    
	  
	  fin.close();    
	  }catch(Exception e)
	 {
	  System.out.println(e);
	  }    
	}

}
