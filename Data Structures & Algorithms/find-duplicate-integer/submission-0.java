class Solution {
    public int findDuplicate(int[] nums) {
        for(int n:nums) {
            if(nums[Math.abs(n)] < 0) {
                return Math.abs(n);
            }
            nums[Math.abs(n)] = -1*nums[Math.abs(n)];
        }
        return -1;
          }
}
