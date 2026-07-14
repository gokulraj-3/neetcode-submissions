class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int k = 0;
        int sum = 0;
        int l = 0;
        for(int r = 0;r < nums.length;r++) {
            sum = sum + nums[r];
            while(sum >= target) {
                min = Math.min(min,r-l+1);
                k++;
                sum = sum - nums[l];
                l++;
            }
        }
        if(k > 0) {
            return min;
        } else {
            return 0;
        }
        
    }
}