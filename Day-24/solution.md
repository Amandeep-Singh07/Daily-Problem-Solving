<img src="image.png">

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