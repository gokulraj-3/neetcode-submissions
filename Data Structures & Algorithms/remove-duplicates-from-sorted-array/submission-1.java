class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        if(nums.length ==1) {
            return 1;
        }
        int ans = 1;
        int last = 1;
        for (int i=1;i<nums.length;i++) {
            if(nums[i] != nums[i-1]) {
                nums[last] = nums[i];
                last = last + 1;
                ans = last;
            }
        }
        return ans;
    }
}