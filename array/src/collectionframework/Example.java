package collectionframework;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		String sample_array[]= {"Mon","Tues","Wed","Thu","Fri","Sat","Sun"};
	   int length_array=sample_array.length;
	   System.out.println("The input elements are as follows:");
	   for(int i=0;i<length_array;i++)
	   {
		   System.out.println(sample_array[i]+" ");
	   }
	   System.out.println();
	   List  converted_list=Arrays.asList(sample_array);
	   System.out.println("The converted list is as follows:"+converted_list);
	   Collections.sort(converted_list);
	   System.out.println("sorted list:"+converted_list);
	   Collections.reverse(converted_list);
	   System.out.println("Reverse List:"+converted_list);

}
}