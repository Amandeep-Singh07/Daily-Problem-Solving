// Time complexity is O(log₁₀(x)).
class Solution {
    public:
        bool isPalindrome(int x) {
            int temp=x;
            long rev=0;
            while(x>0){
                int d=x%10;
    
                if(rev>INT_MAX/10) return false;
                if(rev<INT_MIN/10) return false;
                 
                 rev=rev*10+d;
    
                x/=10;
            }
            if(temp==rev) return true;
            else return false;
        }
    };