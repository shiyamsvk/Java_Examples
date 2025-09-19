package OOP_CO3.Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Raja");
		hmap.put(2, "Rama");

//		System.err.println("With Help of Var");
//		for (var entry : hmap.entrySet()) {
//			System.out.println(entry.getKey() + " -> " + entry.getValue());
//		}

		System.err.println("Using entrySet():");
		for (Entry<Integer, String> entry : hmap.entrySet()) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		// Iterate using forEach
//		System.err.println("Using forEach:");
//		hmap.forEach((key, value) -> System.out.println(key + " -> " + value));

		System.err.println("Iterating Over a Map");
		Iterator<Entry<Integer, String>> iterator = hmap.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}

		hmap.remove(1);

		System.err.println("After remove 1st index:");
		System.out.println(hmap);
		
		HashMap<Integer, String> hSet = new HashMap<Integer, String>();

		hSet.put(3, "Apple");
		hSet.put(4, "banana");
		hSet.put(5, "Apple");
		hSet.put(6, "apple");
		hSet.put(8, "Cat");
		hSet.put(10, "cap");
		hSet.put(7, "cat");

		hmap.putAll(hSet);

		System.err.println("Using forEach:");
		hmap.forEach((key, value) -> System.out.println(key + " -> " + value));

		hmap.replace(7, "Ravanan");

		System.err.println("After changes value Using forEach:");
		hmap.forEach((key, value) -> System.out.println(key + " -> " + value));

		System.err.println("After Compute");
		hmap.compute(77, (key, value) -> value == null ? "parvathy" : value + "-shivan");
		// hmap.forEach((key, value) -> System.out.println(key + " -> " + value));

		hmap.compute(75, (key, value) -> value == null ? "Shivan" : value + "-Shivan");
		hmap.forEach((k, v) -> System.out.println(k + " -> " + v));

	}
}