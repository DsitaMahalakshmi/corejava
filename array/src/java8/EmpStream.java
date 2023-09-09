package java8;

import java.util.ArrayList;
import java.util.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;



public class EmpStream {

	public static void main(String[] args) {
		ArrayList<Emp>li=new ArrayList<>();
		li.add(new Emp(1,"Sita","Manager",23000));
		li.add(new Emp(2,"Lekha","TL",300000));
		li.add(new Emp(3,"Uday","HR",50000));
		li.add(new Emp(4,"Devi","DeskManager",40000));
		li.add(new Emp(3,"Uday","HR",50000));
		li.add(new Emp(4,"Devi","DeskManager",40000));
       System.out.println(li);
       System.out.println("#########");
       
		List<String>al = li.stream().map(e->e.toString()).collect(Collectors.toList());
		System.out.println("Elements in emp list:"+al);
		 System.out.println("**************");
		Set<String>hs = li.stream().map(e->e.toString()).collect(Collectors.toSet());
		System.out.println("Elements in emp set:"+hs);
		
		long count=li.stream().count();
		System.out.println(count);
		
		Stream<Emp>nameStartsWith=li.stream().filter(a->a.getEname().startsWith("U"));
		System.out.println(nameStartsWith.collect(Collectors.toList()));
		
		Object s = li.stream().collect(Collectors.maxBy(Comparator.comparingInt(w -> w.salary)));
		System.out.println("Emp maximum salary:" + s);
		Object s1 = li.stream().collect(Collectors.minBy(Comparator.comparingInt(w-> w.salary)));
		System.out.println("Emp minimum salary:" + s1);
		
		Object u = li.stream().collect(Collectors.averagingInt(w -> w.salary));
		System.out.println("Emp maximum salary:" + u);
		
		List<String> namesofemp = li.stream().map(n->n.ename).collect(Collectors.toList());
         System.out.println(namesofemp);
         
        List<String> departmentofemp=li.stream().map(n->n.department).collect(Collectors.toList());
        System.out.println(departmentofemp);
        
        System.out.println("Unique department record");
        li.stream().map(Emp::getDepartment).distinct().forEach(System.out::println);
        System.out.println(" department record");
        li.stream().map(Emp::getDepartment).forEach(System.out::println);
        System.out.println("employee salary");
        li.stream().map(Emp::getSalary).sorted().forEach(System.out::println);
        int a[] = { 1, 5, 8 ,34,3};
		long count1= Arrays.stream(a).sum();
		System.out.println("Sum:"+count1);
		
		
		
		
		
	}

}
