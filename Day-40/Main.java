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
