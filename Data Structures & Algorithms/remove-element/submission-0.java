class Solution {
    public int removeElement(int[] nums, int val) {
        int p = 0;
        int k = 0;
        for(int i:nums) {
            if(i!=val){
                nums[p] = i;
                p++;
            }
        }
        return p;
    }
}