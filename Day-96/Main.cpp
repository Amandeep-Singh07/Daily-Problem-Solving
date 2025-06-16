class Solution {
    public:
        void rotate(vector<int>& nums, int k) {
            int n = nums.size();
            k = k % n;  // Handle k > n
    
            auto reverse = [](vector<int>& arr, int start, int end) {
                while (start < end) {
                    swap(arr[start++], arr[end--]);
                }
            };
    
            reverse(nums, 0, n - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, n - 1);
        }
    };