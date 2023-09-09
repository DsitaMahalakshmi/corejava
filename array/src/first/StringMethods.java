package first;

public class StringMethods {

	public static void main(String[] args) {
		String str="sita";
		String str1="Maha lakshmi";
		System.out.println("The length of the string is:"+str.length());
		System.out.println("Uppercase of a string:"+ str.toUpperCase());
		System.out.println("Lowercase of a strings:"+str.toLowerCase());
		System.out.println("concate string:"+str.concat("Darlanka"));
		System.out.println("replace string:"+str.replace("sita", "Mamatha"));
		System.out.println("index of i:" + str.indexOf('i'));
		System.out.println("index of s:" + str.indexOf('s'));
		System.out.println("string is empty or not:" + str.isEmpty());
		System.out.println("string is blank or not:" + str.isBlank());
		System.out.println("compare the string:"+str.compareTo(str1));
		System.out.println("index of a given string in 4th position:" + str.charAt(3));
		System.out.println("string starts with si:" + str.startsWith("si"));
		System.out.println("string starts with si:" + str.startsWith("si"));
		System.out.println("string ends with mi:" + str.endsWith("si"));
		System.out.println("remove the space b/n in str1:" + str1.trim());
		System.out.println("remove the whitespaces b/n in str1:" + str1.strip());
		System.out.println("repeat the string sita:" + str.repeat(3));
		System.out.println("str content is same in the str1 or not:" + str.contentEquals(str1));
		

		
		
		
		
		
	}

}
