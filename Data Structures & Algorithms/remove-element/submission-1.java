class Solution {
    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = 0;
        while(l<nums.length) {
            if(nums[l] != val) {
                nums[r] = nums[l];
                r++;
            }
            l++;
        }
        return r;
    }
}