package collectionframework;

import java.util.HashSet;
import java.util.Iterator;
 class AlphaMethod1 {
	public static int uniqueVowel(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
		
			{
				count++;
				System.out.println(count);
			}
		
		}
		return count;
	}	
	public static int uniqueConsonant(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='a'||str.charAt(i)!='e'||str.charAt(i)!='i'||str.charAt(i)!='o'||str.charAt(i)!='u')
		
			{
				count++;
				System.out.println(count);
			}
		
		}
		return count;
	}
	public static String uniqueCharacters(String str)
	{
		String uniqString="";
		HashSet<Character>set=new HashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
			
		}
		System.out.println("set:"+set);
		Iterator<Character> itr=set.iterator();
		while(itr.hasNext())
		{
			uniqString+=itr.next();
			
		}
		return uniqString;
	}
  }
   public class AlphabetMethod{
	   
	public static void main(String[] args) {
		
		String str="welcome tooo javavava";
		
		int vowelCount=AlphaMethod1.uniqueVowel(AlphaMethod1.uniqueCharacters(str));
		System.out.println("Vowel in the string are:"+vowelCount);
		
		int consonantCount=AlphaMethod1.uniqueConsonant(AlphaMethod1.uniqueCharacters(str));
		System.out.println("consonant in the string are:"+consonantCount);
		
		
		
	}

}
