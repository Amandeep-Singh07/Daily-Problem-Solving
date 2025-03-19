// # Problem Statement



// # Ted, the computer science enthusiast, has accepted the challenge of writing a program that checks if the number of digits in an integer matches the sum of its digits.



// # Guide Ted in designing and writing the code to solve this problem using a 'do-while' loop. 

// # Input format :
// # The input consists of an integer N, representing the number to be checked.

// # Output format :
// # If the sum is equal to the number of digits, print "The number of digits in N matches the sum of its digits."

// # Else, print "The number of digits in N does not match the sum of its digits."



// # Refer to the sample output for formatting specifications.

// # Code constraints :
// # 1 ≤ N ≤ 106

// # Sample test cases :
// # Input 1 :
// # 20
// # Output 1 :
// # The number of digits in 20 matches the sum of its digits.
// # Input 2 :
// # 34
// # Output 2 :
// # The number of digits in 34 does not match the sum of its digits.


import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        int num1=num;
        int a;
        int count=0;
        int sum=0;
        do{
            a=num%10;
            sum+=a;
            count++;
            num/=10;
        }while(num>0);
        
        if(sum==count){
            System.out.println("The number of digits in "+num1+" matches the sum of its digits.");
            
        }
        else{
            System.out.println("The number of digits in "+num1+" does not match the sum of its digits.");
            
        }
    }
}