
// Problem Statement



// Roshni is tasked with developing a program for concatenating two arrays provided by the user. To accomplish this, she wants to create a class named ArrayConcatenator. The class includes a constructor to concatenate the elements of the input arrays. She wants to print the elements of the resulting array.



// Help Roshni to complete the program.

// Input format :
// The first line of input consists of an integer N, representing the number of elements of the first array.

// The second line consists of N space-separated integers representing the first array elements.

// The third line consists of an integer M, representing the number of elements of the second array.

// The fourth line consists of M space-separated integers, representing the second array elements.

// Output format :
// The output prints the concatenated array of (M+N) integers, separated by spaces.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints

// 1 ≤ N, M ≤ 10

// 1 ≤ array elements ≤ 100

// Sample test cases :
// Input 1 :
// 5
// 7 8 5 6 9
// 3
// 1 4 3
// Output 1 :
// 7 8 5 6 9 1 4 3 
// Input 2 :
// 4
// 78 56 93 14
// 1
// 56
// Output 2 :
// 78 56 93 14 56 

import java.util.Scanner;

// You are using Java
class ArrayConcatenator {
    public int[] ca;

    public ArrayConcatenator(int[] firstArray, int[] secondArray) {
        int size1 = firstArray.length;
        int size2 = secondArray.length;
        ca = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            ca[i] = firstArray[i];
        }
        for (int i = 0; i < size2; i++) {
            ca[size1 + i] = secondArray[i];
        }

    }

    public void printConcatenatedArray() {
        for (int x : ca) {
            System.out.print(x + " ");
        }
    }

}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size1 = scanner.nextInt();
        int[] firstArray = new int[size1];
        for (int i = 0; i < size1; i++) {
            firstArray[i] = scanner.nextInt();
        }

        int size2 = scanner.nextInt();
        int[] secondArray = new int[size2];
        for (int i = 0; i < size2; i++) {
            secondArray[i] = scanner.nextInt();
        }

        ArrayConcatenator arrayConcatenator = new ArrayConcatenator(firstArray, secondArray);

        arrayConcatenator.printConcatenatedArray();
    }
}