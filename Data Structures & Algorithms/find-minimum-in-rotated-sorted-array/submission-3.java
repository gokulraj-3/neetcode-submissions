class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int h = nums.length-1;
        if (nums[l] <= nums[h]) return nums[l];
        while(l<=h) {
            int m = (l+h)/2;
            if (m > 0 && nums[m] < nums[m-1]) {
                return nums[m];
            }
            if (nums[m] > nums[h]) {
                l = m+1;
            } else {
                h = m-1;
            }
        }
        return nums[l];
    }
}