package collectionframework;
import java.util.*;

public class ListEx {

	public static void main(String[] args) {
		List<String>sample_list=new ArrayList<String>();
		
		sample_list.add("practice");
		sample_list.add("solve");
		sample_list.add("interview");
		System.out.println("The initial list is:"+sample_list);
		List<String> read_only_list=Collections.unmodifiableList(sample_list);
		System.out.println("The Read only ArrayList is:"+read_only_list);
		System.out.println("Trying to modify the ReadOnlyArrayList.");
		read_only_list.add("job");
		
	}

}
