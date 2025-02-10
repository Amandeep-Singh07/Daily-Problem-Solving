````


<!--
I forgot to take screenshot of the image
The Question was to promt any day from a week and output the next day , and we have to solve this question using enum -->


public class Main {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        // Method to get the next day using switch
        public Day getNextDay() {
            switch (this) {
                case MONDAY:
                    return TUESDAY;
                case TUESDAY:
                    return WEDNESDAY;
                case WEDNESDAY:
                    return THURSDAY;
                case THURSDAY:
                    return FRIDAY;
                case FRIDAY:
                    return SATURDAY;
                case SATURDAY:
                    return SUNDAY;
                case SUNDAY:
                    return MONDAY;
                default:
                    return null; // This will never happen as all cases are covered
            }
        }
    }

    public static void main(String[] args) {
        try {
            // Create scanner object and read input
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String inputDay = scanner.nextLine();

            // Convert input to enum
            Day currentDay = Day.valueOf(inputDay.toUpperCase());

            // Get and print next day
            Day nextDay = currentDay.getNextDay();
            System.out.println(nextDay);

        } catch (IllegalArgumentException e) {
            // Handle invalid input
            System.out.println("Invalid Input");
        }
    }
}

```
````
