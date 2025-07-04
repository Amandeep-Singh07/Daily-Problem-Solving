//---> Leetcode question number 31
class Solution {
    public:
        void nextPermutation(vector<int>& nums) {
            int n = nums.size();
            int i = n - 2;
    
            // Step 1: Find the first decreasing element from the back
            while (i >= 0 && nums[i] >= nums[i + 1]) {
                i--;
            }
    
            if (i >= 0) {
                int j = n - 1;
                while (nums[j] <= nums[i]) {
                    j--;
                }
                swap(nums[i], nums[j]);
            }
    
            reverse(nums.begin() + i + 1, nums.end());
        }
    };