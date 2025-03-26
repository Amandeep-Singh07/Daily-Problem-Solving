// ﻿Alex is fascinated by mountains and valleys. He defines a peak element as an element that is strictly greater than its neighbours. 



// Given an array of integers, help Alex find a peak element and its index.

// Input format :
// The first line of input consists of an integer N, representing the size of the array.

// The second line consists of N space-separated integers, representing the elements of the array.

// Output format :
// The output prints "Peak Element: X at index Y" where X and Y are integers representing the peak element and index of the peak element (index starts from 0)



// Refer to the sample output for formatting specifications.

// Code constraints :
// 1 ≤ N ≤ 10

// Sample test cases :
// Input 1 :
// 5
// 1 3 20 4 1
// Output 1 :
// Peak Element: 20 at index 2
// Input 2 :
// 4
// 7 4 3 8
// Output 2 :
// Peak Element: 8 at index 3

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int flag = 0;
        int greatest = 0;
        for (int i = 0; i < num; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
                flag = i;
            }
        }
        System.out.println("Peak Element: " + greatest + " at index " + flag);

    }
}

// another easy question on array
// Problem Statement



// Arun is given an array of integers. His task is to find the product of elements at odd positions in the array.



// Write a program to help Arun that takes an integer N as input, representing the size of the array, followed by N integers representing the elements of the array. The program should then calculate and print the product of elements at odd positions.

// Input format :
// The first line of input consists of an integer N, representing the number of elements in the array.

// The second line consists of N space-separated integers, representing the elements of the array.

// Output format :
// The output prints the product of elements at odd positions. Position starts from 1.



// ﻿Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 ≤ N ≤ 15

// 0 ≤ array elements ≤ 100

// Sample test cases :
// Input 1 :
// 4
// 4 0 2 1
// Output 1 :
// 8
// Input 2 :
// 5
// 1 5 7 9 2
// Output 2 :
// 14
// Input 3 :
// 5
// 1 7 0 8 9
// Output 3 :
// 0

// import java.util.Scanner;

// class Main {
//     // You are using Java
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int num = sc.nextInt();
//         int arr[] = new int[num];

//         for (int i = 0; i < num; i++) {
//             arr[i] = sc.nextInt();
//         }
//         int product = 1;
//         for (int i = 0; i < num; i += 2) {
//             product *= arr[i];
//         }
//         System.out.println(product);

//     }
// }