// Problem Statement



// Rohan is learning about inheritance and polymorphism in Java. He has created a base class Animal and two subclasses Dog and Cat, each with their own implementation of the makeSound() method. Rohan wants to write a program that:



// Creates Dog and Cat objects based on user input.
// Demonstrates polymorphism by using an Animal reference to call the makeSound() method for each object.
// Calculates and displays the total number of animals created.
// Note:

// The makeSound() method in the Animal class should output "Some sound".
// The overridden makeSound() method in Dog should output "Bark".
// The overridden makeSound() method in Cat should output "Meow".


// Help Rohan implement this program.

// Input format :
// The first line of input contains an integer n, the number of Dog objects.

// The second line contains an integer m, the number of Cat objects.

// Output format :
// The output should display the sounds made by all Animals, Dog and Cat objects, one per line.

// The last line prints the total number of animals.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 0 ≤ n, m ≤ 100

// Sample test cases :
// Input 1 :
// 3
// 2
// Output 1 :
// Some sound
// Bark
// Some sound
// Bark
// Some sound
// Bark
// Some sound
// Meow
// Some sound
// Meow
// Total animals: 5
// Input 2 :
// 1
// 2
// Output 2 :
// Some sound
// Bark
// Some sound
// Meow
// Some sound
// Meow
// Total animals: 3

import java.util.Scanner; // Import Scanner for user input

// Base class representing a generic Animal
class Animal {
    // Method to make a sound (to be overridden by subclasses)
    public void makeSound() {
    }
}

// Subclass Dog that extends Animal and overrides makeSound()
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Some sound"); // Generic sound before specific sound
        System.out.println("Bark"); // Dog-specific sound
    }
}

// Subclass Cat that extends Animal and overrides makeSound()
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Some sound"); // Generic sound before specific sound
        System.out.println("Meow"); // Cat-specific sound
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to read user input

        // Read input: Number of Dog and Cat objects
        int n = sc.nextInt(); // Number of Dog objects
        int m = sc.nextInt(); // Number of Cat objects

        // Create an array of Animal references to store Dog and Cat objects
        Animal[] animals = new Animal[n + m];
        int index = 0; // Index to keep track of array position

        // Creating Dog objects and storing them in the array
        for (int i = 0; i < n; i++) {
            animals[index++] = new Dog();
        }

        // Creating Cat objects and storing them in the array
        for (int i = 0; i < m; i++) {
            animals[index++] = new Cat();
        }

        // Loop through the array and call makeSound() on each animal
        for (Animal animal : animals) {
            animal.makeSound(); // Demonstrates polymorphism
        }

        // Print the total number of animals created
        System.out.println("Total animals: " + (n + m));

        sc.close(); // Close scanner to prevent resource leak
    }
}
