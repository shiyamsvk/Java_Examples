package com.java.Collection.Main;

import java.util.Scanner;
import java.util.LinkedList;
import com.java.Collection.Services.LinkedListExample;

public class LinkedListMain {

	public static void main(String[] args) {
		// Linkedlist Operations like (Insert,Delete, Search, Display)Values based on user Input
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();
		int choice=0;
		while (true) {
			System.out.println("\n---- LinkedList Menu ----");
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
			choice = sc.nextInt();
			boolean listReply = LinkedListExample.linkedListOperation(list,choice);
			if(listReply)
			{
				System.out.println("Operation Done");
			}
			else
			{
				break;
			}
		}
		sc.close();
	}
}