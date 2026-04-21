class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0){
            return nums;
        }
        int prod = 1;
        int cnt0=0;
        for(int i:nums){
            if(i!=0){
                prod=prod*i;
            } else {
                cnt0++;
            }

        }
        int[] ans = new int[nums.length];
        if(cnt0>1){
            return ans;
        }
        int j=0;
        for (int i:nums){
            if (i==0){
                ans[j]=prod;
            } 
            else if (cnt0==1) {
                ans[j]=0;
            }
            else {
                ans[j]=prod/i;
            }
            j++;
        }
        return ans;
    }
}