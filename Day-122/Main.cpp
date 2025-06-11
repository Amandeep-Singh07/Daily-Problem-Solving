#include <iostream>

// performed euclidean algorith 
// gcd(a,b)=gcd(a-b,b) where a>b and some logic

// time complexity is O(log min(a,b)) and log base will be phi because a%b not a%10.

class Solution {
    public:
        int GCD(int a,int b) {
    
            while(a>0 && b>0){
                if(a>b) a= a%b;
                else b=b%a;
            }
            if(a==0)return b;
            return a;
        }
    };