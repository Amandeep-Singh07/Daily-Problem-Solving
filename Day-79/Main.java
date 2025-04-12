import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lines of text (type 'exit' to quit):");
        while (true) {
            String line = scanner.nextLine();
            if ("exit".equalsIgnoreCase(line))  // this line will ignore the cases like exit ,ExiT,Exit 
                break;
            System.out.println("You wrote: " + line);
        }
        scanner.close(); // It's good practice to close the Scanner when you're done with it
        System.out.println("Exiting program.");
    }
}