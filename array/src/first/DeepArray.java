package first;

public class DeepArray {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50};
		int cloneArray[]=array.clone();
		System.out.println(array==cloneArray);
		for(int i=0;i<cloneArray.length;i++)
		{
			System.out.println(cloneArray[i]+" ");
		}
		
		
		
	
		}
}
