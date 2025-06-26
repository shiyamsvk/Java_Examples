package com.java.Example;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListAllMethodsDemo {
    public static void main(String[] args) {
        // 🔹 1. Create an ArrayList
        ArrayList<String> names = new ArrayList<>();

        // 🔹 2. Add elements
        names.add("Raj");
        names.add("Priya");
        names.add("Arun");
        names.add("Kumar");
        names.add("Priya"); // duplicate allowed

        // 🔹 3. Display using forEach (Java 8)
        System.out.println("Original List:");
        names.forEach(System.out::println);

        // 🔹 4. Add element at specific index
        names.add(2, "Divya");

        // 🔹 5. Get element
        System.out.println("\nElement at index 3: " + names.get(3));

        // 🔹 6. Set element
        names.set(1, "Preethi");

        // 🔹 7. Check contains
        System.out.println("\nContains 'Raj'? " + names.contains("Raj"));

        // 🔹 8. IndexOf and LastIndexOf
        System.out.println("First Index of 'Priya': " + names.indexOf("Priya"));
        System.out.println("Last Index of 'Priya': " + names.lastIndexOf("Priya"));

        // 🔹 9. Remove by index and object
        names.remove("Kumar");
        names.remove(2);

        // 🔹 10. Size
        System.out.println("\nSize of list: " + names.size());

        // 🔹 11. isEmpty
        System.out.println("Is list empty? " + names.isEmpty());

        // 🔹 12. Sorting using lambda
        names.sort((a, b) -> a.compareTo(b));
        System.out.println("\nSorted List:");
        names.forEach(System.out::println);

        // 🔹 13. Java 8 stream filter (names starting with 'P')
        System.out.println("\nNames starting with 'P':");
        names.stream()
             .filter(n -> n.startsWith("P"))
             .forEach(System.out::println);

        // 🔹 14. RemoveIf (Java 8)
        names.removeIf(n -> n.startsWith("P"));
        System.out.println("\nList after removing names starting with 'P':");
        names.forEach(System.out::println);

        // 🔹 15. Convert to Array
        Object[] nameArray = names.toArray();
        System.out.println("\nArray:");
        for (Object n : nameArray) {
            System.out.println(n);
        }

        // 🔹 16. Clear all elements
        names.clear();
        System.out.println("\nAfter clear(): " + names);

        // 🔹 17. equals() check
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println("\nList1 equals List2? " + list1.equals(list2));
    }
}

