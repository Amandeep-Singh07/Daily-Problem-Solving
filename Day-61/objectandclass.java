// Problem Statement



// Samantha wants to develop a program to organize a set of numbers in an array. The program should accept the array size (n) and n integers as input, categorize them as even and odd, and display the grouped numbers.



// It should contain a class called NumberClassifier with attributes including n (array size) and an array to store input numbers.

// Input format :
// The first line consists of an integer n, representing the size of the array.

// The second line consists of n space-separated integers representing the array elements.

// Output format :
// The first line prints "Even numbers:" followed by the even numbers from the given array, separated by a space.

// The second line prints "Odd numbers:" followed by the odd numbers from the given array, separated by a space.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ n ≤ 10

// 1 ≤ Each element in the array ≤ 1000

// Sample test cases :
// Input 1 :
// 5
// 9 2 11 4 8
// Output 1 :
// Even numbers: 2 4 8 
// Odd numbers: 9 11 
// Input 2 :
// 10
// 6 2 4 3 7 13 11 10 15 22
// Output 2 :
// Even numbers: 6 2 4 10 22 
// Odd numbers: 3 7 13 11 15 


import java.util.Scanner;

class NumberClassifier {
    int n;
    int[] evenNumbers = new int[10]; // Max size is 10 (as per constraints)
    int[] oddNumbers = new int[10];
    int evenCount = 0;
    int oddCount = 0;

    public void classifyNumbers(int[] arr) {
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers[evenCount++] = arr[i];
            } else {
                oddNumbers[oddCount++] = arr[i];
            }
        }
    }

    public void printEvenNumbers(int[] arr) {
        System.out.print("Even numbers: ");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println();
    }

    public void printOddNumbers(int[] arr) {
        System.out.print("Odd numbers: ");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumbers[i] + " ");
        }
        System.out.println();
    }
}

public class objectandclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        NumberClassifier obj = new NumberClassifier();
        obj.n = scanner.nextInt();
        int[] arr = new int[obj.n];

        for (int i = 0; i < obj.n; i++) {
            arr[i] = scanner.nextInt();
        }

        obj.classifyNumbers(arr);
        obj.printEvenNumbers(arr);
        obj.printOddNumbers(arr);

        scanner.close();
    }
}