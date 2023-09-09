package first;

public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("sita");
		str.append("mahalakshmi");
		System.out.println(str);
		
		str.insert(10, "Darlanka");
		System.out.println(str);
	
		str.replace(8, 16, "Mam");
		System.out.println(str);
		
		str.reverse();
		System.out.println(str);
		
		System.out.println(str.capacity());
	}

}
