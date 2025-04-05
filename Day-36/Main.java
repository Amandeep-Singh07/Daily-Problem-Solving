// // take input a number than create a array of size of the input number then take another input of a number for rotation.
// // then print the array after the rotation.
// // Test case
// // input= 
// // 5
// // 1 2 3 4 5
// // 2
// // Output=
// // 4 5 1 2 3


// import java.util.*;

// class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < n; i++)
//             arr[i] = sc.nextInt();

//         int r = sc.nextInt() % n;

//         for (int i = n - r; i < n; i++)
//             System.out.print(arr[i] + " ");
//         for (int i = 0; i < n - r; i++)
//             System.out.print(arr[i] + " ");

//     }
// }



// import java.util.Scanner;

// public class ReverseNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int reverse = 0;

//         while (num != 0) {
//             reverse = reverse * 10 + num % 10;
//             num /= 10;
//         }

//         System.out.println("Reversed number: " + reverse);
//         sc.close();
//     }
// }

import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = s.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[3]);
        s.close();
    }
}



