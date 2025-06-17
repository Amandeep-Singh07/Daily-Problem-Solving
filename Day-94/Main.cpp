class Solution {
    public:
        void moveZeroes(vector<int>& nums) {
             int nonZeroIndex = 0;  
            
            for (int i = 0; i < nums.size(); i++) {
                if (nums[i] != 0) {
                    nums[nonZeroIndex++] = nums[i];
                }
            }
            
            for (int i = nonZeroIndex; i < nums.size(); i++) {
                nums[i] = 0;
            }
        }
    };