// Array Rotation

// Problem Statement


// Goutham is given the task of developing a program that efficiently shuffles the elements of an array. He wants to create a ArrayRotator class with a constructor that takes an array and the number of positions to rotate in the right. Users input the array size and elements, specify the rotating positions, and print the rearranged sequence.


// Assist Goutham in developing the program.

// Input format :
// The first line of input consists of an integer N, representing the elements of the array.

// The second line consists of N space-separated integers representing the array elements.

// The third line consists of an integer M, representing the number of positions to rotate.

// Output format :
// The output prints the rearranged array of elements, containing N integers, after rotating the array by M positions.


// Refer to the sample output for formatting specifications.

// Code constraints :
// 1 ≤ N ≤ 10

// 1 ≤ array elements ≤ 100

// M < N

// Sample test cases :
// Input 1 :
// 7
// 3 6 9 8 5 2 1
// 3
// Output 1 :
// 5 2 1 3 6 9 8
// Input 2 :
// 5
// 63 95 74 65 98
// 1
// Output 2 :
// 98 63 95 74 65



import java.util.Scanner;

class ArrayRotator {
    private int[] rarr;

    // Constructor: Rotates arr to the left by leftShift positions
    public ArrayRotator(int[] arr, int leftShift) {
        int n = arr.length;
        rarr = new int[n];
        for (int i = 0; i < n; i++) {
            rarr[i] = arr[(i + leftShift) % n];
        }
    }

    public void printRotatedArray() {
        for (int i = 0; i < rarr.length; i++) {
            System.out.print(rarr[i]);
            if (i < rarr.length - 1) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rightShift = sc.nextInt();

        // To rotate RIGHT by rightShift positions, convert to LEFT rotation by n -
        // rightShift
        int leftShift = n - rightShift;

        ArrayRotator rotator = new ArrayRotator(arr, leftShift);
        rotator.printRotatedArray();
    }
}

