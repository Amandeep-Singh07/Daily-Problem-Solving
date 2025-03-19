// Problem Statement



// Alice, a math teacher, is creating a programming exercise to help her students practice multiplying all the odd digits of a given integer. She wants to create a simple program that takes a positive integer input and finds the product of its odd digits.



// Help Alice to complete the program using the 'while' loop.

// Input format :
// The input consists of a single positive integer N.

// Output format :
// The output displays the product of odd digits in the given integer N.

// If no odd digits are found in N, display "No odd digits found".



// Refer to the sample output for formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ N ≤ 106

// Sample test cases :
// Input 1 :
// 732
// Output 1 :
// 21
// Input 2 :
// 2468
// Output 2 :
// No odd digits found
// Input 3 :
// 467
// Output 3 :
// 7



import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a;
        int res = 1;
        boolean founded = false;
        while (num > 0) {
            a = num % 10;
            if (a % 2 != 0) {
                res *= a;
                founded = true;
            }
            num /= 10;
        }

        if (!founded) {
            System.out.println("No odd digits found");
        } else {

            System.out.println(res);
        }
    }
}