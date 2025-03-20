// Problem Statement



// Janani aims to create a versatile palindrome checker capable of handling both numeric values and words. 



// The base class, PalindromeChecker, features a parameterized constructor that takes an integer as input. It includes a method, isPalindrome(), which determines whether the given integer is a palindrome. Include a method displayResult() to print the result of the palindrome check for numbers.



// The subclass, WordPalindromeChecker, is derived from the base class. This subclass overrides the isPalindrome() method to accommodate word inputs, treating them case-insensitively. The overridden displayResult() method ensures that the outcome of the word palindrome check is appropriately printed.



// Create instances of both classes in the main class and display the results.

// Input format :
// The first line of input consists of an integer representing the number to check for palindrome.

// The second line consists of a string containing both lowercase and uppercase letters, as well as spaces, which is checked for word palindrome(Case-insensitive, Space-sensitive).

// Output format :
// If the given integer is a palindrome, the first line of output prints "The number is a palindrome."

// Else, print "The number is not a palindrome."

// If the given string is a palindrome, the second line of output prints "The word is a palindrome."

// Else, print "The word is not a palindrome."



// Refer to the sample output for formatting specifications.

// Code constraints :
// 1 ≤ input integer ≤ 109

// length of string < 50

// The strings are case-insensitive.

// Sample test cases :
// Input 1 :
// 121
// madam
// Output 1 :
// The number is a palindrome.
// The word is a palindrome.
// Input 2 :
// 15651
// raar world
// Output 2 :
// The number is a palindrome.
// The word is not a palindrome.
// Input 3 :
// 1563
// Malayalam
// Output 3 :
// The number is not a palindrome.
// The word is a palindrome.
// Input 4 :
// 45789
// java
// Output 4 :
// The number is not a palindrome.
// The word is not a palindrome.
// Input 5 :
// 1
// race
// Output 5 :
// The number is a palindrome.
// The word is not a palindrome.

import java.util.Scanner;

// Base class for checking palindrome numbers
class PalindromeChecker {
    int number;

    // Constructor to initialize the number
    PalindromeChecker(int number) {
        this.number = number;
    }

    // Method to check if the number is a palindrome
    public boolean isPalindrome() {
        int num1 = number; // Store original number
        int revnum = 0;
        int temp = number; // Use a temporary variable to avoid modifying the original number

        while (temp > 0) {
            int a = temp % 10; // Extract last digit
            revnum = revnum * 10 + a; // Build the reversed number
            temp /= 10; // Remove last digit
        }
        return (revnum == num1); // Check if original and reversed numbers match
    }

    // Method to display the result
    public String displayResult() {
        String result;
        if (isPalindrome()) {
            result = "The number is a palindrome.";
        } else {
            result = "The number is not a palindrome.";
        }
        System.out.println(result); // Print the result
        return result;
    }
}

// Class for checking palindrome words
class WordPalindromeChecker {
    String word;

    // Constructor to initialize the word
    WordPalindromeChecker(String word) {
        this.word = word;
    }

    // Method to check if the word is a palindrome
    public boolean isPalindrome() {
        String word1 = word.toLowerCase(); // Convert to lowercase for case-insensitive comparison
        String sb = new StringBuilder(word1).reverse().toString(); // Reverse the string
        return sb.equals(word1); // Compare original and reversed strings
    }

    // Method to display the result
    public String displayResult() {
        String result;
        if (isPalindrome()) {
            result = "The word is a palindrome.";
        } else {
            result = "The word is not a palindrome.";
        }
        System.out.println(result); // Print the result
        return result;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt(); // Read number input

        PalindromeChecker numberChecker = new PalindromeChecker(number);
        numberChecker.displayResult(); // Check and print palindrome result for number

        scanner.nextLine(); // Consume leftover newline character
        String word = scanner.nextLine(); // Read word input

        WordPalindromeChecker wordChecker = new WordPalindromeChecker(word);
        wordChecker.displayResult(); // Check and print palindrome result for word

        scanner.close(); // Close scanner to prevent resource leak
    }
}
