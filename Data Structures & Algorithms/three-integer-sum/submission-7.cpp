class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        
        for(int i = 0; i < nums.size(); i++){
            //skip if current number is same as previous one
            if(nums[i] == nums[i - 1] && i > 0) continue;
            //consider an array from i+1 to size -1 and perform 2 sum
            int l = i + 1;
            int r = nums.size() - 1;
            //target would be nums[i] * -1 (multiplying -1 basically to handle negative integer)
            int target = -1 * nums[i];
            while(l < r){
                if(nums[l] + nums[r] == target){
                    ans.push_back({nums[i],nums[l],nums[r]});
                    l++;
                    r--;
                }
                if(nums[l] + nums[r] < target) l++;
                if(nums[l] + nums[r] > target) r--;
                while(nums[l] == nums[l - 1] && l < r && l > i + 1) l++;
                while(nums[r] == nums[r + 1] && r > l  && r < nums.size() - 2) r--;
            }
        }
        return ans;
    }
};
