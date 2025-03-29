// How many days i have spent on this earth

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        LocalDate d1 = LocalDate.parse(s1);

       

        LocalDate d2 = LocalDate.now();
        

        long d3 = ChronoUnit.DAYS.between(d1, d2);
        System.out.println(d3);


    }
}