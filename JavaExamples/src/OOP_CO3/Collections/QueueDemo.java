package OOP_CO3.Collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
	queue.add("JAI");
	
	System.out.println("Values:");
	queue.forEach(System.out::println);
	
	System.out.println("Values:"+queue.peek());
	queue.forEach(System.out::println);
	
	queue.remove("JAI");System.out.println("Values1:");
	queue.forEach(System.out::println);
	
	System.err.println(queue.remove("JAI"));
	}
}
