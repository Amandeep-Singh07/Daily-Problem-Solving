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

    public void printRotatedArray() {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextInt();
        }
        int m = sc.nextInt();
    }

}






























// int arr[];

// public ArrayRotator(int[] originalArray, int positions) {
//         this.arr=originalArray;
//         for(int i=0;i<positions;i++){
//             rotateByOne();
//         }
//     }

// public void rotateByOne() {
//     int n = arr.length;
//     int last = arr[n - 1];

//     for (int j = n - 1; j > 0; j--) {
//         arr[j] = arr[j - 1];
//     }
//     arr[0] = last;
// }









// for(

// int i = 0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }











//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int arr[] = new int[n];

//        for(
//        int i = 0;i<n;i++)
//        {
//            arr[i] = sc.nextInt();
//        }

//        int m = sc.nextInt();

//        ArrayRotator ob = new ArrayRotator(arr, m);ob.printRotatedArray();
//    
