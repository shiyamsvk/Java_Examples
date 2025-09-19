package OOP_CO3.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class facultyRegister {
	int id;
	String name;

	facultyRegister(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + " - " + name;
	}
}

public class comparatorDemo {
	public static void main(String[] args) {
		List<facultyRegister> list = new ArrayList<>();
		list.add(new facultyRegister(1, "Kumar"));
		list.add(new facultyRegister(2, "Arun"));
		list.add(new facultyRegister(3, "Bala"));
		
		System.out.println("First  by Valus: " + list);
		
		// Sort by name
		Collections.sort(list, new Comparator<facultyRegister>() {
			public int compare(facultyRegister s1, facultyRegister s2) {
				return s1.name.compareTo(s2.name);
			}
		});
		System.out.println("order by Alphabets: " + list);
		list.add(new facultyRegister(55, "Bala1"));
		list.add(new facultyRegister(50,"Bala2"));
		System.out.println("Added enw eles: " + list);
		
		Comparator<facultyRegister> byMarks = (s1, s2) -> s1.id - s2.id;

		Collections.sort(list, byMarks);
		System.out.println("Sorted by marks: " + list);
//
//		// Custom sorting by name (alphabetical)
//		Comparator<facultyRegister> byName = (s1, s2) -> s1.name.compareTo(s2.name);
//
//		Collections.sort(list, byName);
//		System.out.println("Sorted by name: " + list);
//
//		System.out.println(list);
//
		// Custom sorting by marks descending using Lambda
		list.sort((s1, s2) -> s2.id - s1.id);
		System.out.println("Sorted by marks descending: " + list);
//
		// Custom sorting by name Decending using Lambda
		list.sort((s1, s2) -> s2.name.compareTo(s1.name));
		System.out.println("Sorted by name Decending: " + list);
	}
}
