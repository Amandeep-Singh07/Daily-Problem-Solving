// import java.util.Scanner;

// class RemoveDuplicatesUtility {
//     public static String removeDuplicates(String input) {
//         if (input == null || input.isEmpty()) {
//             return input;
//         }

//         StringBuilder result = new StringBuilder(); // result object is created , why we have not used a empty string
//                                                     // here ? because it is not a good approach as we know strings in
//                                                     // java are immutable and every time it will create a new object and
//                                                     // if we will make a StringBuilder , it is mutable ...

//         for (int i = 0; i < input.length(); i++) {
//             char currentChar = input.charAt(i);

//             // Check if the character is already in our result
//             int index = result.indexOf(String.valueOf(currentChar)); // String.valueOf() function convert each value in
//                                                                      // a string a

//             // If we haven't seen this character before, add it
//             if (index == -1) {
//                 result.append(currentChar);
//             }
//         }

//         return result.toString(); // as result was a object now we want to return a string , so we have changed it
//                                   // into a string by .toString()
//     }
// }

// class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         String userInput = scanner.nextLine();
//         String result = RemoveDuplicatesUtility.removeDuplicates(userInput); // from this line we understood that we
//                                                                              // have to create a static method
//         System.out.println(result);

//         scanner.close();
//     }
// }


import java.util.Scanner;
class RemoveDuplicatesUtility {
    
        public static String removeDuplicates(String userInput){
            StringBuilder sb=new StringBuilder();

            for(int i=0;i<userInput.length();i++){
                char currentChar=userInput.charAt(i);
                int index= sb.indexOf(String.valueOf(currentChar));

                if(index==-1){
                    sb.append(currentChar);
                }
            }
            return sb.toString();

        

    }
}
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String result = RemoveDuplicatesUtility.removeDuplicates(userInput);
        System.out.println(result);
        scanner.close();
    }
}

/*
  int index = sb.indexOf(String.valueOf(currentChar));

  currentChar: This is a single character from your input string.

  String.valueOf(currentChar): This converts the character into a string. The
  indexOf method needs a string to search for.

  sb.indexOf(...): Here, sb is a StringBuilder that holds the characters you
  have added so far. The indexOf method looks for the string version of
  currentChar in sb.

  int index: The result is stored in the integer variable index. If the
  character is found, index will be the position of its first occurrence in sb.
  If it is not found, indexOf returns -1.
  
  In simple terms, this line checks if the current character is already in the
  string you are building. If index is -1, it means the character isn't there
  yet, and you can add it.
  
  
 */