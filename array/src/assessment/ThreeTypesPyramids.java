package assessment;

public class ThreeTypesPyramids {

	public static void main(String[] args) {
		int n1=3;
		int n2=2;
		int n3=4;
		System.out.println("Middle pyramid1:");
		printMiddleNumberPyramid(n1);
		printMiddleNumberPyramid(n2);
		printMiddleNumberPyramid(n3);
	}
	public static void printMiddleNumberPyramid(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
