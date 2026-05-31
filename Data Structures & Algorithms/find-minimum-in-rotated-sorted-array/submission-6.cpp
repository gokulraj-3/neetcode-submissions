class Solution {
public:
    int findMin(vector<int> &nums) {
        int low = 0;
        int high = nums.size() - 1;
        int ans = INT_MAX;
        while(low <= high){
            int mid = (low + high) / 2;
            //Is left sorted?
            if(nums[low] <= nums[mid]){
                ans = min(ans,nums[low]);
                low = mid + 1;
            }
            else{
                high = mid - 1;
                ans = min(ans, nums[mid]);
            }

        }
        return ans;
    }
};
//
//5 1 2 3 4
//L   M   H
//      L M H

