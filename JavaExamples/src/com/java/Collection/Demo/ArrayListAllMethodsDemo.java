package com.java.Collection.Demo;

import java.util.*;
import java.util.function.*;

public class ArrayListAllMethodsDemo {
    public static void main(String[] args) {

        // 1. Creating ArrayList
        ArrayList<String> list = new ArrayList<>();

        // 2. add(E e)
        list.add("Apple");
        list.add("Banana");

        // 3. add(index, element)
        list.add(1, "Cherry");

        // 4. addAll(Collection)
        ArrayList<String> newFruits = new ArrayList<>(Arrays.asList("Dates", "Elderberry"));
        list.addAll(newFruits);

        // 5. addAll(index, Collection)
        list.addAll(2, Arrays.asList("Fig", "Grapes"));

        // 6. contains(Object)
        System.out.println("Contains Banana? " + list.contains("Banana"));

        // 7. get(index)
        System.out.println("Element at index 3: " + list.get(3));

        // 8. indexOf(Object)
        System.out.println("Index of Cherry: " + list.indexOf("Cherry"));

        // 9. lastIndexOf(Object)
        list.add("Apple");
        System.out.println("Last index of Apple: " + list.lastIndexOf("Apple"));

        // 10. isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // 11. iterator()
        System.out.println("\nUsing Iterator:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        // 12. listIterator()
        System.out.println("\n\nUsing ListIterator:");
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        // 13. listIterator(index)
        System.out.println("\n\nListIterator from index 2:");
        listIterator = list.listIterator(2);
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next() + " ");
        }

        // 14. remove(index)
        System.out.println("\n\nRemoved element at index 2: " + list.remove(2));

        // 15. remove(Object)
        list.remove("Apple");

        // 16. removeAll(Collection)
        list.removeAll(Arrays.asList("Banana", "Grapes"));

        // 17. removeIf(Predicate)
        list.removeIf(s -> s.startsWith("E"));

        // 18. retainAll(Collection)
        list.retainAll(Arrays.asList("Cherry", "Dates"));

        // 19. set(index, element)
        list.set(0, "Coconut");

        // 20. size()
        System.out.println("\nSize of list: " + list.size());

        // 21. forEach
        System.out.println("\nUsing forEach:");
        list.forEach(System.out::println);

        // 22. toArray()
        Object[] array = list.toArray();
        System.out.println("\nArray: " + Arrays.toString(array));

        // 23. toArray(T[] a)
        String[] strArray = list.toArray(new String[0]);
        System.out.println("Typed Array: " + Arrays.toString(strArray));

        // 24. subList(fromIndex, toIndex)
        list.add("Banana");
        list.add("Dragonfruit");
        List<String> subList = list.subList(0, 2);
        System.out.println("SubList: " + subList);

        // 25. sort(Comparator)
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + list);

        // 26. replaceAll(UnaryOperator)
        list.replaceAll(String::toUpperCase);
        System.out.println("Replaced all to uppercase: " + list);

        // 27. clone()
        @SuppressWarnings("unchecked")
		ArrayList<String> clonedList = (ArrayList<String>) list.clone();
        System.out.println("Cloned List: " + clonedList);

        // 28. ensureCapacity()
        list.ensureCapacity(20);

        // 29. trimToSize()
        list.trimToSize();

        // 30. spliterator()
        System.out.println("\nUsing Spliterator:");
        Spliterator<String> spliterator = list.spliterator();
        spliterator.forEachRemaining(System.out::println);

        // 31. clear()
        list.clear();
        System.out.println("\nAfter clear, is list empty? " + list.isEmpty());
    }
}
