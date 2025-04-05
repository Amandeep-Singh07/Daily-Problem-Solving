// Concept used it String overriding and Character.isDigit() inbuilt function is used
// The Digit Bouncer: A Java CustomClass for Filtering Out Numbers

// Problem Statement

// Kenya is implementing a conference registration system where attendees input their names and numbers. To address privacy concerns, develop a CustomClass to filter out all the numbers in the system logs.



// Write the program to display the username without the phone number using the toString() method.

// Input format :
// The input consists of a string, representing the username that includes lowercase, uppercase, special characters, and (or) spaces.

// Output format :
// The output displays the string without any numbers keeping the other characters in the string unchanged.



// Refer to the sample output for formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ length of the input string ≤ 50 characters

// Sample test cases :
// Input 1 :
// Alex9876543210
// Output 1 :
// Alex
// Input 2 :
// John 1234567890#$
// Output 2 :
// John #$
// Input 3 :
// 98755637382 Arun@012
// Output 3 :
//  Arun@

import java.util.Scanner;


class CustomClass {
    
    String userInput;
    public CustomClass(String userInput){
        this.userInput=userInput;
    }
    
    public String toString(){
    StringBuilder res=new StringBuilder();
    
    for(int i=0;i<userInput.length();i++){
        char currentChar=userInput.charAt(i);
       
        
        if(Character.isDigit(currentChar) != true){
            res.append(currentChar);
        }
    }
    
    return res.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();

        CustomClass customObject = new CustomClass(userInput);
        System.out.println(customObject);
    }
}


// Problem Statement



// Mr. Smith, a mathematics teacher, is developing an interactive cube calculator program to engage his students. He wants the program to take the user's name and an integer as input, calculate the cube of the integer, and display a personalized message using the class CustomClass.



// Mr. Smith is interested in ensuring that the program uses the instanceof operator to check the presence of specific instances. 



// Note

// name is an instance of String class.

// customObj is an instanceof CustomClass.

// Any other instance name other than the above-mentioned will create an error.

// Input format :
// The first line of input is a string, which represents the name.

// The second line of input is an integer, n.

// Output format :
// The first line of output displays whether the entered name is an instance of String.

// The second line of output displays the cube of the entered integer.

// The third line of output displays a custom message from the CustomClass in the format "Hello, [name]!".

// The fourth line of output displays whether the instance of customObj is an instance of CustomClass.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// The string name input should be 100 characters.

// 1 ≤ n ≤ 15

// Sample test cases :
// Input 1 :
// John
// 3
// Output 1 :
// Name is an instance of String: true
// Cube of the entered number: 27
// CustomClass: Hello, John!
// customObj is an instance of CustomClass: true
// Input 2 :
// Bob
// 5
// Output 2 :
// Name is an instance of String: true
// Cube of the entered number: 125
// CustomClass: Hello, Bob!
// customObj is an instance of CustomClass: true


// import java.util.Scanner;

// class Main {
//     static class CustomClass {
//         String name;

//         // Constructor to initialize the name
//         public CustomClass(String name) {
//             this.name = name;
//         }

//         // Overriding toString() to display the custom message
//         @Override
//         public String toString() {
//             return "Hello, " + name + "!";
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Reading input
//         String name = sc.nextLine();
//         int n = sc.nextInt();

//         // Checking if the entered name is an instance of String
//         System.out.println("Name is an instance of String: " + (name instanceof String));

//         // Calculating the cube of the entered integer
//         int cube = n * n * n;
//         System.out.println("Cube of the entered number: " + cube);

//         // Creating an instance of CustomClass
//         CustomClass customObj = new CustomClass(name);
//         System.out.println("CustomClass: " + customObj);

//         // Checking if customObj is an instance of CustomClass
//         System.out.println("customObj is an instance of CustomClass: " + (customObj instanceof CustomClass));
//     }
// }


