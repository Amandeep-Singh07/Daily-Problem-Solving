// Problem Statement



// Ram wants to create a program that utilizes an enumeration GameLevel to assign difficulty levels to players based on their scores in a game. The difficulty levels are categorized as EASY, MEDIUM, and HARD.



// Your task is to implement a program to help Ram with the following requirements:

// Define an enumeration GameLevel with values: EASY, MEDIUM, HARD.
// Implement a program that takes a player's score as input and determines their difficulty level using the following criteria:
// If the player's score is between 0 and 50 (both inclusive), the difficulty level is EASY.
// If the player's score is greater than 50 and up to 75 (inclusive), the difficulty level is MEDIUM.
// If the player's score is greater than 75, the difficulty level is HARD.


// Help Ram with the implementation.

// Input format :
// The input consists of an integer S, representing the player's score.

// Output format :
// The output prints the assigned difficulty level for the player.



// Refer to the sample output for formatting specifications.

// Code constraints :
// enum type: EASY, MEDIUM, HARD

// 1 ≤ S ≤ 100

// Sample test cases :
// Input 1 :
// 45
// Output 1 :
// EASY
// Input 2 :
// 55
// Output 2 :
// MEDIUM
// Input 3 :
// 80
// Output 3 :
// HARD

// import java.util.*;

// enum GameLevel {
//     EASY, MEDIUM, HARD
// }

// class Main {

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         GameLevel ob = GameLevel.EASY;
//         GameLevel ob2 = GameLevel.MEDIUM;
//         GameLevel ob3 = GameLevel.HARD;
//         int num = sc.nextInt();

//         if (num >= 0 && num <= 50) {
//             System.out.println(ob);
//         } else if (num > 50 && num <= 75) {
//             System.out.println(ob2);
//         } else {
//             System.out.println(ob3);
//         }

//     }
// }

// we can do it by this way also

import java.util.*;

enum GameLevel {
    EASY, MEDIUM, HARD
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num >= 0 && num <= 50) {
            System.out.println(GameLevel.EASY);
        } else if (num > 50 && num <= 75) {
            System.out.println(GameLevel.MEDIUM);
        } else {
            System.out.println(GameLevel.HARD);
        }

        sc.close(); // Always close the Scanner to prevent memory leaks
    }
}
