package practice;

public class StringMethods {

	public static void main(String[] args) {
		String s="sita";
		String s1="mahalakshmi";
		String s3="java";
		String s4="programming language";
		System.out.println("Add two strings into one string:"+s+s1);
		
//Another way to combine two strigns into one string 
		String s5=s3.concat(s4);
		System.out.println(s5);
//length of the string
		System.out.println();//This output statement is used for space in the program
		System.out.println("length of the string:"+s4.length());
        System.out.println();
       String l="IOT";
       l.toCharArray();
       System.out.println(l);
       String a="Python";
       String b="python";
       System.out.println(a.compareTo(b));
       System.out.println(a.compareToIgnoreCase(b));
       System.out.println(a.isEmpty());
       System.out.println(a.isBlank());
       System.out.println(a.charAt(4));
       System.out.println(a.startsWith("p"));
       System.out.println(a.endsWith("s"));
       System.out.println(a.toLowerCase());
       System.out.println(b.toUpperCase());
       System.out.println(s4.trim());
       System.out.println(s3.repeat(2));
       System.out.println(s1.contentEquals("sita"));
       
       
       
       
       
       
       
       
       
       
	}

}
