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

// Problem Statement



// Danny is developing a scheduling application that needs to determine the next meeting day based on the current day. 



// The application allows users to input the current day, and it then determines and displays the next day for scheduling meetings. Write the program that uses the enum concept to implement this feature. 

// Input format :
// The input consists of a single string representing the day of the week.

// Output format :
// If the input is a valid day of the week, print the name of the next day in upper case.

// If the input is not a valid day of the week, print "Invalid Input".



// Refer to the sample output for the formatting specifications.

// Code constraints :
// The input is case-insensitive.

// enum name: Day

// Sample test cases :
// Input 1 :
// MONDAY
// Output 1 :
// TUESDAY
// Input 2 :
// FriDay
// Output 2 :
// SATURDAY
// Input 3 :
// Fridays
// Output 3 :
// Invalid Input

// You are using Java
// import java.util.*;

// class Main {
//     enum Day {
//         MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         String d = sc.nextLine().toUpperCase();

//         if (d.equals("MONDAY")) {
//             System.out.println(Day.TUESDAY);
//         } else if (d.equals("TUESDAY")) {
//             System.out.println(Day.WEDNESDAY);

//         } else if (d.equals("WEDNESDAY")) {
//             System.out.println(Day.THURSDAY);

//         } else if (d.equals("THURSDAY")) {
//             System.out.println(Day.FRIDAY);

//         } else if (d.equals("FRIDAY")) {
//             System.out.println(Day.SATURDAY);

//         } else if (d.equals("SATURDAY")) {
//             System.out.println(Day.SUNDAY);

//         } else if (d.equals("SUNDAY")) {

//             System.out.println(Day.MONDAY);
//         } else {

//             System.out.println("Invalid Input");
//         }

//     }

// }