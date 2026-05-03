class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int, int> dp;
        int n = nums.size() - 1;
        for(int i = 0;i<=n; i++){
            if(dp[nums[i]] == 1){
                return true;
            }
            dp[nums[i]] = 1;
        }
        return false;
    }
};