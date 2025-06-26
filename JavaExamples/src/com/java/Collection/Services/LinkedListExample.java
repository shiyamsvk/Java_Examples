package com.java.Collection.Services;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListExample {
	
//	Linkedlist Operations like (Insert,Delete, Search, Display)Values based on user Input
	private static Scanner sc = new Scanner(System.in);

	public static boolean linkedListOperation(LinkedList<Integer> list, int option) {
		
		switch (option) {
		case 1:
			System.out.print("Enter element to insert at beginning: ");
			int first = sc.nextInt();
			list.addFirst(first);
			return true;
			
		case 2:
			System.out.print("Enter element to insert at end: ");
			int last = sc.nextInt();
			list.addLast(last);
			return true;

		case 3:
			System.out.print("Enter position (0 to " + list.size() + "): ");
			int pos = sc.nextInt();
			if (pos < 0 || pos > list.size()) {
				System.out.println("Invalid LinkedList position!");
				return true;
			}
			System.out.print("Enter element to insert: ");
			int value1 = sc.nextInt();
			list.add(pos, value1);
			return true;

		case 4:
			if (!list.isEmpty()) {
				System.out.println("Deleted from beginning: " + list.removeFirst());
			} else {
				System.out.println("List is empty!");
			}
			return true;

		case 5:
			if (!list.isEmpty()) {
				System.out.println("Deleted from end: " + list.removeLast());
			} else {
				System.out.println("List is empty!");
			}
			return true;

		case 6:
			System.out.print("Enter position to delete (0 to " + (list.size() - 1) + "): ");
			int delPos = sc.nextInt();
			if (delPos < 0 || delPos >= list.size()) {
				System.out.println("Invalid position!");
			} else {
				System.out.println("Deleted element: " + list.remove(delPos));
			}
			return true;

		case 7:
			System.out.print("Enter element to search: ");
			int search = sc.nextInt();
			int index = list.indexOf(search);
			if (index != -1) {
				System.out.println("Element found at position: " + index);
			} else {
				System.out.println("Element not found!");
			}
			return true;

		case 8:
			System.out.println("Current List: " + list);
			return true;

		case 9:
			System.out.println("Exiting...");
			sc.close();
			return false;

		default:
			System.out.println("Invalid choice!");
		}
		return false;
	}
}