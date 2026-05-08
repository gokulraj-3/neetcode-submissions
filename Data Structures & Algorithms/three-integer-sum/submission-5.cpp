class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size() - 1;
        vector<vector<int>> ans;
        sort(nums.begin(), nums.end());
        for(int i = 0; i <= n; i++){
            int j = i + 1;
            int k = n;
            if(i>0 && nums[i]==nums[i-1]) continue;
            int target = -1 * nums[i];
            // -2,0,0,2,2
            while(j < k){
                vector<int> temp;
                if(nums[j] + nums[k] == target){
                    temp.push_back(nums[i]);
                    temp.push_back(nums[j]);
                    temp.push_back(nums[k]);
                    
                    while(nums[j]==nums[j+1] && j < n-1) j++;
                    while(nums[k]==nums[k-1] && k > 0) k--;

                    j++, k--;
                    
                    ans.push_back(temp);
                }

                if(nums[j] + nums[k] < target) j++;
                if(nums[j] + nums[k] > target) k--;
            }
        }
        return ans;
    }
};
