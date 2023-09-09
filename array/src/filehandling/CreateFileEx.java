package filehandling;

import java.io.File;
import java.io.IOException;
//create a file in Java, you can use the createNewFile() method.
//If the file is successfully created,
//it will return a Boolean value true and false if the file already exists.

public class CreateFileEx {

	public static void main(String[] args) {
		  try {
	            File Obj = new File("myfile.txt");
	            if (Obj.createNewFile()) {
	                System.out.println("File created: "
	                                   + Obj.getName());
	            }
	            else {
	                System.out.println("File already exists.");
	            }
	        }
	        catch (IOException e) {
	            System.out.println("An error has occurred.");
	            e.printStackTrace();
	        }

	}

}
