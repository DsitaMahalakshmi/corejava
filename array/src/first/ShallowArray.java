package first;

public class ShallowArray {

	public static void main(String[] args) {
		int array[]= {10,20,30};
		int cloneArray[]=array.clone();
		System.out.println(array[0]==cloneArray[0]);
		System.out.println(array[1]==cloneArray[1]);
		
	}

}
