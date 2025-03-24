// Basic Operation
// Write a Java program to display the current date using LocalDate.
// How do you create a LocalDate object representing the date 2025-03-23 ?

// import java.time.*;

// class Main {
//     public static void main(String args[]) {
//         LocalDate d1 = LocalDate.now();
//         System.out.println(d1);

//         LocalDate d2 = LocalDate.of(2025,03,23);
//         System.out.println(d2);
         
//     }
    
// }


// Date Manipulation:
// Write a java program to add 10 days to the current date using LocalDate.
// How can you subtract 3 months from a given LocalDate?

// import java.time.*;

// class Main {
//     public static void main(String args[]) {
//         LocalDate d1 = LocalDate.now();
//         System.out.println(d1);

    
//         LocalDate d2 = d1.plusDays(10);
//         System.out.println(d2);

//         LocalDate d3 = d1.minusDays(3);
//         System.out.println(d3);

//     }

// }



// Comparisons and Checks:
//Write a program to check if a given date is before or after the current date.
//How do you determine if a specific year is a leap year using LocalDate?

// import java.util.*;
// import java.time.*;

// class Main {
//     public static void main(String args[]) {
//         LocalDate d1 = LocalDate.now();
//         System.out.println(d1);

//         Scanner sc = new Scanner(System.in);
//         String s1=sc.nextLine();
//         LocalDate d2 = LocalDate.parse(s1);

//         if (d2.isBefore(d1)) {
//             System.out.println("It is before the current date");
//         }
//         else {
//             System.out.println("It is after the current date");
//         }
        
//         if (d2.isLeapYear()) {
//             System.out.println("It is a leap year");
//         }
//         else {
//             System.out.println("It is not a leap year");
//         }

//     }

// }


// Formatting and Parsing:
// Write a java program to format a LocalDate into the dd-MM-yyyy format.
// How do you parse a string date 2025-03-23 into a LocalDate object?

import java.util.*;
import java.time.*;

class Main {
    public static void main(String args[]) {
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        LocalDate d2 = LocalDate.parse(s1);

        int d3=d2.getDayOfMonth()



    }
}








// Custom Date Calculations
// Write a Java program to find the number of days between two LocalDate objects.
// How can you get the day of the week for a specific LocalDate?
