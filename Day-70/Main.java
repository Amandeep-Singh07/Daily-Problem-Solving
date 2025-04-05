// Write a Java program that performs custom string replacement using StringBuilder.

// Your program should:

// Read three lines of input from the user:

// The original string.

// The substring to be replaced.

// The replacement string.

// Replace all occurrences of the substring (case-sensitive) with the replacement string using a StringBuilder (do not use String.replace() or regex).

// Print the original string and the modified string on separate lines.

// 🧪 Example Input:

// hello world, welcome to the world
// world
// universe

// ✅ Expected Output:

// hello world, welcome to the world
// hello universe, welcome to the universe


import java.util.Scanner;

class StringManipulation {

    public static String replaceWithStringBuider(String originalString, String toReplace, String replacement) {
        StringBuilder sb = new StringBuilder(originalString);

        int index = sb.indexOf(toReplace);
        while (index != -1) {
            sb.replace(index, index + toReplace.length(), replacement);
            index = sb.indexOf(toReplace, index + replacement.length());
        }
        return sb.toString();
    }
    
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String originalString = scanner.nextLine();
        String toReplace = scanner.nextLine();
        String replacement = scanner.nextLine();

        String replacedString = StringManipulation.replaceWithStringBuider(originalString, toReplace, replacement);

        System.out.println(originalString);
        System.out.println(replacedString);
    }
}