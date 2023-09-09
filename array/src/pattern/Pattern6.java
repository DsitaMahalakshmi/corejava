package pattern;

public class Pattern6 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=1;j<=3;j++)
			{
				if(j==1||j==3||i==1||i==3)
				{
				System.out.print("*");
				}
				else
				{
				System.out.print(" ");
				}
			}
			System.out.println();

		}
		

	}

}
