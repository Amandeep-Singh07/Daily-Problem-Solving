// Problem Statement



// Oliver is creating a mathematical tool to calculate the product of all non-zero digits in a given number. He wants to develop a program that reads an integer input, uses a for-each loop to iterate through each digit, and computes the product of the non-zero digits.



// Can you assist Oliver in this?

// Input format :
// The input consists of a single integer n, representing the number for which Oliver wants to calculate the product of all non-zero digits.

// Output format :
// The output prints an integer representing the product of all non-zero digits in the given integer.



// Refer to the sample output for formatting specifications.﻿

// Code constraints :
// 1 ≤ n ≤ 1010

// Sample test cases :
// Input 1 :
// 1089
// Output 1 :
// 72
// Input 2 :
// 123
// Output 2 :
// 6
// Input 3 :
// 50140
// Output 3 :
// 20

import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int product = 1;

        while (num > 0) {
            int a = num % 10;
            if (a != 0) {
                product *= a;
            }
            num /= 10;
        }

        System.out.println(product);
    }
}
