package OOP_CO3.Collections;

import java.util.*;

//----------------- Multiple Bound Example -----------------
interface Showable {
	void show();
}

class A {
	void display() {
		System.out.println("Display from A");
	}
}

class Demo extends A implements Showable {
	public void show() {
		System.out.println("Show from Demo");
	}
}

//----------------- Generic Examples -----------------
//class Printer<T,K> { // Unbounded
//	T value;
//K VALUES1;
//	Printer(T value,K VALUES1) {
//		this.value = value;
//		this.VALUES1=VALUES1;
//	}
//
//	void print() {
//		System.out.println("Unbounded Value: " + value+" "+VALUES1);
//	}
//}

//class NumberPrinter<T extends Number> { // Upper Bound
//	T value;
//
//	NumberPrinter(T value) {
//		this.value = value;
//	}
//
//	void print() {
//		System.out.println("Upper Bound Number: " + value);
//	}
//}
//
class B<T extends A & Showable> { // Multiple Bound
	T obj;

	B(T obj) {
		this.obj = obj;
	}

	void print() {
		obj.display();
		obj.show();
	}
}

public class AllBoundsExample {

//	 Lower Bound Example
//	public static void addNumbers(List<? super Integer> list) {
//		list.add(10);
//		list.add(20);
//		System.out.println("Lower Bound List: " + list);
//	}
//
//	// Wildcard with Upper Bound
//	public static void printList(List<? extends Number> list) {
//		System.out.println("Wildcard Upper Bound List: " + list);
//	}

}
