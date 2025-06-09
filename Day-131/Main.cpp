#include <iostream>
// Time Complexity is O(1).
class Solution {
    public:
        bool isPowerOfTwo(int n) {
            for(int i=0;i<=30;i++){
                if(pow(2,i)==n)
                return true;
            }
            return false;
        }
    };