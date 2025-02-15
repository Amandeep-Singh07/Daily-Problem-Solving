<img src="image1.png">

```
// A good learning of method overloading, arrays, classes and object

import java.util.Scanner;
class Calculator {
    
        int sum=0;
    public int sum( int [] arr){
        for(int i=0;i<arr.length;i++){
           sum+=arr[i]; 
        }
        return sum;
    }
    double doublesum=0;
    public double sum(double []arr){
        for(int i=0;i<arr.length;i++){
            doublesum+=arr[i];
        }
        return doublesum;
    }
    
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String intInput = scanner.nextLine();
        String[] intStrings = intInput.split(" ");   // here we are putting the inputs in a array of strings.
        int[] intArray = new int[intStrings.length];
        for (int i = 0; i < intStrings.length; i++) {
            intArray[i] = Integer.parseInt(intStrings[i]);  ////This converts ["1", "2", "3", "4", "5"] into an int[] array
        }
        
        int intSum = calculator.sum(intArray);

        String doubleInput = scanner.nextLine();
        String[] doubleStrings = doubleInput.split(" ");
        double[] doubleArray = new double[doubleStrings.length];
        for (int i = 0; i < doubleStrings.length; i++) {
            doubleArray[i] = Double.parseDouble(doubleStrings[i]);   //This converts ["1","2","3","4","5"] into an double[] array
        }
        double doubleSum = calculator.sum(doubleArray);
        
        System.out.println("Sum of integers: " + intSum);
        System.out.println("Sum of doubles: " + doubleSum);
    }
}

```

<img src="image.png">

```

import java.util.Scanner;

class PrimeDecider {
    
    int a, b, sum, diff;

    PrimeDecider(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Corrected isPrime() method
    public boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {  
            if (num % i == 0) return false; // If divisible, it's not prime
        }
        return true; // No factors found, it's prime
    }

    public void decide() {
        sum = a + b;
        diff = Math.abs(a - b);
        System.out.println("Sum: " + sum + ", Difference: " + diff);

        // Check if sum is prime
        if (isPrime(sum)) {
            System.out.println(sum + " is prime");
        } else {
            System.out.println(sum + " is not prime");
        }

        // Check if difference is prime
        if (isPrime(diff)) {
            System.out.println(diff + " is prime");
        } else {
            System.out.println(diff + " is not prime");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        PrimeDecider primeDecider = new PrimeDecider(a, b);  // for this line we have to make a constructor
        primeDecider.decide();
        scanner.close();
    }
}

```


