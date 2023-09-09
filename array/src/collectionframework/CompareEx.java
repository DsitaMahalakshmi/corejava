package collectionframework;

import java.io.*;
import java.util.*;


class Vegetables implements Comparable<Vegetables>
{
	String name;
	int price;
	
	Vegetables(String name, int price)
	{
		this.name=name;
		this.price=price;
	}
	

public int compareTo(Vegetables ve)
{
	if(price==ve.price)
	{
		return 0;
		
	}else if(price>ve.price)
	{
		return 1;
	}
	else
	{
		return -1;
	}
}
}
public class CompareEx {

	public static void main(String[] args) {
		ArrayList<Vegetables> al=new ArrayList<Vegetables>();
		al.add(new Vegetables("Brinjal",100));
		al.add(new Vegetables("Tomato  ",40));
		al.add(new Vegetables("Onion   ",50));
		al.add(new Vegetables("Carrot  ",60));
		
		Collections.sort(al);
		for(Vegetables ve:al)
		{
			System.out.println(ve.name+"  "+ve.price+"  ");
		}
		

	}

}
