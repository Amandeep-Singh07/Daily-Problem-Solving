
// Problem Statement



// Mr. Kapoor is developing a greeting program that utilizes the power of Java interfaces. He has created an interface Greet with a default method getCustomGreeting and a method displayGreeting.



// Additionally, he has implemented the interface in a class called GreetingUser, which takes a user's name during initialization, and prints the customised message.

// Input format :
// The first line of input is a string, which represents the user name.

// The second line of input is a string, which represents the occasion.

// Output format :
// The first line of output prints the message from the default method "Default method".

// The second line of output prints: "Welcome, [username]!".

// The third line of output prints the Greeting message: "Default Greeting: [occasion]"



// Refer to the sample output for the formatting specifications.

// Code constraints :
// The input string should be 100 characters.

// Sample test cases :
// Input 1 :
// John
// Birthday
// Output 1 :
// Default method
// Welcome, John!
// Default Greeting: Birthday
// Input 2 :
// Isabella
// Retirement
// Output 2 :
// Default method
// Welcome, Isabella!
// Default Greeting: Retirement

import java.util.Scanner;

interface Greet {
    // Default method with an implementation.
    default void getCustomGreeting() {
        System.out.println("Default method");
    }

    // Abstract method to display the welcome message.
    void displayGreeting();
}

class GreetingUser implements Greet {
    private String userName;

    // Constructor that initializes the userName and calls the default method.
    public GreetingUser(String userName) {
        this.userName = userName;
        // Calling the default method from the interface.
        getCustomGreeting();
    }

    // Implementing the displayGreeting method.
    @Override
    public void displayGreeting() {
        System.out.println("Welcome, " + userName + "!");
    }

    // A method to display the custom greeting with the occasion.
    public void displayCustomGreeting(String occasion) {
        System.out.println("Default Greeting: " + occasion);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.nextLine();
        String occasion = scanner.nextLine();

        GreetingUser greetingUser = new GreetingUser(userName);
        greetingUser.displayGreeting();
        greetingUser.displayCustomGreeting(occasion);

        scanner.close();
    }
}
