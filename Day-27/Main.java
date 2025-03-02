import java.util.Scanner;

class StringManipulation {

    public static String concatenateUnique(String a, String b) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char currentChar = a.charAt(i);
            int index = sb.indexOf(String.valueOf(currentChar));

            if (index == -1) {
                sb.append(currentChar);
            }
        }
        for (int i = 0; i < b.length(); i++) {
            char currentChar = b.charAt(i);
            int index = sb.indexOf(String.valueOf(currentChar));

            if (index == -1) {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }


}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String concatenatedString = StringManipulation.concatenateUnique(firstString, secondString);
        System.out.println(concatenatedString);

        scanner.close();
    }
}
