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

import java.time.*;

class Main {
    public static void main(String args[]) {
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);

        LocalDate d2 = d1.plusDays(10);
        System.out.println(d2);

        LocalDate d3 = d1.minusDays(3);
        System.out.println(d3);

    }

}


// Formatting and Parsing:
// Write a java program to format a LocalDate into the dd-MM-yyyy format.
// How do you parse a string date 2025-03-23 into a LocalDate object?








// Custom Date Calculations
