// Using lambda function made a calculator


import java.util.*;

// Functional interface with a method to perform an operation on two numbers
interface I1 {
    void msg(int a, int b);
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Taking two integer inputs
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Taking a string input to decide the operation (add, sub, mul, div)
        String c = sc.next();

        // Using a lambda expression to define the msg method
        I1 ob = (e, f) -> {
            if (c.equals("add"))
                System.out.println(a + b); // Addition
            if (c.equals("sub"))
                System.out.println(a - b); // Subtraction
            if (c.equals("mul"))
                System.out.println(a * b); // Multiplication
            if (c.equals("div"))
                System.out.println(a / b); // Division (assuming b is not zero)
        };

        // Calling the lambda function to execute the operation
        ob.msg(a, b);
    }
}
