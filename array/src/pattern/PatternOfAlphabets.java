package pattern;

public class PatternOfAlphabets {

	public static void main(String[] args) {
		for(int i=97;i<=101;i++) {//rows
			for(int j=97;j<=i;j++)//col
			{
				char k=(char)j;
				System.out.print(k+" ");
				
			}
			System.out.println();
	     }
	

	}

}
