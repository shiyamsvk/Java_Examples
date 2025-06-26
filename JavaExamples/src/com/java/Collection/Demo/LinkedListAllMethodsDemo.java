package com.java.Collection.Demo;

import java.util.*;

public class LinkedListAllMethodsDemo {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add(E e), add(int index, E element)
        list.add("Banana");
        list.add("Apple");
        list.add(1, "Mango");

        // addFirst(E e), addLast(E e)
        list.addFirst("Orange");
        list.addLast("Pineapple");

        // offer(E e), offerFirst(E e), offerLast(E e)
        list.offer("Guava");
        list.offerFirst("Kiwi");
        list.offerLast("Papaya");

        // peek(), peekFirst(), peekLast()
        System.out.println("peek(): " + list.peek());
        System.out.println("peekFirst(): " + list.peekFirst());
        System.out.println("peekLast(): " + list.peekLast());

        // poll(), pollFirst(), pollLast()
        System.out.println("poll(): " + list.poll());
        System.out.println("pollFirst(): " + list.pollFirst());
        System.out.println("pollLast(): " + list.pollLast());

        // push(E e), pop()
        list.push("Strawberry");
        System.out.println("After push: " + list);
        System.out.println("Pop: " + list.pop());

        // get(index), getFirst(), getLast()
        System.out.println("get(2): " + list.get(2));
        System.out.println("getFirst(): " + list.getFirst());
        System.out.println("getLast(): " + list.getLast());

        // contains(Object o), indexOf(), lastIndexOf()
        System.out.println("Contains Mango? " + list.contains("Mango"));
        System.out.println("Index of Apple: " + list.indexOf("Apple"));
        list.add("Apple");
        System.out.println("Last index of Apple: " + list.lastIndexOf("Apple"));

        // remove(), remove(index), remove(Object), removeFirst(), removeLast()
        list.remove();  // head
        list.remove(1);
        list.remove("Mango");
        list.removeFirst();
        list.removeLast();

        // removeFirstOccurrence, removeLastOccurrence
        list.removeFirstOccurrence("Apple");
        list.removeLastOccurrence("Apple");

        // addAll(Collection)
        List<String> moreFruits = Arrays.asList("Fig", "Grapes", "Watermelon");
        list.addAll(moreFruits);

        // addAll(index, Collection)
        list.addAll(1, Arrays.asList("Dates", "Blueberry"));

        // listIterator(index)
        System.out.println("\nList from index 2:");
        ListIterator<String> listIterator = list.listIterator(2);
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        // descendingIterator()
        System.out.println("\n\nDescending order:");
        Iterator<String> descending = list.descendingIterator();
        while (descending.hasNext()) {
            System.out.print(descending.next() + " ");
        }

        // set(index, E element)
        list.set(0, "Jackfruit");

        // size()
        System.out.println("\n\nSize: " + list.size());

        // clone()
        @SuppressWarnings("unchecked")
		LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned List: " + clonedList);

        // removeIf
        list.removeIf(s -> s.startsWith("G"));

        // toArray()
        Object[] array = list.toArray();
        System.out.println("toArray(): " + Arrays.toString(array));

        // toArray(T[] a)
        String[] strArray = list.toArray(new String[0]);
        System.out.println("toArray(T[]): " + Arrays.toString(strArray));

        // spliterator
        System.out.println("\nUsing Spliterator:");
        Spliterator<String> spliterator = list.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // forEach
        System.out.println("\nUsing forEach:");
        list.forEach(System.out::println);

        // clear()
        list.clear();
        System.out.println("\nIs list empty after clear? " + list.isEmpty());
    }
}