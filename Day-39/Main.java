// Problem Statement



// Imagine you have a regular shop and a holiday shop. The regular shop offers a 10% discount on all its products, and the holiday shop offers an additional 5% discount during the holiday season. The price of the product will be given by the user and the final prices of regular shop and holiday shop should be displayed. So write a program to calculate the final prices of both the shops. use the function "calculateFinalPrice" to override the classes.

// Input format :
// The first line of input is a double value 'p' representing the price given by the user.

// Output format :
// The first line of output displays the phrase "Regular Shop Final Price: " followed by the discounted regular shop price in double datatype.

// The second line of output displays the phrase "Holiday Shop Final Price: " followed by the discounted holiday shop price in double datatype.



// Refer to the sample output for the formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ p ≤ 10000

// Sample test cases :
// Input 1 :
// 100.0
// Output 1 :
// Regular Shop Final Price: 90.0
// Holiday Shop Final Price: 85.5
// Input 2 :
// 50.0
// Output 2 :
// Regular Shop Final Price: 45.0
// Holiday Shop Final Price: 42.75



import java.util.Scanner;

class Shop {
    double originalPrice;

    public double calculateFinalPrice(double originalPrice) {
        return (originalPrice - originalPrice * 0.10);
    }
}

class HolidayShop extends Shop {
    public HolidayShop() {
        this.originalPrice = originalPrice;

    }

    public double calculateFinalPrice(double originalPrice) {
        originalPrice = originalPrice - originalPrice * 0.10;
        originalPrice = originalPrice - originalPrice * 0.05;
        return originalPrice;
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double originalPrice = scanner.nextDouble();

        Shop regularShop = new Shop();
        HolidayShop holidayShop = new HolidayShop();

        double regularPrice = regularShop.calculateFinalPrice(originalPrice);
        double holidayPrice = holidayShop.calculateFinalPrice(originalPrice);

        System.out.println("Regular Shop Final Price: " + regularPrice);
        System.out.println("Holiday Shop Final Price: " + holidayPrice);

        scanner.close();
    }
}
