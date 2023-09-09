package first;

public class SecondSmallest {
	static int getSecondSmallest(int arr[]) {
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("second smallest element;"+arr[1]);
		return arr[1];
	}

	public static void main(String[] args) {
		int arr[]= {23,45,32,12,6};
		System.out.println(getSecondSmallest(arr));
	}

}
