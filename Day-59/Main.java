// Problem Statement



// ﻿﻿Sharon is creating a program that finds the first repeated element in an integer array. The program should efficiently identify the first element that appears more than once in the given array. If no such element is found, it should appropriately display a message.



// Help Sharon to complete the program.

// Input format :
// The first line of input consists of an integer n, representing the number of elements in the array.

// The second line consists of n space-separated integers, representing the array elements.

// Output format :
// If a repeated element is found, print the first element that appears more than once.

// If no repeated element is found, print "No repeated element found in the array".



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ n ≤ 20

// 1 ≤ array elements ≤ 100

// Sample test cases :
// Input 1 :
// 8
// 12 21 13 14 21 36 47 21
// Output 1 :
// 21
// Input 2 :
// 5
// 15 23 15 34 23
// Output 2 :
// 15
// Input 3 :
// 6
// 14 28 32 46 54 65
// Output 3 :
// No repeated element found in the array

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for user input

        int num = sc.nextInt(); // Read the number of elements in the array
        int arr[] = new int[num]; // Declare an integer array of size num

        // Read array elements from user input
        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int firstRepeated = -1; // Variable to store the first repeated element

        // Outer loop picks an element
        for (int i = 0; i < num; i++) {
            // Inner loop checks if the element appears again later in the array
            for (int j = i + 1; j < num; j++) {
                if (arr[i] == arr[j]) { // If a duplicate is found
                    firstRepeated = arr[i]; // Store the first repeated element
                    break; // Exit the inner loop since we found a duplicate
                }
            }
            if (firstRepeated != -1) { // If a repeated element is found, exit the outer loop
                break;
            }
        }

        // Check if any repeated element was found and print the result
        if (firstRepeated == -1) {
            System.out.println("No repeated element found in the array"); // No duplicates
        } else {
            System.out.println(firstRepeated); // Print the first repeated element
        }

        sc.close(); // Close the scanner object
    }
}
