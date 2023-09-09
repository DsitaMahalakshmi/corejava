package pattern;

import java.util.Scanner;

class Amsterdam
{
	public int countAm(String s)
	{
		String str=s.toLowerCase();
		int count=0;
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equalsIgnoreCase("am"))
			{
				count=count+1;
			}
		}
		return count++;
	}
}
public class CountLetters {
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	Amsterdam a=new Amsterdam();
	int count=a.countAm(s);
	System.out.println(count);
	}

}
