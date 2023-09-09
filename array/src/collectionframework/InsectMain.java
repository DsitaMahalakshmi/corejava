package collectionframework;
import java.io.*;
import java.util.*;
class Insect
{
	private  String insectName;
	private int insectWeight;
	
	
	Insect(String insectName,int insectWeight)
	{
		this.insectName=insectName;
		this.insectWeight=insectWeight;
	}
	
	
	public String getInsectName() {
		return insectName;
	}
	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}
	public int getInsectWeight() {
		return insectWeight;
	}
	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
	
	
	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
}


class Insecticides{
	public List<String>mapInsectName(List<Insect> list)
	{
		List<String> s=new ArrayList<>();
		for(Insect i:list)
		{
			s.add(i.getInsectName());
		}
		return s;
	}
	
	public List<Insect> getWeight(List<Insect>list)
	{
		List<Insect> s1=new ArrayList<>();
		for(Insect i:list)
		{
			int weight=i.getInsectWeight();
			if(weight>40  &&  weight<=100)
			{
				s1.add(i);
			}
			
		}
		return s1;	
		
	}
}

public class InsectMain {

	public static void main(String[] args) {
		List<Insect> l=new ArrayList<>();
		l.add(new Insect("Ant",45));
		l.add(new Insect("Cockroach",65));
		l.add(new Insect("Bee",99));
		l.add(new Insect("Paper wasp",11));
		
		Insecticides i=new Insecticides();
		System.out.println(i.mapInsectName(l));
		
		System.out.println(i.getWeight(l));

	}

}
