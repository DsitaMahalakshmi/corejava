package collectionframework;
import java.util.*;
class Department{
	int id;
	String name;
	public Department(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Department> hs=new HashSet<>();
		hs.add(new Department(1,"sales"));
		hs.add(new Department(2,"Marketing"));
		hs.add(new Department(3,"IT"));
		hs.add(new Department(4,"HR"));
		System.out.println("Departments:");
		for(Department d:hs)
		{
			System.out.println("id:"+d.id);
			System.out.println("name:"+d.name);
		}
	}

}
