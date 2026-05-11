class Solution {
    public int maxSubArray(int[] nums) {
        int curr = Integer.MIN_VALUE;
        int max = curr;
        for (int i:nums) {
            if (curr <= 0) {
                curr = i;
            } else {
                curr = curr + i;
            }
            max = Math.max(curr,max);
        }
        return max;
    }
}
