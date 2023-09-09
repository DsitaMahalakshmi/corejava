package pattern;

public class AlphabetsPattern {

	public static void main(String[] args) {
		for(int i=65;i<=71;i++)
		{
			for(int j=65;j<=i;j++)
			{
				char k=(char)j;
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
