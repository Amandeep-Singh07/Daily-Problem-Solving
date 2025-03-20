// Problem Statement﻿



// Sarah's courier service calculates the total cost of sending parcels based on their size, weight, and whether they are fragile. The basic cost of sending a parcel is determined by its size and weight. For fragile items, additional packing and insurance costs are applied.

// Write a program using single-level inheritance to:

// Create a base class Parcel that calculates the basic cost of sending a parcel.
// Derive a subclass FragileParcel from Parcel that adds additional packing and insurance costs for fragile parcels.
// The program should take user input for the basic cost, extra packing cost, and insurance cost, and display the total cost for both regular and fragile parcels.
// Implement the inheritance to calculate and display the total cost for regular and fragile parcels.

// Input format :
// The first line of input contains an integer representing the regular cost for the parcel.

// The second line of input contains an integer representing the extra packing cost for the fragile parcel.

// The third line of input contains an integer representing the insurance cost for the fragile parcel.

// Output format :
// The output displays the total cost for regular and fragile parcels, each in a separate line.



// Refer to the sample outputs for format specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// The costs of the parcel should be integers and should not contain any letters or symbols.

// 0 ≤ Regular cost, Extra packing cost, Insurance cost ≤ 106

// Sample test cases :
// Input 1 :
// 10
// 5
// 3
// Output 1 :
// Regular Parcel Cost: 10 rupees
// Fragile Parcel Cost: 18 rupees
// Input 2 :
// 10000
// 5000
// 3000
// Output 2 :
// Regular Parcel Cost: 10000 rupees
// Fragile Parcel Cost: 18000 rupees

import java.util.Scanner;

// Base class representing a regular parcel
class Parcel {
    int basicCost; // Cost of sending a regular parcel

    // Constructor to initialize the basic cost
    Parcel(int basicCost) {
        this.basicCost = basicCost;
    }

    // Method to calculate and return the cost of a regular parcel
    public int calculateCost() {
        return basicCost;
    }
}

// Subclass representing a fragile parcel (inherits from Parcel)
class FragileParcel extends Parcel {
    int extraPackingCost; // Additional cost for extra packing
    int insuranceCost; // Additional cost for insurance

    // Constructor to initialize basic cost, extra packing cost, and insurance cost
    FragileParcel(int basicCost, int extraPackingCost, int insuranceCost) {
        super(basicCost); // Calls the constructor of the base class (Parcel) to set basicCost
        this.extraPackingCost = extraPackingCost;
        this.insuranceCost = insuranceCost;
    }

    // Overridden method to calculate the total cost of a fragile parcel
    @Override
    public int calculateCost() {
        return basicCost + extraPackingCost + insuranceCost; // Adds extra costs to the basic cost
    }
}

// Main class to execute the program
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs for parcel costs
        int basicCost = scanner.nextInt(); // Input: Basic cost for a regular parcel
        int extraPackingCost = scanner.nextInt(); // Input: Extra packing cost for fragile parcel
        int insuranceCost = scanner.nextInt(); // Input: Insurance cost for fragile parcel

        // Creating objects of Parcel and FragileParcel classes
        Parcel regularParcel = new Parcel(basicCost);
        FragileParcel fragileParcel = new FragileParcel(basicCost, extraPackingCost, insuranceCost);

        // Displaying the calculated cost for both parcel types
        System.out.println("Regular Parcel Cost: " + regularParcel.calculateCost() + " rupees");
        System.out.println("Fragile Parcel Cost: " + fragileParcel.calculateCost() + " rupees");

        // Closing the scanner to prevent resource leak
        scanner.close();
    }
}
