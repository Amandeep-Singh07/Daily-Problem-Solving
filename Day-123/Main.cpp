#include <iostream>

class Solution {
    public:
        int fib(int n) {
            if(n<=1)
                return n;
    
            int c;
            int a = 0, b = 1;
    
            for(int i = 1; i<n; i++) {
                c = a+b;
                a = b;
                b = c;
            }
    
            return c;
        }
    };