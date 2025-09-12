package OOP_CO3.Collections;

import java.util.HashSet;

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
		hSet.clear();
		System.err.println("Display HashSet Elements after cleAR: ");
		hSet.forEach(System.out::println);
		System.out.println(hSet.isEmpty());
	}

}
