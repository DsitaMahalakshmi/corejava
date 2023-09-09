package assessment;

public class StringInfinite {

	public static void main(String[] args) {
		String base="abc";
		String sub="abcabc";
		boolean containsSub=checkString(base,sub);
		if(containsSub) {
			System.out.println("yes");
			
		}
		else {
			System.out.println("no");
		}
		
	}

	public  static boolean checkString(String base, String sub) {
		StringBuilder infiniteString = new StringBuilder();
		while(infiniteString.length()<sub.length()) {
			infiniteString.append(base);
		}
		return infiniteString.toString().startsWith(sub);
		}

	}


