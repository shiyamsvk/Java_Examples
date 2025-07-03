package com.java.Example;

import java.util.*;
import java.util.function.*;

public class HashMapMethods {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // put() - Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // putIfAbsent()
        map.putIfAbsent(2, "Blueberry"); // Won't overwrite
        map.putIfAbsent(4, "Date");

        // get() and getOrDefault()
        System.out.println("Key 2: " + map.get(2)); // Banana
        System.out.println("Key 5 or Default: " + map.getOrDefault(5, "No Fruit"));

        // containsKey() and containsValue()
        System.out.println("Contains Key 3? " + map.containsKey(3));
        System.out.println("Contains Value 'Apple'? " + map.containsValue("Apple"));

        // computeIfAbsent()
        map.computeIfAbsent(5, key -> "Elderberry");

        // computeIfPresent()
        map.computeIfPresent(1, (key, val) -> val + " Pie");

        // compute()
        map.compute(6, (key, val) -> (val == null) ? "Fig" : val + " Jam");

        // merge()
        map.merge(3, " Cake", (oldVal, newVal) -> oldVal + newVal);

        // replace()
        map.replace(2, "Banana", "Blackberry");
        map.replace(6, "Fig");

        // remove()
        map.remove(4); // Remove by key
        map.remove(3, "Cherry"); // Won't remove
        map.remove(3, "Cherry Cake"); // Will remove

        // replaceAll()
        map.replaceAll((k, v) -> v.toUpperCase());

        // forEach()
        System.out.println("\nMap Entries:");
        map.forEach((k, v) -> System.out.println(k + " => " + v));

        // keySet(), entrySet(), values()
        System.out.println("\nKeys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        // size() and isEmpty()
        System.out.println("\nSize: " + map.size());
        System.out.println("Is Empty? " + map.isEmpty());

        // clone() (shallow copy)
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) map.clone();
        System.out.println("Cloned Map: " + clonedMap);

        // clear()
        map.clear();
        System.out.println("After clear(), map is empty? " + map.isEmpty());
    }
}

