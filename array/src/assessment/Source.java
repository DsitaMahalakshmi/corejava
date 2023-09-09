package assessment;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@FunctionalInterface 
interface validate {
boolean isValid(String firstName, String lastName);
}

public class Source {
	boolean validate(String username,String password)
	{
		validate v=(str1,str2)->{return(str1.equals("ABC") && str2.equals("DEF"))?
				true:false;};
				 return v.isValid(username,password);
				 }
				 public static void main(String[] args)throws Exception
				 {
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				 String uname="ABC";
				String pass="DEF";
//				System.out.println("enter username:");
//				String uname=br.readLine();
//				System.out.println("enter password:");
//				String pass=br.readLine();
				Source s=new Source();
				System.out.println(s.validate(uname,pass));
				}
	
}	


