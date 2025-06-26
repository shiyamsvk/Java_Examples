package com.java.Example;

import java.util.*;
import java.util.stream.Collectors;

public class LinkedListImplMethodsDemo {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // 1. add(E e)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // 2. add(int index, E element)
        fruits.add(1, "Orange");

        // 3. addFirst(E e), addLast(E e)
        fruits.addFirst("Pineapple");
        fruits.addLast("Grapes");

        // 4. offer(E e), offerFirst(E e), offerLast(E e)
        fruits.offer("Watermelon");
        fruits.offerFirst("Strawberry");
        fruits.offerLast("Kiwi");

        // 5. get(), getFirst(), getLast()
        System.out.println("First: " + fruits.getFirst());
        System.out.println("Last: " + fruits.getLast());
        System.out.println("Element at index 2: " + fruits.get(2));

        // 6. peek(), peekFirst(), peekLast()
        System.out.println("Peek: " + fruits.peek());
        System.out.println("Peek First: " + fruits.peekFirst());
        System.out.println("Peek Last: " + fruits.peekLast());

        // 7. remove(), removeFirst(), removeLast()
        fruits.remove(); // removes first
        fruits.removeFirst();
        fruits.removeLast();

        // 8. poll(), pollFirst(), pollLast()
        fruits.poll();       // removes first
        fruits.pollFirst();  // same as above
        fruits.pollLast();   // removes last

        // 9. set(int index, E element)
        fruits.set(0, "Guava");

        // 10. contains(Object o)
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 11. indexOf(), lastIndexOf()
        fruits.add("Banana");
        System.out.println("First Index of Banana: " + fruits.indexOf("Banana"));
        System.out.println("Last Index of Banana: " + fruits.lastIndexOf("Banana"));

        // 12. size(), isEmpty()
        System.out.println("Size: " + fruits.size());
        System.out.println("Is Empty? " + fruits.isEmpty());

        // 13. clone()
        LinkedList<String> clonedList = (LinkedList<String>)fruits.clone();
        System.out.println("Cloned List: " + clonedList);

        // 14. toArray()
        Object[] array = fruits.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // 15. iterator(), descendingIterator()
        System.out.println("Using Iterator:");
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("Using Descending Iterator:");
        Iterator<String> descItr = fruits.descendingIterator();
        while (descItr.hasNext()) {
            System.out.println(descItr.next());
        }

        // 16. clear()
        fruits.clear();
        System.out.println("After clear, is empty? " + fruits.isEmpty());

        // Java 8 feature: forEach
        System.out.println("Using forEach with Lambda:");
        clonedList.forEach(item -> System.out.println("Fruit: " + item));

        // Java 8 feature: stream API
        System.out.println("Fruits starting with B:");
        List<String> bFruits = clonedList.stream()
                .filter(f -> f.startsWith("B"))
                .collect(Collectors.toList());
        bFruits.forEach(System.out::println);
    }
}

