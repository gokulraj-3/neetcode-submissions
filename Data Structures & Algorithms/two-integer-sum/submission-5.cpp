class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int> mp;
        for(int i = 0; i<nums.size(); i++){
            mp[nums[i]] = i+1;
        }
        for(int i = 0; i<nums.size(); i++){
            int diff = target - nums[i];
            if(mp[diff] && mp[diff]!= i+1){
                return {i,mp[diff] - 1};
            }
        }


    }
};
