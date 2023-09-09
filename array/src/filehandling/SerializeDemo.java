package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class SerializeDemo {

	public static void main(String[] args) throws IOException {
	FileOutputStream fos=new FileOutputStream("emp.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	
	Employee e=new Employee();
	e.id=100;
	e.name="sita";
	oos.writeObject(e);
	oos.close();
	fos.close();
	System.out.println("Data saved");
	

	}

}
