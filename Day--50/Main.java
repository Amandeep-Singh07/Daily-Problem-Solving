// Problem Statement



// Arun is tasked with creating a program that prints prime numbers within a given range. The program should take two integers, start and end, as input, and output the prime numbers between these two values (inclusive).



// Can you help him in creating the program?

// Input format :
// The input consists of two space-separated integers L and U, representing the starting range and ending range of the prime numbers.

// Output format :
// The output prints the prime numbers from the given starting range to the ending range separated by space.



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ L, U ≤ 150

// L < U

// Sample test cases :
// Input 1 :
// 1 23
// Output 1 :
// 2 3 5 7 11 13 17 19 23 
// Input 2 :
// 23 69
// Output 2 :
// 23 29 31 37 41 43 47 53 59 61 67

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int U = sc.nextInt();

        for (int i = L; i <= U; i++) {
            if (i < 2)
                continue; // Skip numbers less than 2

            boolean isPrime = true; // Assume the number is prime

            for (int j = 2; j < i; j++) { // Check divisibility from 2 to i-1
                if (i % j == 0) {
                    isPrime = false;
                    break; // Exit loop if a divisor is found
                }
            }

            if (isPrime) {
                System.out.print(i + " "); // Print only if it's a prime number
            }
        }

    }
}
