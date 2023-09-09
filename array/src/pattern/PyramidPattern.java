package pattern;

public class PyramidPattern {

	public static void main(String[] args) {
		int numRows=3;
		System.out.println("Left-Aligned Bottom pyramid:");
		leftBottomPyramid(numRows);
		System.out.println("\nMiddle-Aligned Bottom pyramid:");
		middleBottomPyramid(numRows);
		System.out.println("Right-Aligned Bottom pyramid:");
		rightBottomPyramid(numRows);
	}
	public static void leftBottomPyramid(int numRows)
	{
		for(int i=numRows;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public static void middleBottomPyramid(int numRows)
	{
		for(int i=numRows;i>=1;i--)
		{
			for(int j=1;j<=numRows-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i*2-1;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void rightBottomPyramid(int numRows)
	{
		for(int i=numRows;i>=1;i--)
		{
			for(int j=1;j<=numRows-i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
	
	
	
	
}
