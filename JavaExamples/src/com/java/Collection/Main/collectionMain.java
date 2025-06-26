package com.java.Collection.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.java.Collection.Services.ArrayListExample;
import com.java.Collection.Services.LinkedListExample;

public class collectionMain {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your Choice 1. ArrayList 2. LinkedList based on your choice");

		int ch = sc.nextInt();
		ArrayList<Integer> list = null;
		LinkedList<Integer> list1 = null;
		boolean listReply = false;
		int choice = 0;
		if (ch == 1) {
			System.out.println("*********************WELCOME TO ARRAYLIST*********************");
			list = new ArrayList<Integer>();
//			choice = getInput();
//			listReply = ArrayListExample.ArrayListOperation(list, choice);
		} else {
			System.out.println("*********************WELCOME TO LINKEDLIST*********************");
			list1 = new LinkedList<>();
//			choice = getInput();
//			listReply = LinkedListExample.linkedListOperation(list, choice);
		}
		while (true) {

			if (ch == 1) {
//				ArrayList<Integer> list = new ArrayList<Integer>();
				choice = getInput();
				listReply = ArrayListExample.ArrayListOperation(list, choice);
			} else {
//				LinkedList<Integer> list = new LinkedList<>();
				choice = getInput();
				listReply = LinkedListExample.linkedListOperation(list1, choice);
			}

			if (listReply) {
				System.out.println("Operation Done");
			} else {
				break;
			}
		}
		sc.close();
	}

	private static int getInput() {
		// TODO Auto-generated method stub
		System.out.println("1. Insert at Beginning");
		System.out.println("2. Insert at End");
		System.out.println("3. Insert at Position");
		System.out.println("4. Delete from Beginning");
		System.out.println("5. Delete from End");
		System.out.println("6. Delete from Position");
		System.out.println("7. Search Element");
		System.out.println("8. Display List");
		System.out.println("9. Exit");
		System.out.print("Choose an option: ");
		int choice = sc.nextInt();
		return choice;
	}
}
