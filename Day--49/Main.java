// Problem Statement



// In a coding competition, you are tasked with a unique problem. You need to write a program that calculates the sum of the squares of the odd digits in a given integer. 

// Input format :
// The input consists of a single integer N, representing the number whose odd digits will be squared and summed.

// Output format :
// The output prints an integer, representing the sum of the squares of the odd digits in the given integer.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ N ≤ 106

// Sample test cases :
// Input 1 :
// 12345
// Output 1 :
// 35
// Input 2 :
// 2085
// Output 2 :
// 25
// Input 3 :
// 2468
// Output 3 :
// 0

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object to read input
        
        int num = sc.nextInt(); // Read an integer from the user
        int sum = 0; // Variable to store the sum of squares of odd digits
        int count = 0; // Variable to count the number of odd digits (not required for output, but can be useful)
        
        while (num > 0) { // Loop until all digits are processed
            int a = num % 10; // Extract the last digit
            
            if (a % 2 != 0) { // Check if the digit is odd
                count++; // Increment odd digit count
                sum += a * a; // Add square of the odd digit to sum
            }
            
            num /= 10; // Remove the last digit from the number
        }
        
        System.out.println(sum); // Print the final sum of squares of odd digits
        
        sc.close(); // Close the scanner to prevent resource leak
    }
}
