package OOP_CO3.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.concurrent.ArrayBlockingQueue;

public class arrayListDemo {

	public static void main(String[] args) {
//		ArrayList<Integer> id = new ArrayList<>();// Creating ArrayList
//		id.add(4);// insertvalues
//		id.add(5);
//		id.add(6);
//		id.add(7);
//		id.add(5);
//		id.add(1);
//
//		for (Integer i : id)
//			System.out.println(i);
//
//		System.out.println(id.toString());
//
//		id.remove(1);
//		System.out.println("After Remove" + id.toString());
//		
//		ArrayList<String> a=new ArrayList<String>();
//		a.add("aa");
//		a.add("ea");
//		a.add("aa");
//		a.add("ab");
//		
//		System.out.println(a.toString());
//
//		a.remove("aa");
//		System.out.println("After aa Remove" + a.toString());
//		a.remove(1);
//		System.out.println("After 1 index Remove" + a.toString());
//		a.add("aa");
//		System.out.println(a.toString());
//		//a.add("aa");
//		//System.out.println(a.toString());
//		System.err.println("Index of aa: "+a.indexOf("aa"));
//		System.out.println("Index of LAst aa:"+a.lastIndexOf("aa"));
//		
		LinkedList<String> newList=new LinkedList<String>();
		newList.add("Hai");
		newList.add(1, "Helllo");
		//newList.add(null);
		System.out.println("values from List");
		for(String s:newList)
			System.out.println(s);
		System.out.println("values from List with help of ToSTring");
		System.out.println(newList.toString());
		
		String[] s=new String[newList.size()];
		
		newList.toArray(s);
		
		System.out.println("Array from List");
		for(String s1:s)
			System.out.println(s1);
		
		System.out.println("11Array from List as array");
		newList.forEach(System.out::println);
	
		newList.offer("how");
		newList.offerLast("Are");
		newList.addLast("you");
		try {
			newList.addLast("A");
        } catch (NullPointerException e) {
            System.out.println("addLast threw NullPointerException: " + e);
        }
		System.out.println("***New List: ***");
		newList.forEach(System.out::println);
		
		ArrayBlockingQueue< String> bb= new ArrayBlockingQueue<String>(22);
		
		bb.addAll(newList);
		System.out.println("Array blockQueue");
		bb.forEach(System.out::println);
		
		Iterator<String> i=newList.iterator();
		System.out.println("iterator");
		i.forEachRemaining(System.out::println);
	
		Iterator<String> i1=newList.listIterator();
		System.out.println("List iterator");
		i1.forEachRemaining(System.out::println);
	
		Iterator<String> i2=newList.listIterator(1);
		System.out.println("iterator from 1");
		i2.forEachRemaining(System.out::println);
		
		
		Spliterator<String> i3=newList.spliterator();
		System.out.println("Spiltiterator");
		i3.forEachRemaining(System.out::println);
		
		i3.tryAdvance(System.err::println);
	}
}
