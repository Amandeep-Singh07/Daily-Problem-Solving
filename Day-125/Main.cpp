#include <iostream>
// Since my code uses map<int,int>, the time complexity is O(n log n). If i want O(n) time,i have to use unordered_map<int,int> instead.

class Solution {
    public:
        vector<int> twoSum(vector<int>& nums, int target) {
            
            map<int,int> mp;
            for (int i = 0; i < nums.size(); i++) {
                int remaining=target-nums[i];
    
                if(mp.find(remaining)!=mp.end()){
                    return {mp[remaining],i};
                }
                mp[nums[i]]=i;
            }
        
        return {};
        }
    };