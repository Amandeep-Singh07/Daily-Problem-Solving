// // Problem Statement

// // Ravi is working on an online shopping platform where customers can compare product prices.He needs to implement a feature that allows users to view a list of products,sorted in ascending order based on their prices.Ravi designs two classes:Product and PriceComparator.The Product
// // class stores
// // the name
// // and price
// // of each product,
// // and overrides

// // the toString() method to return the product details.

// // It also overrides

// // the equals() method to compare products based on price. The PriceComparator class uses the final keyword to define the price comparison as immutable and ensures that products are sorted based on their prices in ascending order.

// // Input format :
// // The first line of input contains an integer n, the number of products.

// // The next n lines contain the name and price of each product, separated by a space.

// // Output format :
// // For each product, the output prints its details in ascending order of its price. Each line should display the product name and price in the following format:

// // Product Name: {name}, Price: Rs. {price}



// // ﻿Refer to the sample output for formatting specifications.

// // Code constraints :
// // The given test cases fall under the following constraints:

// // 1 < n < 10

// // 0 < price < 105

// // Sample test cases :
// // Input 1 :
// // 3
// // Laptop 50000
// // Smartphone 20000
// // Tablet 30000
// // Output 1 :
// // Product Name: Smartphone, Price: Rs. 20000.0
// // Product Name: Tablet, Price: Rs. 30000.0
// // Product Name: Laptop, Price: Rs. 50000.0
// // Input 2 :
// // 2
// // Watch 1500
// // Bag 2500
// // Output 2 :
// // Product Name: Watch, Price: Rs. 1500.0
// // Product Name: Bag, Price: Rs. 2500.0

// import java.util.Scanner;

// // You are using Java
// class Product {
//     // Type your code here
// }

// class PriceComparator {
//     // Type your code here
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n = Integer.parseInt(scanner.nextLine().trim()); // Ensuring no extra space is included in input

//         Product[] products = new Product[n];

//         for (int i = 0; i < n; i++) {
//             String[] input = scanner.nextLine().split(" ", 2);
//             String name = input[0];
//             double price = Double.parseDouble(input[1]);
//             products[i] = new Product(name, price);
//         }

//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (PriceComparator.compare(products[j], products[j + 1]) < 0) {
//                     Product temp = products[j];
//                     products[j] = products[j + 1];
//                     products[j + 1] = temp;
//                 }
//             }
//         }

//         for (Product product : products) {
//             System.out.println(product);
//         }

//         scanner.close();
//     }
// }


// Problem Statement

// Kenya is
// implementing a
// conference registration
// system where
// attendees input
// their names
// and numbers.
// To address
// privacy concerns, develop
// a CustomClass
// to filter
// out all
// the numbers
// in the
// system logs.

// Write the
// program to
// display the
// username without
// the phone
// number using

// the toString() method.

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

//  import java.util.Scanner;

//  // You are using Java
// class CustomClass {
//     // type your code here
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String userInput = scanner.nextLine();

//         CustomClass customObject = new CustomClass(userInput);
//         System.out.println(customObject);
//     }
// }

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

//         // You are using Java
//         static class CustomClass {
//             String name;

//             public CustomClass(String name) {
//                 this.name = name;
//             }

//             public String toString() {
//                 return "Hello, " + name + "!";
//             }
//         }

//         public static void main(String[] args) {

//             Scanner sc = new Scanner(System.in);

//             String name = sc.nextLine();
//             int num = sc.nextInt();

//             System.out.println("Name is an instance of String: " + (name instanceof String));
//             int cube = num * num * num;
//             System.out.println("Cube of the entered number: " + cube);
//             CustomClass customObj = new CustomClass(name);
//             System.out.printf("CustomClass: " + customObj);

//             System.out.println("customObj is an instance of CustomClass: " + (customObj instanceof CustomClass));

//     }

//     }

//     Problem Statement

