package pattern;

public class Pattern5 {
	public static void pattern(int n)
	{
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j+"  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=5,m=4,o=3;
		pattern(n);
		pattern(m);
		pattern(o);
	}

}
