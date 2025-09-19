package OOP_CO3.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hSet=new HashSet<String>();
		
		hSet.add("Apple");
		hSet.add("banana");
		hSet.add("Apple");
		hSet.add("apple");
		hSet.add("Cat");
		hSet.add("cap");
		hSet.add("Cat");
		
		System.err.println("Display HashSet Elements: ");
		hSet.forEach(System.out::println);
		
		Object hs=hSet.clone();
		System.out.println("HI: "+hSet.isEmpty()+" "+hSet.contains("appple"));
//		hSet.clear();
		System.err.println("Display HashSet Elements after cleAR: ");
		hSet.forEach(System.out::println);
		System.out.println(hSet.isEmpty());
		
		System.out.println("HAAKAKA");
		Iterator<String> iterator=hSet.iterator();
		while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);

            // Remove "Bob" during iteration
            if (name.equals("apple")) {
                iterator.remove();
            }
        }
		System.out.println("HbbKbKb");
		
		for (String name : hSet) {
            System.out.println(name);
        }
	}

}