//     Sarah is
//     developing a file-
//     naming tool for
//     a document
//     management system
//     where users
//     can categorize
//     files with
//     custom prefixes.
//     Create a
//     PrefixClass to
//     concatenate user-
//     provided prefixes
//     with file names,
//     ensuring organized
//     and easily
//     identifiable documents.

//     Write a
//     program that
//     gets the
//     file name
//     and category
//     prefix from
//     the user
//     and displays
//     the formatted
//     file name

//     using toString() method.

// Input format :
// The first line of input consists of a string, representing the file name.

// The second line consists of a string, representing

//     the category (prefix).

// Output format :
// The output displays the formatted file name with the category.



// Refer to the sample output for formatting specifications.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ length of input strings ≤ 50 characters

// Sample test cases :
// Input 1 :
// document.txt
// Work
// Output 1 :
// Workdocument.txt
// Input 2 :
// presentation.pdf
// Meeting
// Output 2 :
// Meetingpresentation.pdf

//     import java.util.Scanner;
    
//     // You are using Java
//     class PrefixClass {
//         String dataInput;
//         String prefixInput;

//         public PrefixClass(String dataInput, String prefixInput) {
//             this.dataInput = dataInput;
//             this.prefixInput = prefixInput;
//         }

//         public String toString() {
//             return prefixInput + dataInput;
//         }

//     }

//     public class Main {
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             String dataInput = scanner.nextLine();
//             String prefixInput = scanner.nextLine();
//             PrefixClass prefixObject = new PrefixClass(dataInput, prefixInput);
//             System.out.println(prefixObject);
//         }
//     }

//     Problem Statement

//     Ravi is
//     working on
//     an online
//     shopping platform
//     where customers
//     can compare
//     product prices.
//     He needs
//     to implement
//     a feature
//     that allows
//     users to
//     view a
//     list of products,
//     sorted in
//     ascending order
//     based on
//     their prices.
//     Ravi designs
//     two classes:
//     Product and
//     PriceComparator.The Product

//     class stores
//     the name
//     and price
//     of each product,
//     and overrides

//     the toString() method to return the product details.

// It also overrides

//     the equals() method to compare products based on price. The PriceComparator class uses the final keyword to define the price comparison as immutable and ensures that products are sorted based on their prices in ascending order.

// Input format :
// The first line of input contains an integer n, the number of products.

// The next n lines contain the name and price of each product, separated by a space.

// Output format :
// For each product, the output prints its details in ascending order of its price. Each line should display the product name and price in the following format:

// Product Name: {name}, Price: Rs. {price}



// ﻿Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 1 < n < 10

// 0 < price < 105

// Sample test cases :
// Input 1 :
// 3
// Laptop 50000
// Smartphone 20000
// Tablet 30000
// Output 1 :
// Product Name: Smartphone, Price: Rs. 20000.0
// Product Name: Tablet, Price: Rs. 30000.0
// Product Name: Laptop, Price: Rs. 50000.0
// Input 2 :
// 2
// Watch 1500
// Bag 2500
// Output 2 :
// Product Name: Watch, Price: Rs. 1500.0
// Product Name: Bag, Price: Rs. 2500.0

// import java.util.Scanner;

// // You are using Java
// class Product {
//     // Type your code here
// }

// class PriceComparator {
//     // Type your code here
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int n = Integer.parseInt(scanner.nextLine().trim()); // Ensuring no extra space is included in input

//         Product[] products = new Product[n];

//         for (int i = 0; i < n; i++) {
//             String[] input = scanner.nextLine().split(" ", 2);
//             String name = input[0];
//             double price = Double.parseDouble(input[1]);
//             products[i] = new Product(name, price);
//         }

//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (PriceComparator.compare(products[j], products[j + 1]) < 0) {
//                     Product temp = products[j];
//                     products[j] = products[j + 1];
//                     products[j + 1] = temp;
//                 }
//             }
//         }

//         for (Product product : products) {
//             System.out.println(product);
//         }

