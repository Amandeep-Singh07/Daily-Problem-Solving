// Problem Statement



// David is trying to solve a linear equation to find the values of x and y based on given coefficients a, b and c. Implement a class named Equation where the coefficients are inputted through a method named inputCoefficients(). Create an object of the Equation class, use the method to input the coefficients, and another method solveEquation() to solve and display the values of x and y.



// Can you assist David in creating the program?



// Formula: 

// x = (c - b) / a

// y = (c - a) / b

// Input format :
// The input consists of three double values :

// The first line contains the input a representing the coefficient of the linear equations which is of type double.
// The second line contains the input b representing the coefficient of the linear equations which is of type double.
// The third line contains the input c representing the coefficient of the linear equations which is of type double.
// Output format :
// The first line of output prints one of the following:

// If there is a solution for x, print "x = " followed by the result as a double value, rounded off to one decimal place.
// If a is zero and no solution exists, print "a is zero".
// The second line prints one of the following:

// If there is a solution for y, print "y = " followed by the result as a double value, rounded off to one decimal place.
// If b is zero and no solution exists, print "b is zero".


// Refer to the sample output for formatting specifications.

// Code constraints :
// The given test cases fall under the following constraints:

// 0.0 ≤ a, b, c ≤ 100.0

// Sample test cases :
// Input 1 :
// 2.0
// 3.0
// 7.0
// Output 1 :
// x = 2.0
// y = 1.7
// Input 2 :
// 100.0
// 0.0
// 50.0
// Output 2 :
// x = 0.5
// b is zero
// Input 3 :
// 0.0
// 3.0
// 7.0
// Output 3 :
// a is zero
// y = 2.3
// Input 4 :
// 1.5
// 6.2
// 1.5
// Output 4 :
// x = -3.1
// y = 0.0

import java.util.Scanner;

class Equation {
    double a, b, c;

    public void inputCoefficients() {
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble(); // here see that i had not declared like double a = sc.nextDouble(); why because when i will try to change the value of a it will be not !!
        b = sc.nextDouble();
        c = sc.nextDouble();
    }
    
    // We removed  double from a,b, and c inside the inputCoefficients() method because they were shadowing the instance variables.
    public void solveEquation() {

        if (a == 0.0) {
            System.out.println("a is zero");
        } else {
            double x = (c - b) / a;
            System.out.printf("x = %.1f", x);

        }
        if (b == 0.0) {
            System.out.println("b is zero");
        } else {
            double y = (c - a) / b;
            System.out.printf("y = %.1f", y);
        }
    }
}

class Main {
    public static void main(String[] args) {
        Equation equation = new Equation();
        equation.inputCoefficients();
        equation.solveEquation();
    }
}