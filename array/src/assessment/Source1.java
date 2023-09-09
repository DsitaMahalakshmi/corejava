package assessment;

import java.util.Arrays;

public class Source1 {
	
	public int getSecondSmallest(int arr[])
	{
		//Arrays.sort(arr);
		//return arr[1];
		for(int i=0;i<arr.length;i++)
		{
			//for(int j=i+1;j<arr.length-1;j++)
			for(int j=i;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {
	Source1 obj=new Source1();
	int arr[]= { 23,45,32,22,20,96};
	System.out.println(obj.getSecondSmallest(arr));
	
	}
	

}