//         scanner.close();
//     }
// }

// Problem Statement

// Aravind wants
// to design
// a program for
// an electricity
// monitor that
// takes user input for
// the number
// of hours
// to monitor
// and hourly
// electricity usage.

// Your task
// is to
// assist Aravind
// in creating a final class,ElectricityMonitor,
// with a
// method to
// analyze patterns
// and identify
// the peak
// usage time.
// Display the results,
// indicating the
// hour and
// value of
// peak usage.

// Input format:
// The first
// line of
// input consists
// of an
// integer N, representing
// the number
// of hours
// to monitor.

// The second
// line consists
// of N space-separated
// double values, representing
// the electricity usage for
// each hour.

// Output format:
// The output
// prints the
// hour and
// the peak
// usage time, rounded
// off to
// two decimal
// places.

//         Refer to
// the sample output for
// the exact
// text.

//         Code constraints:
// The given
// test cases
// fall under
// the following constraints:

// 2≤N≤10

// 1.0≤
// electricity usage≤500.0

// Sample test cases:Input 1:5 150.0 125.5 141.6 129.8 114.8 Output 1:
// Peak Usage Time:Hour 1 with 150.00
// kWh Input 2:8 4.92 8.64 8.73 9.46 5.78 4.92 5.64 9.45 Output 2:
// Peak Usage Time:Hour 4 with 9.46
// kWh Input 3:3 137.5 127.8 145.2 Output 3:
// Peak Usage Time:Hour 3 with 145.20
// kWh

// import java.util.Scanner;

// final class ElectricityMonitor {
//     double[] hourlyUsage;

//     public ElectricityMonitor(double[] hourlyUsage) {
//         this.hourlyUsage = hourlyUsage;
//     }

//     public void analyzeUsagePatterns() {
//         double greatest = hourlyUsage[0];
//         int flag = 0;

//         for (int i = 0; i < (hourlyUsage.length); i++) {
//             if (hourlyUsage[i] > greatest) {
//                 greatest = hourlyUsage[i];

//             }
//         }
//         for (int i = 0; i < hourlyUsage.length; i++) {
//             if (hourlyUsage[i] == greatest) {
//                 flag = i + 1;
//             }
//         }

//         System.out.printf("Peak Usage Time: Hour %d with %.2f kWh", flag, greatest);
//     }

// }
    
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int numHours = scanner.nextInt();

//         double[] hourlyUsage = new double[numHours];

//         for (int i = 0; i < numHours; i++) {
//             hourlyUsage[i] = scanner.nextDouble();
//         }

//         ElectricityMonitor electricityMonitor = new ElectricityMonitor(hourlyUsage);

//         electricityMonitor.analyzeUsagePatterns();

//         scanner.close();
//     }
// }

// Problem Statement



// Sindhu is excited about the enchanting world of numbers and wants to create a program showcasing magical mathematical operations. She's asked for your help in designing the Operations class, which extends the abstract class Calculator.



// The abstract class Calculator defines two methods:

//         performOperation(int a): This method takes a single integer as input and returns the square of that number.

//         performOperation(int a, int b, int c): This method takes three integers as input and returns the product of those three numbers.

// Input format :
// The input consists of integers, n1, n2, and n3.

// Output format :
// The first line of output displays the result of the first operation (square of n1).

// The second line of output displays the result of the second operation (the product of n1, n2, and n3).



// Refer to the sample output for the formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// -1000 ≤ n1, n2, n3 ≤ 1000

// Sample test cases :
// Input 1 :
// 2 3 5
// Output 1 :
// 4
// 30
// Input 2 :
// 0 5 8
// Output 2 :
// 0
// 0
// Input 3 :
// -8 5 -3
// Output 3 :
// 64
// 120

// import java.util.Scanner;

// // You are using Java
// abstract class Calculator {
//             // type your code here
//             abstract int performOperation(int num1);

//             abstract int performOperation(int num1, int num2, int num3);
//         }

