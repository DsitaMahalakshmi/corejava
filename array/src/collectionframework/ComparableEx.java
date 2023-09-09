package collectionframework;
import java.util.*;
class Emp implements Comparable<Emp>
{
	private String name;
	private int salary;
	Emp(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
@Override
	public String toString() {
		return "Emp [name=" + name + ", salary=" + salary + "]";
	}
	//	public String toString()
//	{
//		return "Emp[name="+name+",salary ="+salary+"]";
//	}
	@Override
	public int compareTo(Emp e) {
		
		return this.name.compareTo(e.getName());
	}
	
}

public class ComparableEx {

	public static void main(String[] args) {
		List<Emp> el=new ArrayList<Emp>();
		el.add(new Emp("sita",100000));
		el.add(new Emp("devi",24000));
		el.add(new Emp("asha",50000));
		el.add(new Emp("raju",600000));
		Collections.sort(el);
		for(Emp s:el)
		{
			System.out.println(s);
		}

	}

}
