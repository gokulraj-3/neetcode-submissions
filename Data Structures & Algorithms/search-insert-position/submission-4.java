class Solution {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        int m = 0;
        while(i<=j) {
            m = i+(j-i)/2;
            if(nums[m] == target) {
                return m;
            }
            if(nums[m] > target) {
                j = m-1;
            }
            else {
                i = m+1;
            }
        }
        if(nums[m] > target) {
                return m;
            }
            else {
                return m+1;
            }
    }
}