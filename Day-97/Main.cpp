class Solution {
    public:
        bool check(vector<int>& nums) {
            int count = 0;
            int n = nums.size();
            
            for(int i = 0; i < n; i++) {
                // compare current element with next (circularly)
                if(nums[i] > nums[(i + 1) % n]) {
                    count++;
                }
            }
            
            return count <= 1;
        }
    };