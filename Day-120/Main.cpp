// is prime or not
#include <iostream>
class Solution {
    public:
        bool isPrime(int n) {
            if(n<2)return false;
            if(n==2){
                return true;
            }
            int flag=1;
            for(int i=2;i*i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            
    
            return true;
        }
    };