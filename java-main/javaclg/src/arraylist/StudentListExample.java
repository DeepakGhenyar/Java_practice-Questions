package arraylist;

import java.util.*;

// Student class with name and roll number
class Student {
    private String name;
    private int rollNo;

    // Constructor
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    // To display student info
    @Override
    public String toString() {
        return "Student{name='" + name + "', rollNo=" + rollNo + "}";
    }
}

public class StudentListExample {
    public static void main(String[] args) {
        // Create an ArrayList to store Student objects
        List<Student> students = new ArrayList<>();

        // Add Student objects
        students.add(new Student("Dhruv", 101));
        students.add(new Student("Radhika", 102));
        students.add(new Student("Raj", 103));
        students.add(new Student("Sanskriti", 104));

        // Display all students
        System.out.println("List of Students:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