//         class Operations extends Calculator {
//             // type your code here
//             public int performOperation(int num1) {
//                 return num1 * num1;
//             }

//             public int performOperation(int num1, int num2, int num3) {
//                 return num1 * num2 * num3;
//             }
//         }

//         public class Main {
//             public static void main(String[] args) {
//                 Scanner scanner = new Scanner(System.in);
//                 int num1 = scanner.nextInt();
//                 int num2 = scanner.nextInt();
//                 int num3 = scanner.nextInt();
//                 Operations calculator = new Operations();
//                 System.out.println(calculator.performOperation(num1));
//                 System.out.println(calculator.performOperation(num1, num2, num3));

//                 scanner.close();
//             }
//         }

//         Problem Statement



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

// import java.util.Scanner;

// interface Greet {
//                 default void getCustomGreeting() {
//                     System.out.println("Default method");
//                 }

//                 public void displayGreeting();
//             }

//             class GreetingUser implements Greet {
//                 String userName;

//                 public GreetingUser(String userName) {
//                     this.userName = userName;
//                     getCustomGreeting();
//                 }

//                 public void displayGreeting() {
//                     System.out.println("Welcome, " + userName + "!");
//                 }

//                 public void displayCustomGreeting(String occasion) {
//                     System.out.println("Default Greeting: " + occasion);
//                 }
//             }

//             public class Main {
//                 public static void main(String[] args) {
//                     Scanner scanner = new Scanner(System.in);

//                     String userName = scanner.nextLine();

//                     String occasion = scanner.nextLine();

//                     GreetingUser greetingUser = new GreetingUser(userName);
//                     greetingUser.displayGreeting();
//                     greetingUser.displayCustomGreeting(occasion);
//                 }
//             }

//             Problem Statement



// John, a software developer, is tasked with implementing a basic calculator in Java for a project. The team opts for an abstract class named "Calculator" as the foundation, featuring abstract methods for addition and multiplication.



// John extends this class with "BasicCalculator", providing implementations for addition and multiplication. He also creates a user-friendly interface for input and result display.

// Input format :
// The first line of input is an integer, num1.

// The second line of input is an integer, num2.

// Output format :
// The first line of output displays "Calculator Initialized", which is printed during the initialization of the abstract class.

// The second line of output displays "BasicCalculator Initialized," which is printed during the initialization of the concrete class.

// The third line of output displays the result of adding num1 and num2.

// The second line of output displays the result of multiplying num1 and num2.

// Refer to the sample output for the formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// -100000 ≤ num1, num2 ≤ 100000

// Sample test cases :
// Input 1 :
// 2
// 3
// Output 1 :
// Calculator Initialized
// BasicCalculator Initialized
// 5
// 6
// Input 2 :
// -5
// 8
// Output 2 :
// Calculator Initialized
// BasicCalculator Initialized
// 3
// -40
// Input 3 :
// -9
// -2
// Output 3 :
// Calculator Initialized
// BasicCalculator Initialized
// -11
// 18

// import java.util.Scanner;

// // You are using Java
// abstract class Calculator {
//             // type your code here
//             abstract int add(int num1, int num2);

//             abstract int multiply(int num1, int num2);
//         }

//         class BasicCalculator extends Calculator {
//             // type your code here
//             public int add(int num1, int num2) {
//                 System.out.println("Calculator Initialized");
//                 System.out.println("BasicCalculator Initialized");
//                 return num1 + num2;
//             }

//             public int multiply(int num1, int num2) {
//                 return num1 * num2;
//             }

//         }

//         public class Main {
//             public static void main(String args[]) {
//                 BasicCalculator calculator = new BasicCalculator();
//                 Scanner scanner = new Scanner(System.in);
//                 int num1 = scanner.nextInt();
//                 int num2 = scanner.nextInt();
//                 int sum = calculator.add(num1, num2);
//                 System.out.println(sum);
//                 int product = calculator.multiply(num1, num2);
//                 System.out.println(product);
//                 scanner.close();
//             }
//         }

