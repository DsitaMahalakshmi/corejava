package pattern;

public class Pattern2 {
	public static void pattern(int n)
	{
		int i,j;
		for(i=n;i>=i;i--) {
			for(j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=4,m=3,o=5;
		pattern(n);
		pattern(m);
		pattern(0);

	}

}
