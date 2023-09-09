package assessment;

import java.util.Scanner;

public class CountAlphabet {
	public int countAm(String s){
		String str=s.toLowerCase();
		int count=0;
		String a[]=str.split(" ");
		for(int i=0;i<a.length;i++)
		{
			if(a[i].equals("am")) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		CountAlphabet c=new CountAlphabet();
		Scanner s=new Scanner(System.in);
		System.out.println("enter a sentence:");
		String input=s.nextLine();
		s.close();
		
		int result=c.countAm(input);
		System.out.println("number of Am occurences:"+result);
		
	}

}