//         Problem Statement



// Eric operates a taxi service and charges passengers based on the distance traveled and the waiting time. The total fare is calculated using a base fare, cost per mile, and cost per minute of wait time.



// Implement this calculation using an abstract class `FareCalculator` and an interface `FareDetails`. The abstract class should define an abstract method `calculateFare`, while the interface should declare constants for base fare, cost per mile, and cost per minute.



// Formula: 

// Total Fare = base fare + (distance * cost per mile) + (waiting time * cost per minute)



// Eric's Standard Fee Structure:

// Base fare = 3.50
// Cost per mile = 2.50
// Cost per minute = 0.20
// Input format :
// The first line of the input consists of a double value representing the distance traveled in miles.

// The second line consists of an integer representing the waiting time in minutes (a non-negative value).

// Output format :
// The output prints "Total Fare: " followed by a double value representing the total fare, rounded to two decimal places.



// Refer to the sample output formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 0.0 ≤ distance travelled ≤ 50.0

// 1 ≤ waiting time ≤ 60

// Sample test cases :
// Input 1 :
// 7.3
// 6
// Output 1 :
// Total Fare: 22.95
// Input 2 :
// 13.25
// 5
// Output 2 :
// Total Fare: 37.63

// import java.util.*;

// // You are using Java
// interface FareDetails {
//             // Type your code here
//             double a = 3.50;
//             double b = 2.50;
//             double c = 0.20;
//         }

//         abstract class FareCalculator implements FareDetails {

//         }

//         class TaxiFareCalculator extends FareCalculator {
//             // Type your code here
//         }

//         public class Main {
//             public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 double distance = sc.nextDouble();
//                 int waitingTime = sc.nextInt();

//                 FareCalculator calculator = new TaxiFareCalculator();
//                 double totalFare = calculator.calculateFare(distance, waitingTime);

//                 System.out.printf("Total Fare: %.2f", totalFare);
//             }
//         }

//         Problem Statement:



// Oliver is working on a project that involves dealing with file sizes. He needs a Java program that can convert file sizes from bytes to kilobytes (KB), megabytes (MB), gigabytes (GB), and vice versa.

// You are required to design a Java program with an interface FileSizeConverter that includes static methods for the following conversions:

// convertFromBytes(long bytes, String targetUnit): This method should convert a given file size in bytes to the specified unit (KB, MB, or GB).
// convertToBytes(double size, String sourceUnit): This method should convert the given file size in KB, MB, or GB to bytes.
// Input format :
// The first line consists of a long integer fileSize, representing the file size to be converted

// The second line consists of a string fromUnit, representing the current unit of the file size

// The third line consists of a string toUnit, representing the target unit for the conversion.

// Output format :
// The output prints a single line containing the converted file size followed by the unit of measurement (e.g., "256 KB").



// Refer to the sample output formatting specifications

// Code constraints :
// 1 ≤ fileSize ≤ 10^18

// Sample test cases :
// Input 1 :
// 1024
// bytes
// KB
// Output 1 :
// 1 KB
// Input 2 :
// 2048
// KB
// MB
// Output 2 :
// 2 MB
// Input 3 :
// 2
// KB
// bytes
// Output 3 :
// 2048 bytes

// import java.util.*;

// // You are using Java
// interface FileSizeConverter {
//         // type your code here
//     }

//     public class Main {
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             long fileSize = scanner.nextLong();
//             scanner.nextLine();
//             String fromUnit = scanner.nextLine().trim();
//             String toUnit = scanner.nextLine().trim();

//             long bytes;
//             if (fromUnit.equalsIgnoreCase("bytes")) {
//                 bytes = fileSize;
//             } else {
//                 bytes = FileSizeConverter.convertToBytes(fileSize, fromUnit);
//             }

