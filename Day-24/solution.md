<img src="image3.png">

```

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
    
    Scanner kash=new Scanner(System.in);
    
    int num=kash.nextInt();
    int arr[]=new int[num];
    
    
    for(int i=0;i<arr.length;i++){
        arr[i]=kash.nextInt();
    }
    
    for(int i=0;i<arr.length;i++){
        int sum=0;
        for(int j=i+1;j<arr.length;j++){
            sum+=arr[j];
        }
           if(arr[i]>sum){
               System.out.print(arr[i]+" ");
           }
            
        
    }
    
}
}

```



<img src="image1.png">

```

import java.util.Scanner;
// You are using Java
class ExpenseAnalyzer {
    
    public int calculateMaxRemainingBudget(int expenses []){
        int small=expenses[0];
        int sum=0;
         for (int i = 0; i < expenses.length; i++) {
            if(expenses[i] <small){
                small=expenses[i];
            }
            sum+=expenses[i];
         }
        
        int absSmall=Math.abs(small);
       
        return absSmall+sum;
        
     }
}

class MaxSumAfterDeletion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] expenses = new int[n];
        for (int i = 0; i < n; i++) {
            expenses[i] = scanner.nextInt();
        }

        ExpenseAnalyzer analyzer = new ExpenseAnalyzer();
        int maxRemainingBudget = analyzer.calculateMaxRemainingBudget(expenses);

        System.out.println(maxRemainingBudget);

        scanner.close();
    }
}

```




<img src="q5part1.png">
<img src="q5part2.png">

```

import java.util.Scanner;

class StringOps {
    // Method to reverse a single string
    public String manipulate(String[] input) {
        if (input.length == 1) {
            return reverse(input[0]);
        } else if (input.length == 2) {
            return concatenate(input[0], input[1]);
        } else {
            return "Invalid input";
        }
    }
    
    // Helper method to reverse a string
    private String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }
    
    // Helper method to concatenate two strings
    private String concatenate(String str1, String str2) {
        return str1 + str2;
    }
}

class Main {
    public static void main(String[] args) {
        StringOps seetha = new StringOps();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        String[] input_data = input.split(" ");
        String result = seetha.manipulate(input_data);
        System.out.println(result);
    }
}

```

<img src="q6part1.png">
<img src="q6part2.png">

```
import java.util.Scanner;

class EncoderDecoder {
    // Method to encode an array of strings into a single string
    public String encode(String[] messages) {
        if (messages == null || messages.length == 0) {
            return "";
        }
        
        StringBuilder encoded = new StringBuilder();
        
        // Append the first message without a delimiter before it
        encoded.append(messages[0]);
        
        // Append the remaining messages with a delimiter before each
        for (int i = 1; i < messages.length; i++) {
            encoded.append("#").append(messages[i]);
        }
        
        return encoded.toString();
    }
    
    // Method to decode a single string into an array of strings
    public String[] decode(String encoded) {
        if (encoded == null || encoded.isEmpty()) {
            return new String[0];
        }
        
        // Split the encoded string by the delimiter
        return encoded.split("#");
    }
}

class Main {
    public static void main(String[] args) {
        EncoderDecoder encoderDecoder = new EncoderDecoder();
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] messages = userInput.split(" ");
        String encoded = encoderDecoder.encode(messages);
        System.out.println("Encoded: " + encoded);
        String[] decoded = encoderDecoder.decode(encoded);
        System.out.println("Decoded: ");
        for (String message : decoded) {
            System.out.println(message);
        }

        scanner.close();
    }
}

```
