package OOP_CO3.Collections;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering: sort by marks ascending
    @Override
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    @Override
    public String toString() {
        return name + " : " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> Student = new ArrayList<Student>();
        Student.add(new Student("Alice", 85));
        Student.add(new Student("Bob", 75));
        Student.add(new Student("Charlie", 95));
        Student.add(new Student("Charlie1", 65));
        Collections.sort(Student);  // Uses compareTo
        System.out.println(Student);
    }
}






// (a,b) -> sys.out.println(a+" " + b+" " (a+b))





