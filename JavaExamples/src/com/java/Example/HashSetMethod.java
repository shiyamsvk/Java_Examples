package com.java.Example;

import java.util.*;
import java.util.function.Predicate;

public class HashSetMethod {
    public static void main(String[] args) {

        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // add(E e)
        set.add("Shiyam");
        set.add("Raja");
        set.add("Shiva");
        set.add("Shiyam"); // Duplicate won't be added

        // size()
        System.out.println("Size of set: " + set.size());

        // contains(Object o)
        System.out.println("Contains 'Shiva'? " + set.contains("Shiva"));
        System.out.println("Contains 'Shiyam'? " + set.contains("Shiyam"));

        // isEmpty()
        System.out.println("Is set empty? " + set.isEmpty());

        // iterator()
        System.out.println("\nIterating using Iterator:");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // forEach()
        System.out.println("\nIterating using forEach:");
        set.forEach(System.out::println);

        // remove(Object o)
        set.remove("Cherry");
        System.out.println("\nAfter removing 'Cherry': " + set);

        // addAll(Collection)
        Set<String> moreFruits = new HashSet<>(Arrays.asList("Ram", "Seetha", "Ragu Ram"));
        set.addAll(moreFruits);
        System.out.println("After addAll(): " + set);

        // containsAll(Collection)
        System.out.println("Contains all [Ram, Seetha]? " + set.containsAll(Arrays.asList("Ram", "Seetha")));

        // retainAll(Collection)
        set.retainAll(Arrays.asList("Seetha", "Ram"));  // Keep only specified
        System.out.println("After retainAll(): " + set);

        // removeAll(Collection)
        set.removeAll(Arrays.asList("Seetha"));  // Remove specified
        System.out.println("After removeAll(): " + set);

        // removeIf(Predicate)
        set.removeIf(s -> s.startsWith("R"));
        System.out.println("After removeIf(): " + set);

        // clone()
        set.add("Dragonfruit");
        
        @SuppressWarnings("unchecked")
		HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned set: " + clonedSet);

        // toArray()
        Object[] objArray = set.toArray();
        System.out.println("toArray(): " + Arrays.toString(objArray));

        // toArray(T[] a)
        String[] strArray = set.toArray(new String[0]);
        System.out.println("toArray(T[]): " + Arrays.toString(strArray));

        // spliterator()
        System.out.println("\nUsing Spliterator:");
        Spliterator<String> spliterator = set.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // stream() and parallelStream()
        System.out.println("\nUsing Stream:");
        set.stream().forEach(System.out::println);

        System.out.println("\nUsing ParallelStream:");
        set.parallelStream().forEach(System.out::println);

        // clear()
        set.clear();
        System.out.println("\nSet after clear: " + set);
        System.out.println("Is empty after clear? " + set.isEmpty());
    }
}
