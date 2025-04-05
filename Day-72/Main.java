// Question
// ✅ Question:
// Write a Java program to calculate the number of working days (Monday to Friday) between two given dates.

// The program should:

// Accept two dates from the user in the format dd/MM/yyyy.

// Use Java's LocalDate API to parse and iterate between dates.

// Count and return the number of working days (i.e., exclude Saturdays and Sundays).

// The end date is exclusive (i.e., working days are counted up to but not including the end date).

// Display the total number of working days.



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Scanner;

class DateUtil {
    public static int calculateWorkingDays(LocalDate startDate, LocalDate endDate) {
        int wd=0;
        while (startDate.isBefore(endDate)) {
            DayOfWeek dow = startDate.getDayOfWeek();
            if (dow != DayOfWeek.SATURDAY && dow != DayOfWeek.SUNDAY) {
                wd++;
            }
            startDate = startDate.plusDays(1);
        }
        System.out.println(wd);
        return wd;
    }
}

class Main{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String startDateStr = scanner.nextLine().trim();
        LocalDate startDate = LocalDate.parse(startDateStr, formatter);

        String endDateStr = scanner.nextLine().trim();
        LocalDate endDate = LocalDate.parse(endDateStr, formatter);

        int workingDays = DateUtil.calculateWorkingDays(startDate, endDate);
    }
}