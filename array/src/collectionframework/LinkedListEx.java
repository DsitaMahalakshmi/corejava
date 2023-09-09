package collectionframework;
import java.util.*;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> n=new LinkedList<>();
		n.add(10);
		n.addFirst(25);
		n.add(33);
		n.add(45);
		n.addLast(50);
		System.out.println("Elements in linkedlist:"+n);
		n.removeLast();
		System.out.println("Elements in linkedlist:"+n);
		n.removeFirst();
		System.out.println("Elements in linkedlist:"+n);
		n.poll();
		System.out.println("Elements in linkedlist:"+n);
		n.pollFirst();
		System.out.println("Elements in linkedlist:"+n);
		n.pollLast();
		System.out.println("Elements in linkedlist:"+n);
	}

}