//             double result;
//             if (toUnit.equalsIgnoreCase("bytes")) {
//                 result = bytes;
//             } else {
//                 result = FileSizeConverter.convertFromBytes(bytes, toUnit);
//             }

//             if (toUnit.equalsIgnoreCase("bytes")) {
//                 System.out.printf("%.0f %s%n", result, "bytes");
//             } else {
//                 System.out.printf("%.0f %s%n", result, toUnit.toUpperCase());
//             }

//             scanner.close();
//         }
//     }

//     // static question

//     Problem Statement

//     Akash has
//     been assigned
//     the task
//     of developing
//     a program
//     to determine
//     whether three
//     given lengths
//     can form
//     a valid
//     triangle.A triangle
//     is considered valid if
//     the sum
//     of any
//     two sides
//     is greater
//     than the
//     third side.
//     To implement this,
//     Akash needs
//     to create
//     a program
//     that takes
//     three integer
//     inputs representing
//     the side
//     lengths and
//     checks whether
//     they satisfy
//     the triangle
//     inequality conditions:a+b>c,a+c>b,
//     and b+c>
//     a.

//             The solution
//     should be
//     designed using inheritance,
//     incorporating features
//     such as
//     overriding the

//     toString()

//     and equals() methods, utilizing the instanceof operator, or using super and final keywords.

// Input format :
// The input consists of three space-separated integers, each representing the length of a side of a triangle.

// Output format :
// The output displays a single line indicating whether the given side lengths form a triangle or not.

// If the side lengths form a triangle, it prints "Triangle".

// If the side lengths do not form a triangle, it prints "Not a Triangle".



// Refer to the sample output for the formatting specifications.

// Code constraints :
// 1 ≤ side 1, side 2, side 3 ≤ 60

// Sample test cases :
// Input 1 :
// 3 4 5
// Output 1 :
// Triangle
// Input 2 :
// 5 12 30
// Output 2 :
// Not a Triangle
// Input 3 :
// 35 35 60
// Output 3 :
// Triangle

//     import java.util.Scanner;

//     // You are using Java
//     class Shape {
//         // Type your code here
//     }

//     class Triangle extends Shape {
//         // Type your code here
//     }

//     public class Main {
//         public static void main(String[] args) {
//             Scanner input = new Scanner(System.in);
//             int side1 = input.nextInt();
//             int side2 = input.nextInt();
//             int side3 = input.nextInt();

//             Triangle t = new Triangle(side1, side2, side3);
//             t.checkTriangle(); // Checking if it forms a triangle

//             input.close();
//         }
//     }

//     Problem Statement

//     A bank
//     offers two
//     types of
//     deposit schemes:

//     Fixed Deposits (FD) and Recurring Deposits (RD). Customers want to know the interest they can earn based on their chosen scheme.



// Create a Java program using inheritance to calculate the interest for FD and RD. The program should contain the following:



// An abstract class Account with attributes accountHolder and principalAmount, and an abstract method calculateInterest().
// A subclass FixedDeposit to calculate interest for FD.
// A subclass RecurringDeposit to calculate interest for RD.


// Formulas Used:

// Interest for FD: (principal amount * duration in years * rate of interest) / 100

// Interest for RD:  (maturity amount * duration in months * rate of interest) / (12 * 100), where maturity amount = monthly deposit * duration in months.

// Input format :
// The first line of input consists of the choice (1 for FD, 2 for RD).

// If the choice is 1, the following lines consist of account holder (string), principal amount (double), duration in years (int), and rate of interest (double).

// If the choice is 2, the following lines consist of account holder (string), monthly deposit (int), duration in months (int), and rate of interest (double).

// Output format :
// The output prints the calculated interest with one decimal place.



// Refer to the sample output for formatting specifications.

// Code constraints :
// Choice will be either 1 or 2.

