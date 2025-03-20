// PROBLEM STATEMENT



// Janice, the principal of a reputed school, wants to register students for a competition. She needs to maintain records of student's personal details, such as their name, age, and grade level.

// Write a program with the following requirements:

// Create a base class SchoolMember that holds common attributes like name and age.
// Create a derived class Student that extends SchoolMember and adds the attribute gradeLevel.
// The program should take user input for name, age, and gradeLevel to register a student, and then display these details.
// Input format :
// The first line of input contains a string, that represents the name of the student.

// The second line of input contains an integer input that represents the age of the student

// The last line of the input contains an integer that represents the grade level of the student.

// Output format :
// The output should display as:

// "Student: <<name>>, Age:<<number>>, Grade Level: <<grade>>".



// Refer to the sample test cases for formatting Specifications.

// Code constraints :
// The inputs should be greater than zero.

// 0 < Age ≤ 150

// 0 < Grade Level ≤ 12

// Sample test cases :
// Input 1 :
// Choza
// 15
// 3
// Output 1 :
// Student: Choza, Age: 15, Grade Level: 3
// Input 2 :
// Sriman
// 18
// 4
// Output 2 :
// Student: Sriman, Age: 18, Grade Level: 4

import java.util.Scanner;

// Base class representing a general school member
class SchoolMember {
    // Currently, this class is empty but can be extended in the future
    // to include common attributes for all school members.
}

// Subclass representing a student, which extends SchoolMember
class Student extends SchoolMember {
    String name; // Student's name
    int age; // Student's age
    int gradeLevel; // Student's grade level

    // Constructor to initialize student details
    Student(String name, int age, int gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    // Getter method to retrieve the student's name
    public String getName() {
        return name;
    }

    // Getter method to retrieve the student's age
    public int getAge() {
        return age;
    }

    // Getter method to retrieve the student's grade level
    public int getGradeLevel() {
        return gradeLevel;
    }
}

// Main class to execute the program
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for student details
        String name = scanner.nextLine(); // Input: Student's name
        int age = scanner.nextInt(); // Input: Student's age
        int gradeLevel = scanner.nextInt();// Input: Student's grade level

        // Creating a Student object with user input values
        Student student = new Student(name, age, gradeLevel);

        // Displaying student details in the required format
        System.out.println("Student: " + student.getName() + ", Age: " + student.getAge() + ", Grade Level: "
                + student.getGradeLevel());

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
