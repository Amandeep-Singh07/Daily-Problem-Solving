#include <iostream>

class Solution {
    public:
        vector<int> divisors(int n) {
            vector<int> arr;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    arr.push_back(i);
                }
            }
            return arr;
        }
    };