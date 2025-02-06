<img src=question.png>

```

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        
        for(int i=1;i<=w;i++){
          int a=sc.nextInt();
           int b=sc.nextInt();
           int n=sc.nextInt();
           
           int value=a;   // Not necessary
           for(int j=0;j<n;j++){
            value+=Math.pow(2,j)*b;  // Using Math.pow function where 2 is  number and j is the power
            System.out.print(value+" ");  
           }
           System.out.println();
           
        }
  
    }
}

```
