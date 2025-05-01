// Some pre-defined methods in java

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String targetString = "Java is fun to learn";
        String str1 = "JAVA";
        String str2 = "Java";
        String str3 = " Hello Java ";

        System.out.println("Checking Length: " + targetString.length());

        char[] charArray = str2.toCharArray();
        System.out.println("Size of char array: " + charArray.length);

        System.out.println("Printing last element of array: " + charArray[charArray.length - 1]);
    }
}