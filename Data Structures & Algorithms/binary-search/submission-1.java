class Solution {
    public int search(int[] nums, int target) {
        return helpSearch(nums, 0, nums.length-1, target);
    }

    public int helpSearch(int[] nums, int l, int u, int target){
        if (l > u) return -1;
        int m = (l+u)/2;
        if (nums[m] == target){
            return m;
        } 
        else if(nums[m] > target) {
            return helpSearch(nums, l, m-1, target);
        } 
        else {
            return helpSearch(nums, m+1, u, target);
        }
    }
}
