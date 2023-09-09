package collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie{
	String movieName;
	int movieYear;
	double rating;
	Movie(String movieName,int movieYear,double rating)
	{
		this.movieName=movieName;
		this.movieYear=movieYear;
		this.rating=rating;
	}
	
	public String toString() {
		return "Movie[movieName=" +movieName +", movieYear=" +movieYear+", rating="+rating+"]"; 
	}
}
class SortByYear implements Comparator<Movie>
{
	public int compare(Movie o1,Movie o2)
	{
		return o1.movieYear-o2.movieYear;
	}
}
class SortByName implements Comparator<Movie>
{
	public int compare(Movie o1,Movie o2)
	{
		return o1.movieName.compareTo(o2.movieName); 
	}
}

public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Movie> list=new ArrayList<Movie>();
		list.add(new Movie("DDL", 2011, 4.5));
		list.add(new Movie("KGF",2021,4.6));
		list.add(new Movie("RRR",1990,4.98));
		//Collections.sort(list,new SortByName());
		//Collections.sort(list,new SortByYear());
		Collections.sort(list, new SortByYear());
		for(Movie m:list)
		{
			System.out.println(m);
		}

	}

}
