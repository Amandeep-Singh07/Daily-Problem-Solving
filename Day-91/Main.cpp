class Solution {
    public:
        int findMaxConsecutiveOnes(vector<int>& nums) {
            int maxCount = 0;
            int count = 0;
    
            for(int num : nums) {
                if(num == 1) {
                    count++;
                    maxCount = max(maxCount, count);
                } else {
                    count = 0;
                }
            }
    
            return maxCount;
        }
    };