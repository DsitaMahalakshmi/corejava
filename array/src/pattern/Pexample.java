package pattern;

public class Pexample {
	public static void printPyramid(int n)
	{
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");}
			for(int k=1;k<=i*2-1;k++) {
				
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		printPyramid(3);
	}

}
