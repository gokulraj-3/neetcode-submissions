class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashSet<Integer> hs = new HashSet();
        int i = 0;
        for (;i<nums.length;i++){
            if(hs.contains(target-nums[i])){
                break;
            } else {
                hs.add(nums[i]);
            }
        }
        int[] ans = new int[2];
        int j = 0;
        for (;j<nums.length;j++){
            if(nums[j]==target-nums[i]){
                break;
            }
        }
        ans[0] = j;
        ans[1] = i;
        return ans;
    }
}
