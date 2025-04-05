// Write a Java program using abstraction and polymorphism to simulate different types of game characters. The program should:

// Define an abstract class GameCharacter with two abstract methods: attack(int attributeValue) and defend(int attributeValue).

// Create two subclasses:

// Warrior: multiplies the attack value by 3 and uses a shield to defend.

// Wizard: multiplies the attack value by 2 and creates a magical barrier to defend.

// In the main method:

// Prompt the user to choose between a Warrior (choice 1) or a Wizard (choice 2).

// Take another input for the character’s attribute value (e.g., strength or magic power).

// Based on the choice, create the corresponding object using dynamic method dispatch (i.e., polymorphism).

// Call attack() and defend() methods with the attribute value.


import java.util.Scanner;

abstract class GameCharacter {
    abstract void attack(int attributeValue);

    abstract void defend(int attributeValue);
}

class Warrior extends GameCharacter {
    @Override
    void attack(int strength) {
        System.out.println("Attack: Powerful sword slash for " + (strength * 3) + " damage!");
    }

    @Override
    void defend(int strength) {
        System.out.println("Defend: Raises shield, defence boosted by " + strength + "!");
    }
}

class Wizard extends GameCharacter {
    @Override
    void attack(int magicPower) {
        System.out.println("Attack: Casts spell, deals " + (magicPower * 2) + " magical damage!");
    }

    @Override
    void defend(int magicPower) {
        System.out.println("Defend: Creates magical barrier, defence boosted by " + magicPower + "!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int attributeValue = scanner.nextInt();
        GameCharacter character;

        if (choice == 1) {
            character = new Warrior();
            System.out.println("Warrior Actions:");
        } else if (choice == 2) {
            character = new Wizard();
            System.out.println("Wizard Actions:");
        } else {
            System.out.println("Invalid choice");
            scanner.close(); // Close the scanner before exiting
            return;
        }

        character.attack(attributeValue);
        character.defend(attributeValue);

        scanner.close();
    }
}