package collectionframework;
import java.util.*;
public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(10);
		s.push(20);
		s.add(65);
		s.add(89);
		s.push(76);
		s.push(90);
		System.out.println("elements in stack:"+s);
        s.pop();
        System.out.println("Elements in stack:"+s);
        s.peek();
        System.out.println("Elements in stack:"+s.peek());
        //s.isEmpty();
        System.out.println("Elements in stack:"+s.isEmpty());
        
        
	}

}