// Sample test cases :
// Input 1 :
// 1
// Alice
// 50000.56
// 5
// 6.5
// Output 1 :
// Interest for FD: 16250.2
// Input 2 :
// 2
// Bob
// 2000
// 12
// 7.5
// Output 2 :
// Interest for RD: 1800.0

//     import java.util.Scanner;

//     // You are using Java
//     abstract class Account {
//         // type your code here
//     }

//     class FixedDeposit extends Account {
//         // type your code here
//     }

//     class RecurringDeposit extends Account {
//         // type your code here
//     }

//     public class Main {
//         public static void main(String[] args) {
//             Scanner sc = new Scanner(System.in);

//             int choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     sc.nextLine();
//                     String fdName = sc.nextLine();
//                     double fdPrincipal = sc.nextDouble();
//                     int fdDuration = sc.nextInt();
//                     double fdRate = sc.nextDouble();

//                     FixedDeposit fd = new FixedDeposit(fdName, fdPrincipal, fdDuration, fdRate);
//                     System.out.printf("Interest for FD: %.1f", fd.calculateInterest());
//                     break;

//                 case 2:
//                     sc.nextLine();
//                     String rdName = sc.nextLine();
//                     int rdDeposit = sc.nextInt();
//                     int rdDuration = sc.nextInt();
//                     double rdRate = sc.nextDouble();

//                     RecurringDeposit rd = new RecurringDeposit(rdName, 0, rdDeposit, rdDuration, rdRate);
//                     System.out.printf("Interest for RD: %.1f", rd.calculateInterest());
//                     break;

//                 default:
//                     System.out.println("Invalid Choice");
//             }
//         }
//     }

//     You are
//     given a
//     Java program
//     with two classes,
//     SuperClass and
//     SubClass.The SubClass
//     is a
//     subclass of
//     SuperClass.

//             The SuperClass
//     has an
//     integer variable variableA,
//     which is
//     initialized by
//     taking input
//     from the
//     user using
//     a Scanner
//     object.The SubClass
//     has an
//     integer variable variableB,
//     which is
//     calculated as
//     twice the
//     value of
//     variableA from
//     the superclass.

//     Your task
//     is to
//     complete the
//     program by
//     using the super
//     keyword to
//     access the
//     variableA from
//     the superclass
//     SuperClass within
//     the SubClass.
//     Once you
//     complete the program,
//     it should
//     create a
//     SubClass object, calculate
//     the value
//     of variableB
//     using the super keyword,
//     and then
//     display both
//     variableA from
//     the SuperClass
//     and variableB
//     from the
//     SubClass using

//     the displayVariables() method.

// Input format :
// The input consists of an integer representing the value of variableA.

// Output format :
// The output displays the values of SuperClass and SubClass in separate lines.



// Refer to the sample output for formatting specifications.

// Code constraints :
// 0 ≤ variableA ≤ 104

// Sample test cases :
// Input 1 :
// 5
// Output 1 :
// The value of SuperClass: 5
// The value of SubClass: 10
// Input 2 :
// 18
// Output 2 :
// The value of SuperClass: 18
// The value of SubClass: 36

//     import java.util.Scanner;
    
//     // You are using Java
//     class SuperClass {
//         // type your code here
//     }

//     class SubClass extends SuperClass {
//         // type your code here
//     }
    
//     class Main {
//         public static void main(String[] args) {
//             SubClass obj = new SubClass();
//             obj.displayVariables();
//         }
//     }

//     Problem Statement

//     A multiplayer word-
//     guessing game
//     is one
//     where one
//     player needs
//     to input
//     words and
//     another player
//     guesses the
//     same word.

//     Write a class,WordEntry,
//     with a
//     String field
//     to store
//     player inputs.
//     Override the

//     equals() method in a way that compares the words while ignoring all spaces and cases. The program determines the winner of a word-guessing game, where player 2 wins upon successfully guessing the word entered by player 1, and player 1 emerges victorious if player 2 fails to guess the word.

// Input format :
// The first line of input consists of a string, representing the word entered by player 1.

