package com.java.Example;

import java.util.*;

public class QueueMethod {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements using add() and offer()
        queue.add("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");

        // Display queue
        System.out.println("Queue: " + queue); // [Apple, Banana, Cherry]

        // Access head element
        System.out.println("Head (peek): " + queue.peek()); // Apple

        // Remove elements using poll() and remove()
        System.out.println("Removed (poll): " + queue.poll()); // Apple
        System.out.println("Removed (remove): " + queue.remove()); // Banana

        // Check remaining
        System.out.println("Queue after removals: " + queue); // [Cherry]

        // Size and isEmpty
        System.out.println("Size: " + queue.size());
        System.out.println("Is Empty? " + queue.isEmpty());
    }
}

