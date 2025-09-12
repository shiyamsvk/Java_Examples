package OOP_CO3.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import ClassRoomDemo1.interfaceDemo;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> id = new ArrayList<>();// Creating ArrayList
		id.add(4);// insertvalues
		id.add(5);
		id.add(6);
		id.add(7);
		id.add(5);
		id.add(1);
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(66);
		list1.add(76);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);// genreally adding elements in List at the last position
		list.addAll(id);// with the help of collection add the values
		list.add(2, 55);
		list.addAll(list1);
		list.addFirst(0);
		list.addLast(100);
		
		System.err.println("Display the LinkedLisgt");
		list.forEach(System.out::println);
		
		list.offer(258);
		System.err.println("Display the after update LinkedList");
		list.forEach(System.out::println);
		
		System.err.println("iterator");
		Iterator<Integer> iter= list.iterator();
		iter.forEachRemaining(System.out::println);
		
		System.err.println("iterator in if");
//		if(iter.hasNext()) {
//			System.out.println(iter.next());
//			}
				
//		Spliterator<>

		Object[] aa=list.toArray();
		
		Integer[] a=new Integer[list.size()];
		
		list.toArray(a);
		
		System.err.println("Array:");
		for(Integer a1:a)
		{
			System.out.println(a1);
		}
		
		System.out.println("Peek:" + list.peek());
		
		System.err.println("Poll: "+list.poll());
		System.err.println("After poll");
		list.forEach(System.out::println);
	}

}
