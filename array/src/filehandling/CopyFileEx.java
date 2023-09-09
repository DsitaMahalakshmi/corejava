package filehandling;

import java.io.*;
import java.util.Scanner;


public class CopyFileEx {
	public static void copyData(File file1, File file2) throws Exception  
    {  
        
        FileInputStream inputStream = new FileInputStream(file1);  
        FileOutputStream outputStream = new FileOutputStream(file2);  
       
        InputStream inputStream1 = null;
		PrintStream outputStream1 = null;
		try {  
             
            int i;  
          
            while ((i = inputStream1.read()) != -1) {  
                  
                  
                outputStream1.write(i);  
            }  
        }  
         
        catch(Exception e) {  
            System.out.println("Error Found: "+e.getMessage());  
        }  
        
        finally {  
            if (inputStream1 != null) {  
       
                inputStream1.close();  
            }  
            // use close() method of FileOutputStream class to close the stream  
            if (outputStream1 != null) {  
                outputStream1.close();  
            }  
        }  
        System.out.println("File Copied");  
    }  
    // main() method start  
    public static void main(String[] args) throws Exception  
    {  
        // create scanner class object to take file name from user  
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Enter the name of the file from where the data would be copied :");  
        String file1 = sc.nextLine();  
        
        File a = new File("C:Users\\darla\\First1.txt"+file1);  
  
        System.out.println("Enter the name of the file from where the data would be written :");  
        String file2 = sc.nextLine();  
         
        File b = new File("C:\\Users\\darla\\copyfile.txt"+file2);  
        sc.close();  
         
        copyData(a, b);  
    }  
}  

	

	


