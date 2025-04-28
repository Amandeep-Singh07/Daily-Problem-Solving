// Problem Statement



// Harry is developing a graphics application that allows users to calculate the area of different shapes. Users can input the shape type (either SQUARE or TRIANGLE) and relevant dimensions. 



// The task is to write a program to accommodate the SQUARE and TRIANGLE shapes in the enum Shape to find the area of squares and triangles.



// Formula :

// Area of square = sideLength * sideLength

// Area of triangle = 0.5 * base * height

// Input format :
// The first line of input consists of a string, representing the shape (SQUARE or TRIANGLE).

// If the shape is 'SQUARE', the second line consists of double value a, representing the side of the square.

// If the shape is 'TRIANGLE', the second line consists of two double values b and h, representing the base and height of the triangle, respectively.

// Output format :
// If the shape type is valid, print the area of the shape. If the shape type is invalid, print "Invalid Input".



// Refer to the sample output for formatting specifications.

// Code constraints :
// The input is case-insensitive.

// 0.1 ≤ a , b , h ≤ 100.0

// Sample test cases :
// Input 1 :
// SqUARe
// 5.5
// Output 1 :
// 30.25
// Input 2 :
// CIRCLE
// Output 2 :
// Invalid Input
// Input 3 :
// TRIANGLE
// 4.0
// 6.0
// Output 3 :
// 12.0

// You are using Java
import java.util.*;

enum Shape {
    SQUARE, TRIANGLE;
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toUpperCase();

        try {
            Shape shape = Shape.valueOf(input); // here we have converted input to ennumm

            if (shape == Shape.SQUARE) {
                double len = sc.nextDouble();
                System.out.println(len * len);
            } else if (shape == Shape.TRIANGLE) {
                double len = sc.nextDouble();
                double len1 = sc.nextDouble();
                System.out.println(0.5 * len * len1);
            }
        } catch (Exception e) {
            System.out.println("Invalid Input");
        }
    }
}

// Problem Statement

// Ram wants
// to create
// a program
// that utilizes
// an enumeration
// GameLevel to
// assign difficulty
// levels to
// players based
// on their
// scores in
// a game.
// The difficulty
// levels are
// categorized as EASY,MEDIUM,
// and HARD.

// Your task
// is to
// implement a
// program to
// help Ram
// with the
// following requirements:

// Define an
// enumeration GameLevel
// with values:EASY,MEDIUM,
// HARD.Implement a
// program that
// takes a player's
// score as
// input and
// determines their
// difficulty level
// using the
// following criteria:
// If the player's
// score is between 0 and 50(
// both inclusive),
// the difficulty
// level is
// EASY.If the player's
// score is
// greater than 50
// and up to 75(inclusive),
// the difficulty
// level is
// MEDIUM.If the player's
// score is
// greater than 75,
// the difficulty
// level is
// HARD.

//         Help Ram
// with the
// implementation.

//         Input format:
// The input
// consists of
// an integer S,
// representing the player's
// score.

//         Output format:
// The output
// prints the
// assigned difficulty level for
// the player.

// Refer to
// the sample output for
// formatting specifications.

// Code constraints:

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

// You are using Java
// import java.util.*;

// enum GameLevel {
//     EASY, MEDIUM, HARD
// }

// class Main {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int num = sc.nextInt();

//         GameLevel level;
//         if (num >= 0 && num <= 50) {
//             level = GameLevel.EASY;
//             System.out.println(level);
//         } else if (num > 50 && num <= 75) {
//             level = GameLevel.MEDIUM;
//             System.out.println(level);
//         } else {
//             level = GameLevel.HARD;
//             System.out.println(level);
//         }

//     }
// }