package filehandling;
import java.io.*;

 class Link1 implements Serializable{
	  String commons;
	 int favorites;
	 public Link1(String commons,int favorites)
	 {
		 this.commons=commons;
		 this.favorites=favorites;
	 }
	 public void printLink1()
	 {
		 System.out.println("link:"+this.commons);
	 }
 }
public class SerializationEx
{
	 public static void serializeLink1(Link1 link, String filename)throws IOException{
		 FileOutputStream fos=new FileOutputStream(filename);
		 ObjectOutputStream oos=new ObjectOutputStream(fos);
		 oos.writeObject(link);
		 oos.close();
		 fos.close();
	 
	 }
	 public static Link1 deserializeLink1(String fileName)throws IOException,ClassNotFoundException{
		 FileInputStream fis=new FileInputStream(fileName);
		 ObjectInputStream ois=new ObjectInputStream(fis);
		Link1 link;
		link=(Link1)ois.readObject();
		return link;
		
		 
	 }
	

	public static void main(String[] args)throws IOException,ClassNotFoundException {
		Link1 link =new Link1("My first link",5);
         final String fileName="example.bin";
         System.out.println("Before serialization:");
         link.printLink1();
         serializeLink1(link, fileName);
         Link1 newLink1=deserializeLink1(fileName);
         System.out.println("After serialization:");
         newLink1.printLink1();

	}

}