// The second line consists of a string, representing the word entered by player 2.

// Output format :
// The output displays a string representing the winner of the game.



// Refer to the sample output for the exact text.

// Code constraints :
// In this scenario, the test cases fall under the following constraints:

// 1 ≤ length of the input strings ≤ 100 characters

// Sample test cases :
// Input 1 :
// Red Apple
// red apple
// Output 1 :
// Player 2 wins!
// Input 2 :
// Java Programming
// Programming Python 
// Output 2 :
// Player 1 wins!
// Input 3 :
// Laptop
// lap t o p
// Output 3 :
// Player 2 wins!

//     import java.util.Scanner;

//     // You are using Java
//     class WordEntry {
//         // type your code here
//     }

//     class WordGame {
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);

//             String input1 = scanner.nextLine();
//             String input2 = scanner.nextLine();

//             WordEntry word1 = new WordEntry(input1);
//             WordEntry word2 = new WordEntry(input2);

//             if (word1.equals(word2)) {
//                 System.out.println("Player 2 wins!");
//             } else {
//                 System.out.println("Player 1 wins!");
//             }
//         }
//     }

//     Problem Statement



// Jessica is tasked with designing a fantasy game character system. The system includes an abstract class named GameCharacter with two abstract methods: attack() and defend(). 



// Two subclasses, Warrior and Wizard, extend the GameCharacter class. 



// The program prompts the player to choose a character class (1. Warrior, 2. Wizard) and input their character's strength or magic power. The dynamic calculations involve tripling the strength (strength * 3) for the Warrior's attack and doubling the magic power(power * 2) for the Wizard's attack.



// Jessica needs your help in completing the program. Help her finish it.

// Input format :
// The first line of input consists of an integer, representing the choice of the character - 1 for Warrior and 2 for Wizard.

// If the choice is 1, the second line consists of an integer N, representing the strength.

// If the choice is 2, the second line consists of an integer M, representing the magic power.

// Output format :
// If the choice is 1, the output displays the actions of a warrior in the following format:

// "Warrior Actions:

// Attack: Powerful sword slash for [result] damage!

// Defend: Raises shield, defence boosted by [N]!"



// If the choice is 2, the output displays the actions of a wizard in the following format:

// "Wizard Actions:

// Attack: Casts spell, deals [result] magical damage!

// Defend: Creates magical barrier, defence boosted by [M]!"



// If any other choice is given, print "Invalid choice".



// Refer to the sample output for formatting specifications.

// Code constraints :
// 1 ≤ M, N ≤ 106

// Sample test cases :
// Input 1 :
// 1
// 68
// Output 1 :
// Warrior Actions:
// Attack: Powerful sword slash for 204 damage!
// Defend: Raises shield, defence boosted by 68!
// Input 2 :
// 2
// 998
// Output 2 :
// Wizard Actions:
// Attack: Casts spell, deals 1996 magical damage!
// Defend: Creates magical barrier, defence boosted by 998!
// Input 3 :
// 3
// 76
// Output 3 :
// Invalid choice

// import java.util.Scanner;

// // You are using Java
// abstract class GameCharacter {
//         // Type your code here

//     }

//     class Warrior extends GameCharacter {
//         // Type your code here

//     }

//     class Wizard extends GameCharacter {
//         // Type your code here

//     }

//     class Main {
//         public static void main(String[] args) {
//             Scanner scanner = new Scanner(System.in);
//             int choice = scanner.nextInt();
//             int attributeValue = scanner.nextInt();
//             GameCharacter character;
//             if (choice == 1) {
//                 character = new Warrior();
//             } else if (choice == 2) {
//                 character = new Wizard();
//             } else {
//                 System.out.println("Invalid choice");
//                 return;
//             }

//             System.out.println((choice == 1 ? "Warrior" : "Wizard") + " Actions:");
//             character.attack(attributeValue);
//             character.defend(attributeValue);

//             scanner.close();
//         }
//     }