class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        int res = nums[0];
        while(l<=h) {
            if (nums[l] < nums[h]){
                res = Math.min(nums[l],res);
                break;
            }
            int m = (l+h)/2;
            res = Math.min(nums[m],res);
            if (nums[m] >= nums[l]) {
                l = m+1;
            }
            else {
                h = m-1;
            }
        }
        return res;
    }
}
