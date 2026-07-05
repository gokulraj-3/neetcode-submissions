class Solution {
    public int search(int[] nums, int target) {
        return helper(0, nums.length-1, target, nums);
    }

    public int helper(int l, int r, int target, int[] nums) {
        int m = l+(r-l)/2;
        if (l > r) {
            return -1;
        }
        if (nums[m] == target) {
            return m;
        } 
        else if(nums[m] > target){
            return helper(l,m-1,target,nums);
        } 
        else {
            return helper(m+1, r, target,nums);
        }
    }

}
