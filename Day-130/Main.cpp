#include <iostream>
// Time Complexity of O(log(n))
class Solution {
    public:
        int bitwiseComplement(int n) {
    
            
            int temp=n;
            int mask=0;
            
            // remember this edge case
            if(temp ==0){
                return 1;
            }
    
            while(temp!=0){
                
              mask = (mask<<1) | 1;
              temp= temp>>1;
            }
            
            int ans=(~n)& mask;
            return ans;
    
            
        }
    };