class Solution {
    public int[] productExceptSelf(int[] nums) {
        int cnt0 = 0;
        int[] ans = new int[nums.length];
        int pro = 1;
        for (int i:nums) {
            if(i==0){
                cnt0++;
            } else {
                pro = pro*i;
            }
        }
        if(cnt0  == 1){
            for(int k=0;k < nums.length;k++) {
                if (nums[k]==0){
                    ans[k] = pro;
                } else {
                    ans[k] = 0;
                }
            }
        }
        if(cnt0 == 0) {
            for (int j=0;j<nums.length;j++) {
                ans[j] = pro/nums[j];
            }
        }
        return ans;
    }
}  
