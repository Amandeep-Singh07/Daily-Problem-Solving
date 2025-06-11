#include<iostream>
class Solution {
    public:
        int GCD(int n1,int n2) {
            int gcd=1;
            int smaller=n1;
            if(n1>n2){
                smaller=n2;
            }
            
    
            for(int i=1;i<=smaller;i++){
                if(n1%i==0 && n2%i==0){
                    gcd=i;
                }
            }
    
            return gcd;
        }
    };