package java8;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class PrimeNumEx {
	static int n = 13;

	private static boolean isPrime(int number) {
		return number>1 && IntStream.range(2, number).noneMatch(i->number%i==0);
	}

	public static void main(String[] args) {
		
		System.out.println("Prime checking...."+isPrime(n));

	}

}
