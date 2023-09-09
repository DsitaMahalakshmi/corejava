package assessment;
interface CheckStr1{
	String Space(String str);
}
public class Example{
	public String insertSpacce(String s) {
	CheckStr1 sr=
		    (String str)->{
//		    	String str1="";
//		    	str1+=str.charAt(0);
//		   
//		    	for(int i=1;i<str.length();i++) {
//		    		str1=str1+" "+str.charAt(i);
//		    	}
//		    	
//		    	System.out.println(str1.length());
//		    	return str1;
		    	String str1=str.replace("", " ").trim();
		    	System.out.println(str1.length());
		    	return str1;
		    };
		    return sr.Space("welcome");
	}
}
