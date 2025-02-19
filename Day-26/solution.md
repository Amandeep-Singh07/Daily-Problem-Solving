<img src="image2.png">

```
// remove duplicates from the String

import java.util.Scanner;

class RemoveDuplicatesUtility {
    public static String removeDuplicates(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        
        StringBuilder result = new StringBuilder();   // result object is created , why we have not used a empty string here ? because it is not a good approach as we know strings in java are immutable and every time it will create a new object and if we will make a StringBuilder , it is mutable ...
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Check if the character is already in our result
            int index = result.indexOf(String.valueOf(currentChar));  // String.valueOf() function convert each value in a string a
            
            // If we haven't seen this character before, add it
            if (index == -1) {
                result.append(currentChar);
            }
        }
        
        return result.toString();  // as result was a object now we want to return a string , so we have changed it into a string by .toString()
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        String result = RemoveDuplicatesUtility.removeDuplicates(userInput);  // from this line we understood that we have to create a static method
        System.out.println(result);

        scanner.close();
    }
}

```