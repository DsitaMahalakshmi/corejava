package array;

import java.util.Arrays;

public class AscendingOrder {

	public static void main(String[] args) {
		int arr[]= {5,2,8,1,3};
		int secondSmallest=getSecondSmallest(arr);
		System.out.println("Second Smallest:"+secondSmallest);
	}
	public static int getSecondSmallest(int arr[])
	{
		if(arr.length<2)
		{
			throw new IllegalArgumentException("Array must have atleast two elements");
			
		}
		Arrays.sort(arr);
		return arr[1];
	}

}
