package assessment;
import java.io.*;
import java.util.*;

public class StringEx {
	
	
	 public static  String RemoveOccurances(String str, char c)
	{
		String str1=" ";
		int index1=str.indexOf('a');
		int index2=str.lastIndexOf('a');
		for(int i=0;i<str.length();i++)
			{
			if(i==index1 ||i==index2)
			{
				continue;
			}else {
				str1+=str.charAt(i);
			}
			
			}
		 System.out.println("after remove occurance:"+str1);
		return str1;
		 			}
		public static void main(String[] args) throws IOException{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("enter string:");
	         String str=br.readLine();
	         System.out.println("enter a character:");
	         char ch=br.readLine().charAt(0);
	         System.out.println(RemoveOccurances(str, ch));
	       
	         

	
		
	}

}
