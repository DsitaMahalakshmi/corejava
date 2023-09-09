package filehandling;
import java.io.*;
import java.util.*;


public class FileEx {

	public static void main(String[] args) throws IOException {
	File newFile=new File("C:/Users/darla/ListOfCourses.txt");
	if(newFile.createNewFile()) {
		System.out.println("File created");
	}
	else {
		System.out.println("File Exists");
	}

	}

}
