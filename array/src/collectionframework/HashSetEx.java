package collectionframework;
import java.io.*;
import java.util.*;

public class HashSetEx {
//Hash set does not allow duplicate values 
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<>();
		hs.add("fkfk");
		hs.add("fkfk");
		hs.add("jkf");
		System.out.println("Hash set:"+hs);
		for(String h:hs)
		{
			System.out.println(h);
		}

	}

}
