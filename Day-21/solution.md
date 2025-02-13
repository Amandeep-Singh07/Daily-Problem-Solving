<img src="image.png">

```

import java.util.Scanner;

public class Solution {
    
    
    static boolean isAnagram(String a, String b) {
        // Complete the function
        a=a.toLowerCase();  // remember strings are immutable in java so we have to  assign it with some variable
        b=b.toLowerCase();
        
        if(a.length()!=b.length()){
            return false;
        }
     int frequency[]=new int[26];  // created a new array to store the repetition of all the alphabets(a-z)
     
     for(int i=0;i<a.length();i++){
        char currentChar=a.charAt(i);
        frequency[currentChar-'a']++;
     }
     for(int i=0;i<b.length();i++){
        char currentChar=b.charAt(i);
        frequency[currentChar-'a']--;
     }
        
     for(int x : frequency){
        if(x!=0){
            return false;
        }
     }
        return true;
    }
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

```